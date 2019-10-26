//package re.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import re.dao.ReimbursementDao;
//import re.model.Reimbursement;
//
//public class GetAllReimbursements extends HttpServlet {
//
//	
//	public static String getall ( HttpServletResponse resp) throws ServletException, IOException {
//		
//		String getA="";
//		int allNum =0;
//		
//		PrintWriter printer = resp.getWriter();
//		List<Reimbursement> r=null;
//		try {
//			r = new ReimbursementDao().getById(allNum);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		resp.setContentType("plain/text");
//		printer.println(r.toString());
//		return getA;
//		
//	}
//	
//	
//}


