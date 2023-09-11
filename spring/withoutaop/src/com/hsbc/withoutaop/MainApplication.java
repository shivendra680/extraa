package com.hsbc.withoutaop;

import com.hsbc.withoutaop.service.OrderService;
import com.hsbc.withoutaop.service.ShippingService;

public class MainApplication {
	public static void main(String[] args) {
		OrderService os = new OrderService();
		ShippingService ss = new ShippingService();
		ss.ship();
		
	}

}
