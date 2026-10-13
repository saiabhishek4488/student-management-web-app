package com.b71.dao;

import java.util.List;

import com.b71.model.Adminlogin;
import com.b71.model.Login;
import com.b71.model.Student;

public interface StudentDaoInterface {
	public String insertStudent(Student s);
	public String selectByUsername(Login l);
	public String selectByAdminUsername(Adminlogin a1);
	public List<Student> selectAllStudents();
	public String DeleteUsername(String username);
	public  Student getByUsername(String username);
	public String UpdateStudent(Student s);

}
