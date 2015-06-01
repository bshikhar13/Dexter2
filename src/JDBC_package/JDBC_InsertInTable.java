package JDBC_package;

import java.sql.*;

public class JDBC_InsertInTable {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/Employee";
	  
	static final String USER = "root";
	static final String PASS = "bshikhar13";
	
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Employee Database");
			
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println("Connected to Employee Database");
			
			System.out.println("Inserting in List");
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO List VALUES (1200132, 'Shikhar Bansal', 19)";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO List VALUES (1200131, 'Vraj Shah', 19)";
			stmt.executeUpdate(sql);
	      
			sql = "INSERT INTO List VALUES (1200135, 'Darshan Tejani', 20)";
			stmt.executeUpdate(sql);
	      
			sql = "INSERT INTO List VALUES (1200128, 'Ravi Shankar Bharti', 21)";
			stmt.executeUpdate(sql);
	      
			sql = "INSERT INTO List VALUES (1200127, 'Ravi Prakash Verma', 22)";
			stmt.executeUpdate(sql);
	      
		    System.out.println("Data added in List");
		}catch(Exception e){
			System.out.println("Some Error Occured!!");
		}
	}
}
