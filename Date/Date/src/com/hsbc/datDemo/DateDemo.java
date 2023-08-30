package com.hsbc.datDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
	
	public static void main(String[] args) {
		LocalDate dob = LocalDate.now();
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getDayOfYear());
		System.out.println(dob.getDayOfWeek());
		
		LocalDate orderDate = LocalDate.of(2023, 5, 1);
		
		System.out.println(orderDate);
		
		LocalDateTime Idt = LocalDateTime.now();
		System.out.println(Idt);
		
		Student st = new Student("1","Suraj",LocalDate.of(2002, 7, 19));
		System.out.println(st.getDob());
		
		
	}

}
