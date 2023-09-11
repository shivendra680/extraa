package com.hsbc.withoutaop.service;

import com.hsbc.crossconfig.LoggingService;

public class OrderService {
	public OrderService(){
		LoggingService ls = new LoggingService();
		ls.beforelog();
		placeOrder();
		ls.afterlog();
	}
	public void placeOrder() {
		
		System.out.println("order placed..");
	}

}
