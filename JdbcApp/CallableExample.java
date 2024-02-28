package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class CallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		CallableStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver into memory
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root"); // Establishing and opening connection
			stmt = con.prepareCall("{call myprocedure1(?,?)}");
			stmt.setInt(1, 101);
			stmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			boolean status = stmt.execute();
			System.out.println(stmt.getString(2));
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
