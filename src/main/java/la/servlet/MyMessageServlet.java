package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyMessageServlet
 */
@WebServlet("/MyMessageServlet")
public class MyMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyMessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		request.setCharacterEncoding("UTF-8");
		
		//リクエスト情報取得
		String message = request.getParameter("MESSAGE");
		String size = request.getParameter("SIZE");
		
		String display = "メッセージが入力されていません。";
		
		if (message != "") {
			display = "<h" + size + ">" + message + "</h" + size + ">";
		}
		
			
		//Webブラウザへのお知らせ情報
		response.setContentType("text/html; charset=UTF-8");
		
		//WebブラウザにHTMLを送るための道（ストリーム：流れ）を作る
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>４章確認問題（１）</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(display);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
