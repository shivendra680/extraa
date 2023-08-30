package com.hsbc.productManage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.productManage.domain.Category;
import com.hsbc.productManage.domain.Product;

public class ProductDAOImp implements ProductDAO{

	@Override
	public List<Product> findAll() throws SQLException{
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		List<Product> products = new ArrayList<>();
		
			con = DriverManager.getConnection(url,"root","Agra@282005");
			
			String query = "select * from product";
			stmt = con.prepareStatement(query);
			res = stmt.executeQuery();
			while(res.next()) {
				Product product =new Product();
				product.setId(res.getInt("id"));
				product.setName(res.getString("name"));
				CategoryDAO c = new CategoryDAOImpl();
				Category ct = c.findById(res.getInt("categoryId")); 
				product.setCategory(ct);
				products.add(product);
				
			}
			
			res.close();
			stmt.close();
			con.close();
			
			
		return products;
	}

	@Override
	public void save(Product product) throws SQLException{
		String url = "jdbc:mysql://localhost/hsbc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		
		try {
			con = DriverManager.getConnection(url,"root","Agra@282005");
			
			String query = "insert into product value(?,?)";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, product.getId());
			stmt.setString(2,product.getName());
			
			int n = stmt.executeUpdate();
			System.out.println(n+"Product Inserted");
			stmt.close();
			con.close();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	}

