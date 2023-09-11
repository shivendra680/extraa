
package com.apppro.service;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {

	public void placeOrder() {
		System.out.println("order placed..");
	}

}
