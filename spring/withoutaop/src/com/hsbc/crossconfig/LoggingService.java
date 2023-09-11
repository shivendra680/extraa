package com.hsbc.crossconfig;

import java.time.LocalDateTime;

public class LoggingService {
	public void beforelog() {
		System.out.println("before log.."+LocalDateTime.now());
	}
	
	public void afterlog() {
		System.out.println("after log.."+LocalDateTime.now());
	}

}
