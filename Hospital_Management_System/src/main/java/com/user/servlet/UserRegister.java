package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.db.dbConnect;

import com.entity.user;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullname = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			user u=new user(fullname, email, password);
			
		    UserDAO dao = new UserDAO(dbConnect.getConn());
		    
		    HttpSession session = req.getSession();
		    
		    boolean f = dao.register(u);
		    if(f) {
		    	session.setAttribute("succMsg", "Register SucessFully");
		    	resp.sendRedirect("signup.jsp");
		    	
		    }else {
		    	
		    	session.setAttribute("errorMsg", "Something wrong on server");
		    	resp.sendRedirect("signup.jsp");
		    }
		    
	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
