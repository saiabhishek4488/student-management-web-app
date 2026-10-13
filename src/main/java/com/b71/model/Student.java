package com.b71.model;

public class Student {
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	
	public Student() {}
	public Student(String un,String fn,String ln,String pwd) {
		this.username=un;
		this.firstname=fn;
		this.lastname=ln;
		this.password=pwd;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return this.username;
	}
	

}
