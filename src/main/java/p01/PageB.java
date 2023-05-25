package p01;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/pageB")
public class PageB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//セッション・スコープ
		HttpSession session = request.getSession(true);
		String name = (String)session.getAttribute("NAME");
		
		//アプリケーション・スコープ
		ServletContext application = getServletContext();
		String company = (String)application.getAttribute("COMPANY");

		//リクエスト・スコープ
		Integer age = (Integer)request.getAttribute("AGE");
		
		//Webブラウザへのお知らせ情報
		response.setContentType("text/html; charset=UTF-8");
		
		//WebブラウザにHTMLを送るための道（ストリーム：流れ）を作る
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スコープ</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("セッション・スコープ：" + name + "<br>");
		out.println("アプリケーション・スコープ：" + company + "<br>");
		out.println("リクエスト・スコープ：" + age + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
