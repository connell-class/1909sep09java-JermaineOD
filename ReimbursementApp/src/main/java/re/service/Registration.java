package re.service;

import re.model.User;
import re.dao.UserDao;

public class Registration {
	
	
	public User RegisterUser(User user) throws ClassNotFoundException{
		UserDao ud = new UserDao();
		//User user = new User();

		
		
		return user;
	}
}