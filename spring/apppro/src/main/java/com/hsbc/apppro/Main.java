package com.hsbc.apppro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apppro.service.OrderService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		OrderService os = a.getBean("orderService",OrderService.class);
		os.placeOrder();
		
	}

}
