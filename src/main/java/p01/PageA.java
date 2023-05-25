package p01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/pageA")
public class PageA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//セッション・スコープ
		HttpSession session = request.getSession(true);
		session.setAttribute("NAME", "山田太郎");
		
		//アプリケーション・スコープ
		ServletContext application = getServletContext();
		application.setAttribute("COMPANY", "IDグループ");
		
		//リクエスト・スコープ
		request.setAttribute("AGE", 23);
		
		//フォワード処理
		RequestDispatcher rd = request.getRequestDispatcher("/pageB");
		rd.forward(request, response);
		
//		//Webブラウザへのお知らせ情報
//		response.setContentType("text/html; charset=UTF-8");
//		
//		//WebブラウザにHTMLを送るための道（ストリーム：流れ）を作る
//		PrintWriter out = response.getWriter();
//		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>スコープ</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<a href='/jmaster_git/pageB'>ページBへ</a><br>");
//		out.println("</body>");
//		out.println("</html>");
	}

}
