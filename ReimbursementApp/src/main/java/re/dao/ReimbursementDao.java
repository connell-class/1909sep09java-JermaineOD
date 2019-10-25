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
		
		public List<Reimbursement> getById(int id) throws ClassNotFoundException {// select all reimbursement that are pending
			List<Reimbursement> list = new ArrayList<>();
			String username = "jdbc_user";
			String password = "password";
			String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
			
			  //Class.forName("org.postgressql.Driver");
			try ( Connection conn = DriverManager.getConnection(url,username,password)){
				String sql="select * from reimbursement where status_id =?";	// 10 = to pending
				PreparedStatement ps = conn.prepareStatement(sql);
				//ps.setInt(2, id);
				ResultSet rs = ps.executeQuery();
				//Reimbursement s = null;
				while(rs.next()) {
				list.add(new Reimbursement(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9)));
					
				}
		return list;
				
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}

		public List<Reimbursement> getByAll() throws ClassNotFoundException {// select all reimbursements
			List<Reimbursement> list = new ArrayList<>();
			String username = "jdbc_user";
			String password = "password";
			String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
			
			  //Class.forName("org.postgressql.Driver");
			try ( Connection conn = DriverManager.getConnection(url,username,password)){
				String sql="select * from reimbursement";
				PreparedStatement ps = conn.prepareStatement(sql);
				//ps.setInt(2, id);
				ResultSet rs = ps.executeQuery();
				//Reimbursement s = null;
				while(rs.next()) {
				list.add(new Reimbursement(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9)));
					
				}
		return list;
				
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}

		public int sumbitReimburse(Reimbursement re) throws ClassNotFoundException {
			int rowsaffected =0;
			
			String username = "jdbc_user";
			String password = "password";
			String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
			
			 // Class.forName("org.postgressql.Driver");
			  
			  
			  
			
			  try(Connection conn = DriverManager.getConnection(url,username,password)){
				String sql="insert into reimbursement values(?,?,?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				Calendar cal = Calendar.getInstance();
				
				//ps.setInt(1, 11);
				ps.setInt(1, re.getRe_amount());
				ps.setTimestamp(2,null);
				ps.setTimestamp(3, null);
				ps.setString(4, re.getRe_info());
				ps.setInt(5, re.getRe_creator());
				ps.setInt(6,  0);
				ps.setInt(7, 10);
				ps.setInt(8, re.getType_id());
				
				ps.executeUpdate();
				
				
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
			
			return 1;
		}
		
	}


		
	
	

		
		


