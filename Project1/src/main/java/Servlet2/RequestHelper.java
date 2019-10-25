package Servlet2;

import javax.servlet.http.HttpServletRequest;

import Controller.EmployeeController;
import Controller.loginController;

public class RequestHelper {
	
	public static String process(HttpServletRequest req) throws ClassNotFoundException {
			switch(req.getRequestURI()) {
				
		case "/Project1/login.go":
			return loginController.login(req);
		case "/Project1/add.go":
			return EmployeeController.addReimbursement(req);
			
		case "/Project1/update.go":
			return "html/manager.html";

		case "/Project1/logout.go":
			return "html/index.html";
			
		default:
			
			return "html/index.html";
//			return "html/Reimbursements.html";
		}
		
		
	}

}
