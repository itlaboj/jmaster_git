package p01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		request.setCharacterEncoding("UTF-8");

		//リクエスト情報の取得
		String product = request.getParameter("PRODUCT");
		
		//セッション・オブジェクトを取得
		//なければ新しく生成し取得する。
		//あれば既存のものを取得する
		//HttpSession session = request.getSession();でもOK
		HttpSession session = request.getSession(true);
		
		//セッション・オブジェクトの中のキー「CART」の値を取得する
		@SuppressWarnings("unchecked") //警告を気にしなくていいよ！
		List<String> cart = (List<String>)session.getAttribute("CART");
		
		//キー「CART」がなければ空のArrayListを設定する。
		if (cart == null) {
			cart = new ArrayList<>();
		}
		
		cart.add(product); //商品を買い物かごに入れる
		
		//セッション・オブジェクトにキー「CART」で買い物かごを設定する
		session.setAttribute("CART", cart);
		
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
		out.println("買い物かごの中：" + "<br>");
		
		for (String p : cart) {
			out.println("・" + p + "<br>");
		}
		
		out.println("<a href='/jmaster_git/shop.html'>商品一覧に戻る</a><br>");
		out.println("</body>");
		out.println("</html>");
	}

}
