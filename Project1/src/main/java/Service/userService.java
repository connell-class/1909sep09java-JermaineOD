package Service;

import ProjectOneDao.userDao;
import ProjectOneModel.User;

public class userService {

	public String CheckLogin(String Username, String password) throws ClassNotFoundException {
		String logpage ="/html/index.html";
		try {
	userDao ud = new userDao();
		
	
	User user = ud.getByUserName(Username);
if(user.getUser_password().equals(password)) {
	
	System.out.println("Your logged in");
	
	
	switch(user.getRole_id()) {
		case 20: 
		logpage="/html/manager.html";
		break;
		case 10: 
		logpage="/html/Employee.html";
		break;
			}
		
//	return logpage;//switcht to user or admin profile. return page.
	
}
	
		}catch(Exception e) {
			e.printStackTrace();
			
			}
		return logpage;
	
	
	}
	
	
}
