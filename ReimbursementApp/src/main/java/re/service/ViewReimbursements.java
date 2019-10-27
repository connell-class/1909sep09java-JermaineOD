package re.service;

import java.util.ArrayList;
import java.util.List;

import re.dao.ReimbursementDao;
import re.model.Reimbursement;
import re.model.Reimbursement;

public class ViewReimbursements {
	
	



		
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------
			public List <Reimbursement> viewMyReimbursements(int userid) {
				List <Reimbursement> lre = new ArrayList<Reimbursement>();
				ReimbursementDao rd =new ReimbursementDao();
				Reimbursement re = new Reimbursement();
				
				try {
					lre =rd.getById(userid);
					
					
					
					
					
					
					
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
				
				return lre;
			}
			
			
			
			
			
			
			
			
			
			
			
		//__________________________________________________________________________________________________________________________________________________________________	
			
			
			
			
		}

		//------------------------------------------------------------------------------------------------------------------------------------------------------------------
			
		//__________________________________________________________________________________________________________________________________________________________________	
			
		
		
