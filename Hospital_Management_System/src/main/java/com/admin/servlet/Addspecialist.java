package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.SpecialistDao;
import com.db.dbConnect;
import com.entity.user;

@WebServlet("/addSpecialist")
public class Addspecialist extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String specName= req.getParameter("specName");
		
		SpecialistDao dao= new SpecialistDao(dbConnect.getConn());
		boolean f = dao.addSpecialist(specName);
		
		HttpSession session = req.getSession();
		
		if(f) {
			session.setAttribute("succMsg", "Speialist Added");
			resp.sendRedirect("admin/index.jsp");
			}else {
				session.setAttribute("errorMsg", "something wrong on server");
				resp.sendRedirect("admin/index.jsp");
			}
		
	}
	

}
