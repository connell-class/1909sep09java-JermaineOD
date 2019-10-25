package ProjectOneDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

import ProjectOneModel.Reimbursement;



public class ReimbursementDao {


	static {
		try {
			Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
	}
	
	public ArrayList<Reimbursement> getByStatusId(int id) throws ClassNotFoundException {
		ArrayList<Reimbursement> RL = new ArrayList<Reimbursement>();
		String URL = "jdbc:postgresql://mydatabase.cqzwrx5bqbes.us-east-2.rds.amazonaws.com:5432/project1";
		String username = "jdbu";
		String password = "12345";
		
		  //Class.forName("org.postgressql.Driver");
		try ( Connection conn = DriverManager.getConnection(URL,username,password)){
			String sql="select users.first_name,users.last_name,reimbursement.re_id,reimbursement.re_amount,reimbursement.re_submitted,reimbursement.re_resolved,reimbursement.re_resolver,reimbursement.re_description,\r\n" + 
					"reimbursement_status.re_status,reimbursement_type.re_type \r\n" + 
					"from reimbursement join reimbursement_status on reimbursement.status_id=reimbursement_status.status_id\r\n" + 
					"join reimbursement_type on reimbursement_type.type_id=reimbursement.status_id join users on users.users_id=reimbursement.re_author \r\n" + 
					"where reimbursement_status.status_id =?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Reimbursement rb = null;
			while(rs.next()) {
				
				rb= new Reimbursement(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9),rs.getInt(10));
				RL.add(rb);
			}
			
	return RL;
			
		}catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	public void insertReimbursement(Reimbursement r) {
		String URL = "jdbc:postgresql://mydatabase.cqzwrx5bqbes.us-east-2.rds.amazonaws.com:5432/project1";
		String username = "jdbu";
		String password = "12345";
		try (Connection conn = DriverManager.getConnection(URL, username, password)) {
			String sql = "insert into reimbursement (re_amount,re_submitted,re_description,re_author,status_id,type_id) VALUES(?,?, ?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			Calendar cal = Calendar.getInstance();
			
			ps.setDouble(1, r.getAmount());
			
			ps.setTimestamp(2, new Timestamp(cal.getTime().getTime()));
			ps.setString(3, r.getDiscription());
			ps.setInt(4, r.getUserId());//get from session
			ps.setInt(5, r.getStatus_id());
			ps.setInt(6,r.getType());
			
			System.out.println(r.getDiscription());
			
			int x = ps.executeUpdate();
		} catch (SQLException e) {
			//Do nothing
			e.printStackTrace();
		}
	}
	
	
	
}
