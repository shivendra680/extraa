package com.hsbc.datDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieCrud {
	public static void main(String[] args) {
		read();
	}

	private static void read() {
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		
		try {
			con = DriverManager.getConnection(url,"root","Agra@282005");
			/*String query = "select * from movies";
			stmt = con.prepareStatement(query); 
			This for entire table*/
			
			/*String query = "select * from movies where id=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, 2);
			for 1 condition where 1 represents the ? which one to use*/
			
			String query = "select * from movies where id=? and name=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, 2);
			stmt.setString(2, "");
			
			res = stmt.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt("id")+" : "+res.getString("name")+" : "+res.getInt("rating")+" : "+res.getDate("rdate"));
			}
			
			res.close();
			stmt.close();
			con.close();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	

}
