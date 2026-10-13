package com.b71.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.b71.model.Adminlogin;
import com.b71.model.Login;
import com.b71.model.Student;
import com.b71.utility.DbConnection;

public class StudentDao implements StudentDaoInterface  {
	Connection con=null;
	String status ="fail";
	

	@Override
	public String insertStudent(Student s) {
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setString(1,s.getUsername());
			ps.setString(2,s.getFirstname());
			ps.setString(3,s.getLastname());
			ps.setString(4, s.getPassword());
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
				System.out.println(n + "rows(s) are affected");
			}
			else {
				System.out.println("nothing is affected");
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return status;
		
		
	}
	public String selectByUsername(Login l) {
		int count=0;
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select *from student where username =?  and password=?");
			ps.setString(1,l.getUsername());
			
			ps.setString(2, l.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				count++;
			}
			if(count>0 ) {
				status="success";
				
			}
		}
			
		catch(Exception e) {
			System.out.print(e);
		}
		
		return status;
	}
	public String selectByAdminUsername(Adminlogin a1) {
		int count=0;
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select *from admin where username =?  and password=?");
			ps.setString(1,a1.getUsername());
			
			ps.setString(2, a1.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				count++;
			}
			if(count>0 ) {
				status="success";
				
			}
		}
			
		catch(Exception e) {
			System.out.print(e);
		}
		
		return status;
		
	}
	public List<Student> selectAllStudents() {
		List<Student> list=new ArrayList<Student>();
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select *from student ");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student s=new Student();
				s.setUsername(rs.getString(1));
				s.setFirstname(rs.getString(2));
				s.setLastname(rs.getString(3));
				s.setPassword(rs.getString(4));
				list.add(s);
			}
		}
				
				
			
				
			
		catch(Exception e) {
			System.out.print(e);
		}
		
		return list;
	}
	public String DeleteUsername(String username) {
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("delete from student where username=? ");
			ps.setString(1, username);
			
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
			}
		}
			
			
				
			
		catch(Exception e) {
			System.out.print(e);
		}
		return status;
	}
	public  Student getByUsername(String username) {
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select *from  student where username=? ");
			ps.setString(1, username);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				Student s=new Student();
				s.setUsername(rs.getString(1));
				s.setPassword(rs.getString(4));
				s.setFirstname(rs.getString(2));
				s.setLastname(rs.getString(3));
				return s;
				
			}
		}
				
				
			
				
			
		catch(Exception e) {
			System.out.print(e);
		}
		return null;
	
	}
	public String UpdateStudent(Student s) {
		try {
			con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("update student set password =? , firstname=? , lastname=? where username=? ");
			ps.setString(1, s.getPassword());
			ps.setString(2,s.getFirstname());
			ps.setString(3, s.getLastname());
			ps.setString(4, s.getUsername());
			
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
			}
		}
			
			
				
			
		catch(Exception e) {
			System.out.print(e);
		}
		return status;
		
	}

}
	
