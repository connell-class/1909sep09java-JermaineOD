package re.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import re.dao.UserDao;
import re.model.User;
import re.service.AuthenticateUser;

public class LoginController extends HttpServlet{
	
	public static String LogginIn(HttpServletRequest req) {
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			System.out.println("2nd");
//			String username = req.getParameter("username");
//
//			String password = req.getParameter("password");
//			System.out.println(username + "    " + password);
//			
//			UserDao ud = new UserDao();
//			
//			
//			User us = new User();
//			try {
//				//String uPass = ud.getByLogin(username, password);
//				
////				if(ud.getByLogin(username, password).isEmpty()) {
////					return"html/index.html";
////				}
//				int role = ud.getByLogin(username, password).get(0).getRole_id();
//				String user = ud.getByLogin(username, password).get(0).getUsername();
//				String pass = ud.getByLogin(username, password).get(0).getUser_password();
//				
//				if (username.equals(username) && password.equals(pass) && role >2) {
//					
//					return "html/viewReimburse.html";
//				} else if(username.equals(username) && password.equals(pass) && role <3) {
//					return "html/third.html";
//
//				}else
//					return "html/index.html";
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		} else {
			
			return "html/second.html";
		}
		return "html/second.html";
	}
//______________________________________________________________________________________________________________________________________________
	public static String LogIn(HttpServletRequest req) {
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			
			
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			System.out.println(username + "    " + password);
			AuthenticateUser au = new AuthenticateUser();
			User us = new User();
			try {
				au.verifyUser(username, password);
				
				if(us.getUser_password().equals(password) && us.getRole_id() <3) {
					System.out.println("you are in!");
					
					
					return "html/third.html";
				}
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return "html/viewReimburse.html";
	}
	
	
}