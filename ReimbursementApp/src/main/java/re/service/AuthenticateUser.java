package re.service;

import java.util.List;

import re.dao.UserDao;
import re.model.User;

public class AuthenticateUser {
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String verifyUser( String uUsername, String uPassword) throws ClassNotFoundException{
	UserDao ud = new UserDao();
	User user = new User();
	String routing ="";
	
	user = ud.getById(uUsername.toLowerCase());
	
	if(user.getUsers_id() <= 0) {
		System.out.println("Username not found");
		return "html/index.html";
	}
	else if(uPassword.equals(user.getUser_password())&& user.getRole_id()<3) {
		System.out.println("MANAGER: "+uUsername+ " has been verified!");
		routing="html/manager.html";
		
	}else if(uPassword.equals(user.getUser_password())&& user.getRole_id()>2) {
		System.out.println("EMPLOYEE: "+uUsername+ " has been verified!");
		//rounting="employee.html";
	}
	
	switch(user.getRole_id()) {
	case 0: 
	routing="/html/index.html";
	break;
	case 1: 
	routing="/html/viewReimburse.html";
	break;
	case 2: 
	routing="/html/viewReimburse.html";
	break;
	case 3: 
	routing="/html/subReimburse.html";
	break;
		}
	
	
	
	
//	ud.getByUsername(uUsername);
//	String password =(user.getFirst_name().toString());
//	System.out.println(password);
//	
	return  routing;
	}
//___________________________________________________________________________________________________________________________________________________________________________________________

}
