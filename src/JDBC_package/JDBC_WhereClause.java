package JDBC_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_WhereClause {
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
			
			System.out.println("Selecting from List\n");
			System.out.println("--------------------------------------------------------------");
			stmt = conn.createStatement();
			
			String sql = "SELECT * from List WHERE id >= 1200130";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){

				int id  = rs.getInt("id");
		        String name = rs.getString("name");
		        int age = rs.getInt("age");
		        
		        System.out.println("ID : " + id);
		        System.out.println("Name : " + name);
		        System.out.println("Age : " + age);
		        System.out.println("\n");
		      }
		}catch(Exception e){
			System.out.println("Some Error Occured!!");
		}
	}
}
