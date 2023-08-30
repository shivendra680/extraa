package com.hsbc.productManage.dao;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.productManage.domain.Product;

public interface ProductDAO {
	public List<Product> findAll() throws SQLException;
	public void save(Product product)throws SQLException;

}
