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


@WebServlet("/DeleteUsername")
public class DeleteUsername extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		System.out.print(username);
		StudentDao sd=new StudentDao();
		String status=sd.DeleteUsername(username);
		if(status.equals("success")) {
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			
			
			RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
			rd.forward(request, response);
		}
		
	}
		
}
