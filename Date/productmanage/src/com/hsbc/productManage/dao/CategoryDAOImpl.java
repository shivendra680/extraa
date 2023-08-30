package com.hsbc.productManage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hsbc.productManage.domain.Category;

public class CategoryDAOImpl implements CategoryDAO{

	private Category category;

	@Override
	public Category findById(int id) throws SQLException{
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;

		
			con = DriverManager.getConnection(url,"root","Agra@282005");
			
			String query = "select * from category where id=?";
			
			stmt = con.prepareStatement(query);
			stmt.setInt(1,id);
			res = stmt.executeQuery();
			if(res.next()) {
				Category category =new Category();
				category.setId(res.getInt("id"));
				category.setName(res.getString("name"));
				return category;
			}
			
			res.close();
			stmt.close();
			con.close();
			
			
		return category; 
	}

}
