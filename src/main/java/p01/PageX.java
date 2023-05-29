package p01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		application.setAttribute("NAME", "IDグループ");
		
		//固定長配列
		int[] list1 = new int[] {10, 20, 30};
		
		//可変長配列（ArrayList）
		List<String> list2 = new ArrayList<>();
		list2.add("山中");
		list2.add("吉岡");
		list2.add("久保川");
		
		//可変長配列（HashMap）
		Map<String, String> map = new HashMap<>();
		map.put("k1", "新井");
		map.put("k2", "谷口");
		map.put("k3", "中田");
		
		//リクエスト・スコープ
		request.setAttribute("MAP", map);
		request.setAttribute("AGE", 23);
		request.setAttribute("MEMBER", m);
		request.setAttribute("LIST1", list1);
		request.setAttribute("LIST2", list2);
		
		//フォワード処理
		//RequestDispatcher rd = request.getRequestDispatcher("/page_y.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("/page_z.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/page_x.jsp");
		rd.forward(request, response);
	}

}
