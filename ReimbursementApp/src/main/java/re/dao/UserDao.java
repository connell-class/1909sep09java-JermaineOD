package re.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import re.model.Reimbursement;
import re.model.User;

public class UserDao {
	static {
		try {
			Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
	}
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public List <User> getAllUser() throws ClassNotFoundException {//get all users (Managers ONLY!!!)
		List<User> u = new ArrayList<>();
		
		
		String username = "jdbc_user";
		String password = "password";
		String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
		
		  //Class.forName("org.postgressql.Driver");
		try ( Connection conn = DriverManager.getConnection(url,username,password)){
			String sql="select * from users";
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			//User s = null;
			while(rs.next()) {
			u.add( new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
				
			}
	return u;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

//__________________________________________________________________________________________________________________________________________________________________________________________
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public User getById(String userid) throws ClassNotFoundException {//get by user id (employee and Manager)
		User u = new User();
		
		String username = "jdbc_user";
		String password = "password";
		String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
		
		  //Class.forName("org.postgressql.Driver");
		try ( Connection conn = DriverManager.getConnection(url,username,password)){
			String sql="select * from users where username =?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			ResultSet rs = ps.executeQuery();
			User s = null;
			while(rs.next()) {
			u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
			System.out.println(u);
			}
	return u;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

//__________________________________________________________________________________________________________________________________________________________________________________________
		
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public String registerEmployee(User us) throws ClassNotFoundException {//submit a reimbursement(employee and Managers) 
		int rowsaffected =0;
		
		String username = "jdbc_user";
		String password = "password";
		String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
		
		 // Class.forName("org.postgressql.Driver");
		  
		  
		  
		
		  try(Connection conn = DriverManager.getConnection(url,username,password)){
			String sql="insert into users(username,user_password,last_name,first_name,user_email,role_id) values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setInt(1, 1);
			ps.setString(1, us.getUsername());
			ps.setString(2, us.getUser_password());
			ps.setString(3, us.getLast_name());
			ps.setString(3, us.getFirst_name());
			ps.setString(4, us.getUser_email());
			ps.setInt(5, us.getRole_id());
		
			ps.executeUpdate();
			
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		
		return "rowsaffected";
	}
//__________________________________________________________________________________________________________________________________________________________________________________________























public int getByUsername(String uUsername) throws ClassNotFoundException {//get by user's username (employee and Managers)
	//List<User> u = new ArrayList<>();
	
	
	String username = "jdbc_user";
	String password = "password";
	String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
	
	  //Class.forName("org.postgressql.Driver");
	try ( Connection conn = DriverManager.getConnection(url,username,password)){
		String sql="select * from users where lower(username) ="+"'"+uUsername+"'";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, uUsername);
		ResultSet rs = ps.executeQuery();
		User u = null;
		while(rs.next()) {
		u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
			
		}
		
		
return u.getRole_id();
		
	}catch (SQLException e) {
		e.printStackTrace();
		return 11;
	}
}

public List<User> getByLogin(String uUsername,String uPassword) throws ClassNotFoundException {//get by user's username
	List<User> u = new ArrayList<>();
	
	
	String username = "jdbc_user";
	String password = "password";
	String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
	
	  //Class.forName("org.postgressql.Driver");
	try ( Connection conn = DriverManager.getConnection(url,username,password)){
		String sql="select * from users where lower(username) ="+"'"+uUsername+"'";
		PreparedStatement ps = conn.prepareStatement(sql);
		//ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		//User s = null;
		while(rs.next()) {
		u.add( new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			
		}
		if(!u.isEmpty()) {
			return u;
		}
	}catch (SQLException e) {
		e.printStackTrace();
		return u;
	}
	return u;
}


public int number(int index) {
	
	return ++index;
}
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//__________________________________________________________________________________________________________________________________________________________________________________________
	



