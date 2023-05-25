package p01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/counter")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//セッション・オブジェクトを取得
		//なければ新しく生成し取得する。
		//あれば既存のものを取得する
		//HttpSession session = request.getSession();でもOK
		HttpSession session = request.getSession(true);
		
		//セッション・オブジェクトの中のキー「COUNT」の値を取得する
		Integer count = (Integer)session.getAttribute("COUNT");
		
		//キー「COUNT」がなければ初期値0を設定する。
		if (count == null) {
			count = 0;
		}
		
		count++; //カウントアップする
		
		//セッション・オブジェクトにキー「COUNT」でカウント値を設定する
		session.setAttribute("COUNT", count);
		
		//Webブラウザへのお知らせ情報
		response.setContentType("text/html; charset=UTF-8");
		
		//WebブラウザにHTMLを送るための道（ストリーム：流れ）を作る
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>カウンター</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("セッションID：" + session.getId() + "<br>");
		out.println("カウント値：" + count + "<br>");
		out.println("<a href='/jmaster_git/counter'>カウントアップ</a><br>");
		out.println("</body>");
		out.println("</html>");
	}

}
