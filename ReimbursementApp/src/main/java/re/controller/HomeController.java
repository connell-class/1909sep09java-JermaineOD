package re.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class HomeController extends HttpServlet {

	public static String goHome(HttpServletRequest req) {
		System.out.println(req.getRequestURI());
		return "html/index.html";
	}
}
