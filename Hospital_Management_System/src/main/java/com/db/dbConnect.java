package com.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {
	
	private static Connection conn;
	
	String user = System.getenv("root");
	String pass = System.getenv("root");

	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db","user","pass");
			
		}catch(Exception e) {
			 e.printStackTrace();
		}
		 return conn; 
	}
	

}
