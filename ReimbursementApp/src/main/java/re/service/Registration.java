package re.service;

import re.model.User;
import re.dao.UserDao;

public class Registration {
	
	
	public String RegisterUser(User user) throws ClassNotFoundException{
		UserDao ud = new UserDao();
		//User use = new User();

		//ud.registerEmployee(user);
		System.out.println(user);
		return ud.registerEmployee(user);
	}
}