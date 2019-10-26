package re.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import re.model.Reimbursement;


public class ReimbursementDao {
	
	

		static {
			try {
				Class.forName("org.postgresql.Driver");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
				}
		}
		
		public List<Reimbursement> getById(int id) throws ClassNotFoundException {// select all reimbursement by id (employees and Managers)
			List<Reimbursement> list = new ArrayList<>();
			String username = "jdbc_user";
			String password = "password";
			String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
			
			  //Class.forName("org.postgressql.Driver");
			try ( Connection conn = DriverManager.getConnection(url,username,password)){
				String sql="select * from reimbursement where status_id =?";	// 10 = to pending
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				//Reimbursement s = null;
				while(rs.next()) {
				list.add(new Reimbursement(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10)));
					
				}
		return list;
				
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}

		public List<Reimbursement> getByAll() throws ClassNotFoundException {// select all reimbursements (Managers ONLY!!!)
			List<Reimbursement> list = new ArrayList<>();
			String username = "jdbc_user";
			String password = "password";
			String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
			
			  //Class.forName("org.postgressql.Driver");
			try ( Connection conn = DriverManager.getConnection(url,username,password)){
				String sql="select * from reimbursement";
				PreparedStatement ps = conn.prepareStatement(sql);
		
				ResultSet rs = ps.executeQuery();
				//Reimbursement s = null;
				while(rs.next()) {
				list.add(new Reimbursement(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10)));
					
				}
		return list;
				
			}catch (SQLException e) {
				e.printStackTrace();
				return list;
			}
		}

		public String sumbitReimburse(Reimbursement re) throws ClassNotFoundException {//submit a reimbursement(employee and Managers) 
			int rowsaffected =0;
			
			String username = "jdbc_user";
			String password = "password";
			String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
			
			 // Class.forName("org.postgressql.Driver");
			  
			  
			  
			
			  try(Connection conn = DriverManager.getConnection(url,username,password)){
				String sql="insert into reimbursement(re_amount,re_submitted,re_receipt,re_description,re_author,status_id,type_id) values(?,?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				Calendar cal = Calendar.getInstance();
				
				//ps.setInt(1, 1);
				ps.setInt(1, re.getRe_amount());
				ps.setString(2,"10/26/2019_07:47 am");
				//ps.setString(4, null);
				ps.setInt(3, 0);
				ps.setString(4, re.getRe_info());
				ps.setInt(5, re.getRe_creator());
				//ps.setInt(8,  2);
				ps.setInt(6, 10);
				ps.setInt(7, re.getType_id());
				
				ps.executeUpdate();
				
				
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
			
			return "rowsaffected";
		}
		
	}


		
	
	

		
		


