package re.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import re.dao.ReimbursementDao;
import re.model.Reimbursement;

@WebServlet("/submitReimburse")
public class SubmitReimbursement extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int reid = 0;
		int amount = Integer.parseInt(req.getParameter("amount"));
		String ts = "";
		String ts2 = "";
		int receipt =0;
		String info = req.getParameter("re_description");
		int creator = Integer.parseInt(req.getParameter("re_author"));
		int resolver = 2;
		int status = Integer.parseInt(req.getParameter("status_id"));
		int type = Integer.parseInt(req.getParameter("type_id"));
		
		Reimbursement re = new Reimbursement(amount,ts,ts2,0,info,creator,resolver,status,type);
		
		ReimbursementDao rd = new ReimbursementDao();
		
	}
	
	
	
	

}
