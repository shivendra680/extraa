package com.hsbc.Que1.b;

public class Thread2 extends Thread{
	public void run() {
		try {
			Thread.sleep(20000);
			System.out.println("Thread 2 finished after 20000 milliseconds");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
