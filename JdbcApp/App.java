package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver into memeory
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root"); // Establishing and opening connectiojn
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connection established succesfully");
		try {
			Statement stmt = con.createStatement(); // Create STatement
			ResultSet rs = stmt.executeQuery("select * from employee"); // Execute SQL Queries
			while (rs.next()) // Handling Result set
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();   //Closing Connection and closing connection always should be in finally Statement
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
