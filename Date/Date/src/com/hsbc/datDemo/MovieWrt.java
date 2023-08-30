package com.hsbc.datDemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MovieWrt {
	public static void main(String[] args) {
		//write();
		delete();
	}

	private static void write() {
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		
		try {
			con = DriverManager.getConnection(url,"root","Agra@282005");
			
			String query = "insert into movies value(?,?,?,?)";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, 5);
			stmt.setString(2, "mi-6");
			stmt.setInt(3, 5);
			stmt.setDate(4,Date.valueOf(LocalDate.of(2023, 07, 19)));
			
			int n = stmt.executeUpdate();
			System.out.println(n+"Movie Inserted");
			stmt.close();
			con.close();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	private static void delete() {
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		
		try {
			con = DriverManager.getConnection(url,"root","Agra@282005");
			
			String query = "delete from movies where id=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, 2);
			
			int n = stmt.executeUpdate();
			System.out.println(n+" Movie deleted");
			stmt.close();
			con.close();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	

}
