package com.hsbc.productManage.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.hsbc.productManage.dao.ProductDAOImp;
import com.hsbc.productManage.domain.Product;
import com.hsbc.productmanager.exception.ProductAlreadyExistes;
import com.hsbc.productmanager.exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService{
	private ProductDAOImp productDAO = new ProductDAOImp();

	@Override
	public List<Product> search() throws ProductNotFoundException {
		
		try{// TODO Auto-generated method stub
		return productDAO.findAll();
		}catch(SQLException e){
			throw new ProductNotFoundException("No product FOund!!");
		}
	}

	@Override
	public Product add(Product product)throws ProductAlreadyExistes {
		try{// TODO Auto-generated method stub
			return productDAO.save(product);
			}catch(Exception e){
				throw new ProductAlreadyExistes("No product FOund!!");
			}
	}

}
