package re.controller;

import javax.servlet.http.HttpServletRequest;

public class HomeController {

	public static String goHome(HttpServletRequest req) {
		System.out.println(req.getRequestURI());
		return "html/index.html";
	}
}
