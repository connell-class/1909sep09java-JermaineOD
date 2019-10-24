package re.controller;

import javax.servlet.http.HttpServletRequest;

public class LoginController {
	public static String login(HttpServletRequest req) {
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			String username = req.getParameter("username");

			String password = req.getParameter("password");
			System.out.println(username + "    " + password);

			if (username.equals("boyblue") && password.equals("topshotta")) {
				return "html/second.html";
			} else {
				return "html/third.html";

			}
		} else {
			return "html/index.html";
		}
	}
}
