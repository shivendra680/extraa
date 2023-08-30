package com.hsbc.productmanager.exception;

public class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String s) {
		System.out.println(s);
	}

}
