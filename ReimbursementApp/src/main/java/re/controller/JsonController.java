package re.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import re.model.Reimbursement;

public class JsonController {

	public static void sendCats(HttpServletRequest req, HttpServletResponse res) {
	Reimbursement rem = new Reimbursement();
			
		ObjectMapper om = new ObjectMapper();
		
		
		try {
			res.getWriter().write(om.writeValueAsString(rem));
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
