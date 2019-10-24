package re.service;

import java.util.List;

import re.dao.UserDao;
import re.model.User;

public class AuthenticateUser {
	
	public String verifyUser( String uUsername, String uPassword) throws ClassNotFoundException{
	UserDao ud = new UserDao();
	User user = new User();
	
	
	ud.getByUsername(uUsername);
	String password =(user.getFirst_name().toString());
	System.out.println(password);
	
	
	
	return  password;
	}
	
	
	

	
	
	
	

}
