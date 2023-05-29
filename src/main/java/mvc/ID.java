package mvc;

import javax.servlet.http.HttpServletRequest;

public interface ID {
	public abstract String execute(HttpServletRequest request) throws Exception;
}
