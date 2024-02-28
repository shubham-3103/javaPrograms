package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdate {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver into memeory
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root"); // Establishing and opening connection
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connection established succesfully");
		try {
			Statement stmt = con.createStatement(); // Create STatement
			
//			int status = stmt.executeUpdate("insert into employee(empid,ename,age) values(104,'Shubham',34)"); // Execute SQL Queries
//			if(status>0)
//				System.out.println("Updated Successfullly");
//			else	System.out.println("Data Not Inserted");
			
//			int status = stmt.executeUpdate("update employee set ename=\"Srinvas\" where empid=104 ");
			int status = stmt.executeUpdate("delete from employee where empid=102");
			if(status>0)
				System.out.println("Updated Successfullly");
			else	System.out.println("Data Not Updated");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close(); // Closing Connection and closing connection always should be in finally
								// Statement
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
