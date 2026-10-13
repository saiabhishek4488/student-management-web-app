package com.b71.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.b71.dao.StudentDao;
import com.b71.model.Student;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to the servelets");	
		String username=request.getParameter("username");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String password=request.getParameter("password");
		
		Student s=new Student();
		s.setUsername(username);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setPassword(password);
		StudentDao st=new StudentDao();
		String status=st.insertStudent(s);
		if(status.equals("success")) {
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}
}
			
			
			
				
		
		
		
		

