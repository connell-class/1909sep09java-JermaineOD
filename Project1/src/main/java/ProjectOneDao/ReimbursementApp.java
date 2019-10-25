package ProjectOneDao;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ProjectOneModel.Reimbursement;

public class ReimbursementApp extends  HttpServlet{
	
	public void viewer(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException {
		
		ReimbursementDao r= new ReimbursementDao();
		ArrayList<Reimbursement> rl = new ArrayList<Reimbursement>();
		ObjectMapper om = new ObjectMapper();
		
		
	try {
	rl = r.getByStatusId(1);
	

		for(Reimbursement rr: rl) {
			
		res.getWriter().write(om.writeValueAsString(rr));	
		System.out.println(rr.toString());
			
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}
	}

}
