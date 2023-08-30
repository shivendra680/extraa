package com.hsbc.Que1.b;

public class Main {
	public static void main(String[] args)throws InterruptedException {
		Thread threada = new Thread1();
		Thread threadb = new Thread2();
		
		threada.start();
		threadb.start();
		
		threada.join();
		threadb.join();
		
	}

}
