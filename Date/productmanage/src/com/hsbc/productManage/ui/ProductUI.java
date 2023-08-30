package com.hsbc.productManage.ui;

import com.hsbc.productManage.domain.Product;
import com.hsbc.productManage.service.ProductServiceImpl;
import com.hsbc.productmanager.exception.ProductNotFoundException;

public class ProductUI {
	
	public static void searchPage() {
		System.out.println("Search Page");
		ProductServiceImpl ps = new ProductServiceImpl();
		try {
			for(Product p:ps.search()) {
				System.out.println(p.getCategory().getName()+" : "+p.getName()+" : "+p.getId());
			}
			
		}catch(ProductNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void savePage() {
		System.out.println("Save Page");
	}

	public static void WelcomePage() {
		System.out.println("Welcome to Product Manager");
		
	}

}
