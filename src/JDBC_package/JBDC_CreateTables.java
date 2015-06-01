package JDBC_package;

import java.sql.*;

public class JBDC_CreateTables {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/Employee";
	  
	static final String USER = "root";
	static final String PASS = "bshikhar13";
	
	public static void main(String args[]) {
		Connection conn = null;
		Statement smt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Employee Database");
			
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println("Connected to Employee Database");
			
			System.out.println("Creating Table in Employee Database");
			smt = conn.createStatement();
			
			String sql = "Create Table List (id INTEGER NOT NULL, name VARCHAR(500), age INTEGER, PRIMARY KEY (id))";
			
			smt.executeUpdate(sql);
		    System.out.println("Created table in Employee database...");
		}catch(Exception e){
			System.out.println("Some Error Occured!!");
		}
	}

}
