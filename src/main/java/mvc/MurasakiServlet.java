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
		
		//ACTIONの情報を取得
		String action = request.getParameter("ACTION");
		
		ID id = null;
		String page = "";
		
		try {
			if (action.equals("tasu")) {
				id = new YoshidaBean();
				//page = id.execute(request);
			} else if (action.equals("hiku")) {
				id = new AraiBean();
				//page = id.execute(request);
			}
			
			page = id.execute(request);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//表示処理（是村さんにやらせる）
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
