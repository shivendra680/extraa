package com.hsbc.productManage.dao;

import java.sql.SQLException;

import com.hsbc.productManage.domain.Category;

public interface CategoryDAO {
	public Category findById(int id)throws SQLException;

}
