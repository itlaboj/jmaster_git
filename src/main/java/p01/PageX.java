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
@WebServlet("/pageX")
public class PageX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageX() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member m = new Member(10, "佐藤次郎", 30);
		
		//セッション・スコープ
		HttpSession session = request.getSession(true);
		session.setAttribute("NAME", "山田太郎");
		
		//アプリケーション・スコープ
		ServletContext application = getServletContext();
		application.setAttribute("COMPANY", "IDグループ");
		
		//リクエスト・スコープ
		request.setAttribute("AGE", 23);
		request.setAttribute("MEMBER", m);
		
		//フォワード処理
		RequestDispatcher rd = request.getRequestDispatcher("/page_y.jsp");
		rd.forward(request, response);
	}

}
