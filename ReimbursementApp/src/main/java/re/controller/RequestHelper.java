package re.controller;

import javax.servlet.http.HttpServletRequest;

import re.dao.ReimbursementDao;

public class RequestHelper {


		public static String process(HttpServletRequest req) {

			System.out.println("this is the uri " +req.getRequestURI());
			switch (req.getRequestURI()) {
			case "/ReimbursementApp/home.go":
				return HomeController.goHome(req);
				
			case "/ReimbursementApp/login.go":
				return LoginController.LogIn(req);
				
			case "/ReimbursementApp/log.go":
				return LoginController.LogginIn(req);
				
			case "/ReimbursementApp/all.go":
				return LoginController.LogIn(req);
				
			case "/ReimbursementApp/getall.go":
				return LoginController.LogIn(req);
				
			case "/ReimbursementApp/register.go":
				return RegisterController.toRegister(req);
				
			case "/ReimbursementApp/submit.go":
				return RegisterController.RegisterUser(req);
			
			default:
			return "html/third.html";
			}
		}

	}
