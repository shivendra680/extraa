package com.apppro.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingService {
	@Before("execution(* com.apppro.service.OrderService.placeOrder(..))")
	public void beforelog() {
		System.out.println("before log.."+LocalDateTime.now());
	}
	@After("execution(* com.apppro.service.OrderService.placeOrder(..))")
	public void afterlog() {
		System.out.println("after log.."+LocalDateTime.now());
	}

}
