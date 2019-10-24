package re.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionHandler {

	public static String process(HttpServletRequest req) {
		switch (req.getRequestURI()) {
		case "/ReimbursementApp/set.session":
			HttpSession session = req.getSession();
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			break;
		case "/ReimbursementApp/print.session":
			HttpSession current = req.getSession(false);
			String user = (String)current.getAttribute("username");
			String pass = (String)current.getAttribute("password");
			System.out.println(user+"    "+pass);
			break;
		case "/ReimbursementApp/invalidate.session":
			req.getSession().invalidate();
			break;
		default:
			break;
		}
		return "html/second.html";
	}
}
