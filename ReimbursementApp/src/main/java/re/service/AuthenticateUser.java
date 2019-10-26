package re.service;

import java.util.List;

import re.dao.UserDao;
import re.model.User;

public class AuthenticateUser {
	
	String routing ="rounting";
	
	public String verifyUser( String uUsername, String uPassword) throws ClassNotFoundException{
	UserDao ud = new UserDao();
	User user = new User();
	
	user = ud.getById(uUsername.toLowerCase());
	
	if(user.getUsers_id() <= 0) {
		System.out.println("Username not found");
	}
	else if(uPassword.equals(user.getUser_password())) {
		System.out.println("User "+uUsername+ " has been verified!");
		
	}
	
//	ud.getByUsername(uUsername);
//	String password =(user.getFirst_name().toString());
//	System.out.println(password);
//	
	return  routing;
	}
	
	
	

	
	
	
	

}
