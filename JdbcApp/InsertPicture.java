package com.jdbc.JdbcApp;

import java.util.Scanner;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver into memeory
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root"); // Establishing and opening connection
			Scanner sc = new Scanner(System.in);
			
			stmt=con.prepareStatement("insert into profile values(?,?)");
			stmt.setString(1,"Thread");
			FileInputStream fs = new FileInputStream("E:\\HSC\\profile\\thread.jpg");
			stmt.setBinaryStream(2, fs);
			
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
