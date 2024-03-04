package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WebappLogin {
	
	public boolean validation(LoginDetail ld) {
		boolean status = false;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");
			PreparedStatement preparedStatement = con.prepareStatement("select * from webapp_login where username = ? and password = ? ");
			preparedStatement.setString(1, ld.getUsername());
			preparedStatement.setString(2, ld.getPassword());
			ResultSet rs = preparedStatement.executeQuery();
			status=rs.next();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return status;
	}

}
