package JDBC_package;

import java.sql.*;

public class JDBC_EmployeeDatabase {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/";

	   //  Database credentials
	static final String USER = "root";
	static final String PASS = "bshikhar13";
	 
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");

		    System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);

		    System.out.println("Creating database...");
		    stmt = conn.createStatement();
		      
		    String sql = "CREATE DATABASE Employee";
		    stmt.executeUpdate(sql);
		    System.out.println("Database created successfully...");
		
		}catch(SQLException se){
		    se.printStackTrace();
		}catch(Exception e){
		    e.printStackTrace();
		}finally{
		    try{
		    	if(stmt!=null)
		    		stmt.close();
		    }catch(SQLException se2){
		      
		    }// nothing we can do
		     
		    try{
		         if(conn!=null)
		            conn.close();
		    }catch(SQLException se){
		         se.printStackTrace();
		    }//end finally try
		}//end try
		  
	}//end main
}	
