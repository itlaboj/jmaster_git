package mvc;

import javax.servlet.http.HttpServletRequest;

public class YoshidaBean implements ID {
	//加算処理結果を返す
	public String execute(HttpServletRequest request) throws Exception {
		//リクエスト情報を取得
		int x = Integer.parseInt(request.getParameter("DATA1"));
		int y = Integer.parseInt(request.getParameter("DATA2"));
		
		int result = x + y;
		
		request.setAttribute("RESULT", result);
		
		return "/mvc/koremura.jsp";
	}
}
