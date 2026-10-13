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
import com.b71.model.Student;


@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String password=request.getParameter("password");
		
		Student s=new Student();
		s.setUsername(username);
		s.setPassword(password);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		
		StudentDao st=new StudentDao();
		String status=st.UpdateStudent(s);
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
