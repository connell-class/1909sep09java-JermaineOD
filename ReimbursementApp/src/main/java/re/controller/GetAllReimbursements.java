package re.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import re.service.ViewReimbursements;
import re.model.Reimbursement;

public class GetAllReimbursements extends HttpServlet {

	
	public static String getall ( HttpServletResponse resp) throws ServletException, IOException {
		
		String getA="";
		int allNum =2;
		ViewReimbursements vrem = new ViewReimbursements();
		
		PrintWriter printer = resp.getWriter();
		List<Reimbursement> lre=null;
		
			 vrem.viewMyReimbursements(allNum).get(1).toString();

			resp.setContentType("plain/text");
			printer.println(lre.get(0));
		
		return getA = lre.get(0).getRe_info();
		
	}
	
	
}


