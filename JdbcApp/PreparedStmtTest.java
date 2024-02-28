package com.jdbc.JdbcApp;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver into memeory
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root"); // Establishing and opening connection
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Ename: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Eid: ");
			int id = sc.nextInt();
			
			stmt=con.prepareStatement("update employee set ename=? where empid=?");
			stmt.setString(1,name);
			stmt.setInt(2,id);
			
			int status = stmt.executeUpdate();
			if(status>0)
				System.out.println("Updated Successfullly");
			else	System.out.println("Data Not Updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close(); // Closing Connection and closing connection always should be in finally
								// Statement
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Connection established succesfully");
	}

}
