package re.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import re.dao.UserDao;
import re.model.User;

public class LoginController extends HttpServlet{
	
	public static String login(HttpServletRequest req) {
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			String username = req.getParameter("username");

			String password = req.getParameter("password");
			System.out.println(username + "    " + password);
			
			UserDao ud = new UserDao();
			User us = new User();
			try {
				//String uPass = ud.getByLogin(username, password);
				
//				if(ud.getByLogin(username, password).isEmpty()) {
//					return"html/index.html";
//				}
				int role = ud.getByLogin(username, password).get(0).getRole_id();
				String user = ud.getByLogin(username, password).get(0).getUsername();
				String pass = ud.getByLogin(username, password).get(0).getUser_password();
				if (username.equals(username) && password.equals(pass) && role >=3) {
					
					return "html/viewReimburse.html";
				} else if(username.equals(username) && password.equals(pass) && role <=2) {
					return "html/third.html";

				}else
					return "html/index.html";
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} else {
			return "html/index.html";
		}
		return null;
	}
	
	public static String logIn(HttpServletRequest req) {
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			

		}
		return "html/second.html";
	}
	
	
}