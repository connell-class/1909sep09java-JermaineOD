package re.controller;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {


		public static String process(HttpServletRequest req) {

			switch (req.getRequestURI()) {
			case "/ReimbursementApp/home.go":
				return HomeController.goHome(req);
			case "/ReimbursementApp/login.go":
				return LoginController.login(req);
			case "/ReimbursementApp/log.go":
				return LoginController.logIn(req);
			default:
			return "html/index.html";
			}
		}

	}
