package com.hsbc.productManage.service;

import java.util.List;

import com.hsbc.productManage.domain.Product;
import com.hsbc.productmanager.exception.ProductAlreadyExistes;
import com.hsbc.productmanager.exception.ProductNotFoundException;

public interface ProductService {
	public List<Product> search() throws ProductNotFoundException;
	
	public Product add(Product product) throws ProductAlreadyExistes;

}
