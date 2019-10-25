package Service;

import ProjectOneDao.ReimbursementDao;
import ProjectOneModel.Reimbursement;

public class ReimbusementService {
	
	public  String createReimbursement(double amount,int userId, String comment, int rtype) {
		
		System.out.println("this is user serivces");		
		ReimbursementDao rd = new ReimbursementDao();
		Reimbursement r = new Reimbursement(amount,userId,comment,rtype);
			rd.insertReimbursement(r);
		
		
		
		
		
		
		return "html/Employee.html";
		
		
	}

}
