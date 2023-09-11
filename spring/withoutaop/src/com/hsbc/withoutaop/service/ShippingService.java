package com.hsbc.withoutaop.service;

import com.hsbc.crossconfig.LoggingService;

public class ShippingService {
	private LoggingService ls = new LoggingService();
	public void ship() {
		ls.beforelog();
		System.out.println("shipping..");
		ls.afterlog();
	}

}
