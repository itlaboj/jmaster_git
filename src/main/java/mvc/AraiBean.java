package mvc;

import javax.servlet.http.HttpServletRequest;

public class AraiBean {
	//減算処理結果を返す
	public String hiku(HttpServletRequest request) throws Exception {
		//リクエスト情報を取得
		int x = Integer.parseInt(request.getParameter("DATA1"));
		int y = Integer.parseInt(request.getParameter("DATA2"));
		
		int result = x - y;
		
		request.setAttribute("RESULT", result);
		
		return "/mvc/taniguchi.jsp";
	}
}
