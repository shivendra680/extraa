package com.hsbc.Que1.b;

public class Thread1 extends Thread{
	public void reun() {
		try {
			Thread.sleep(10000);
			System.out.println("Thread 1 completed after 10000mili second wait");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
