package re.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import re.model.User;

public class UserDao {
	static {
		try {
			Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
	}
	
	public List <User> getById(int userid) throws ClassNotFoundException {//get by user id
		List<User> u = new ArrayList<>();
		
		String username = "jdbc_user";
		String password = "password";
		String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
		
		  //Class.forName("org.postgressql.Driver");
		try ( Connection conn = DriverManager.getConnection(url,username,password)){
			String sql="select * from users where users_id ="+ userid;
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

public List <User> getAllUser() throws ClassNotFoundException {//get all users
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

public User getByUsername(String uUsername) throws ClassNotFoundException {//get by user's username
	//List<User> u = new ArrayList<>();
	
	
	String username = "jdbc_user";
	String password = "password";
	String url = "jdbc:postgresql://zoidjermaine.ci8enrbkkspq.us-east-2.rds.amazonaws.com:5432/project1";
	
	  Class.forName("org.postgressql.Driver");
	try ( Connection conn = DriverManager.getConnection(url,username,password)){
		String sql="select * from users where lower(username) =?"; //+"'"+uUsername+"'";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, uUsername);
		ResultSet rs = ps.executeQuery();
		User u = null;
		while(rs.next()) {
		u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
			
		}
return u;
		
	}catch (SQLException e) {
		e.printStackTrace();
		return null;
	}
}

public String getByLogin(String uUsername,String uPassword) throws ClassNotFoundException {//get by user's username
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
			return u.get(0).getUser_password().toString();
		}
	}catch (SQLException e) {
		e.printStackTrace();
		return "uu";
	}
	return "empty";
}


public int number(int index) {
	
	return ++index;
}
}




