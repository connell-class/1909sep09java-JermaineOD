package Controller;

import javax.servlet.http.HttpServletRequest;

import Service.ReimbusementService;

public class EmployeeController {

	public static String addReimbursement(HttpServletRequest req) throws ClassNotFoundException  {
		
		//get use id from session
		 int userid=1;
		
		
		String amt= req.getParameter("amount");
		String rt= req.getParameter("rtype");
		String comment= req.getParameter("comment");
		double amount = Double.parseDouble(amt);
		int rtype = Integer.parseInt(rt);
		
		
		
		ReimbusementService rs= new ReimbusementService();
		rs.createReimbursement(amount, userid, comment, rtype);
			
		
		 System.out.println("Employee controller"+amount);	
		return rs.createReimbursement(amount, userid, comment, rtype);
		
		
		
	}
	
}
