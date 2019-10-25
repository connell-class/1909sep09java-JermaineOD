package ProjectOneDao;

import java.awt.List;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import ProjectOneModel.Reimbursement;
import ProjectOneModel.User;


public class driver {

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		
		ReimbursementDao r= new ReimbursementDao();
		
		ArrayList<Reimbursement> rl = new ArrayList<Reimbursement>();
		ObjectMapper om = new ObjectMapper();
	userDao ud = new userDao();
	User u = ud.getByUserName("mallym");
	System.out.println(u.toString());
	try {
	rl = r.getByStatusId(1);
	

		for(Reimbursement rr: rl) {
			
			System.out.println(rr.toString());
			
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}

	}
	
	
	

}
