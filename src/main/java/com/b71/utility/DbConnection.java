package com.b71.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con=null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","2003");
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return con;
	}

}
