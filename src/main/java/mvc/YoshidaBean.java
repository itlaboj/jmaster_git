package mvc;

import javax.servlet.http.HttpServletRequest;

public class YoshidaBean {
	//加算処理結果を返す
	public String tasu(HttpServletRequest request) throws Exception {
		//リクエスト情報を取得
		int x = 0;
		int y = 0;
		
		try {
			x = Integer.parseInt(request.getParameter("DATA1"));
			y = Integer.parseInt(request.getParameter("DATA2"));
		} catch (Exception e) {
			request.setAttribute("ERROR_MESSAGE", "数値を入力してください");
			request.setAttribute("PAGE", "/mvc/tasu.jsp");
			throw new Exception();
		}
		
		int result = x + y;
		
		request.setAttribute("RESULT", result);
		
		return "/mvc/koremura.jsp";
	}
}
