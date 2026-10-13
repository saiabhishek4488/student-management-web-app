package com.b71.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.b71.dao.StudentDao;
import com.b71.model.Adminlogin;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Adminlogin a1=new Adminlogin();
		a1.setUsername(username);
		a1.setPassword(password);
		StudentDao sd=new StudentDao();
		String status =sd.selectByAdminUsername(a1);
		if(status.equals("success")) {
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			
			
			RequestDispatcher rd=request.getRequestDispatcher("/adminhome.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("/adminlogin.jsp");
			rd.forward(request, response);
		}
	}
		
	

}
