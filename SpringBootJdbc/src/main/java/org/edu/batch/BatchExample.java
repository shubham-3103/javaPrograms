package org.edu.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.scheduling.annotation.Scheduled;

public class BatchExample {
	
	@Scheduled(fixedRate = 1000)
	public void display(){
		System.out.println("Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver into memeory
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root"); // Establishing and opening connection
			Statement stmt = con.createStatement();
			stmt.addBatch("insert into batchexample values('Shubham','Sharma')");
			stmt.addBatch("insert into batchexample values('John','Doe')");
			stmt.addBatch("insert into batchexample values('Harry','Potter')");
			int a[] = stmt.executeBatch();
			for(int i:a) {
				System.out.println(i);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Connection established succesfully");
		 
	}

}
