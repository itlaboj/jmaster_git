package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p01.Human;

/**
 * Servlet implementation class MyMessageServlet
 */
@WebServlet("/CustomerServlet2")
public class CustomerServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet2() {
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
		String action = request.getParameter("action");
		
		if (action.equals("confirm") == false) {
			return;
		}
		
		String display = "<h1>名前、住所、電話番号を登録してください</h1>";
		
		//セッション・オブジェクトを取得
		HttpSession session = request.getSession(true);
		
		//セッション・オブジェクトからHuman情報取得
		Human human = (Human)session.getAttribute("human");
		
		if (human != null) {
			String name = human.getName();
			String address = human.getAddress();
			String tel = human.getTel();
			
			display = "名前：" + name + "<br>";
			display += "住所：" + address + "<br>";
			display += "電話：" + tel + "<br>";
		}
		
		//Webブラウザへのお知らせ情報
		response.setContentType("text/html; charset=UTF-8");
		
		//WebブラウザにHTMLを送るための道（ストリーム：流れ）を作る
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>６章確認問題（２）</title>");
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
		//文字化け対策
		request.setCharacterEncoding("UTF-8");
		
		//リクエスト情報取得
		String name = request.getParameter("NAME");
		String address = request.getParameter("ADDRESS");
		String tel = request.getParameter("TEL");
		
		//JavaBeansに名前、住所、電話を登録
		Human human = new Human(name, address, tel);
		
		String display = "<h1>登録しました！</h1>";
		
		//セッション・オブジェクトを取得
		HttpSession session = request.getSession(true);
		
		//セッション・オブジェクトに記録
		session.setAttribute("human", human);
			
		//Webブラウザへのお知らせ情報
		response.setContentType("text/html; charset=UTF-8");
		
		//WebブラウザにHTMLを送るための道（ストリーム：流れ）を作る
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>６章確認問題（２）</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(display);
		out.println("</body>");
		out.println("</html>");
	}

}
