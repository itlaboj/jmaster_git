package p01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReceiveServlet01
 */
@WebServlet("/receive01")
public class ReceiveServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiveServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		request.setCharacterEncoding("UTF-8");

		//リクエスト情報の取得
		String name = request.getParameter("NAMAE");
		String gender = request.getParameter("GENDER");
		String pref = request.getParameter("PREF");
		String[] food = request.getParameterValues("FOOD");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>受信側２</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("名前：" + name + "<br>");
		out.println("性別：" + gender + "<br>");
		out.println("都道府県：" + pref + "<br>");
		out.println("好きな食べ物：");
		
		if (food == null) { //チェックボックスにひとつもチェックが入っていない
			out.println("好きな食べ物が選択されていません。");
		} else {
			for (String f : food) {
				out.println(f + "　");
			}
		}
		
		out.println("<br>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
