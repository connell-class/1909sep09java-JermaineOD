package re.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import re.dao.UserDao;
import re.model.User;

public class LoginServlet extends HttpServlet{

	UserDao ud = new UserDao();
	User us = new User();
	
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			String username = req.getParameter("username").toLowerCase();
			String password = req.getParameter("password");
			System.out.println(username + " " +password);
			
			try {
				ud.getByLogin(username, password);
				
				System.out.println(ud.getByLogin(username, password));
				String uPass = ud.getByLogin(username, password);
				//String uUser = ud.getByUsername(username);
				//List<User> lu = ud.getByUsername(username);
				//System.out.println(lu.get(0).getUser_password());
				
				if(password.equals(uPass) && username.equals(username)) {
					resp.getWriter().println("<html><body><h1>Bigup yuhself!!!</h1></body></html>");
				} else {
					resp.getWriter().println("<html><body><h1>your password is incorrect, Please Try Again!!!</h1></body></html>");
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
