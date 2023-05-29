package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MurasakiServlet
 */
@WebServlet("/murasaki")
public class MurasakiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MurasakiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		request.setCharacterEncoding("UTF-8");
		
		//リクエスト情報を取得
		int data1 = Integer.parseInt(request.getParameter("DATA1"));
		int data2 = Integer.parseInt(request.getParameter("DATA2"));
		
		//加算処理（吉田さんにやらせる）
		YoshidaBean y = new YoshidaBean();
		int result = y.tasu(data1, data2);
		
		//表示処理（是村さんにやらせる）
		request.setAttribute("RESULT", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/mvc/koremura.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}