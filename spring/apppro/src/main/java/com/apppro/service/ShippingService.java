package com.apppro.service;

import org.springframework.stereotype.Service;

@Service("shippingService")
public class ShippingService {
	public void ship() {
		System.out.println("shipping..");
	}

}
