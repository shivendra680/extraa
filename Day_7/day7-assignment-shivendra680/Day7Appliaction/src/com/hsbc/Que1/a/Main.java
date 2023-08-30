package com.hsbc.Que1.a;

public class Main {
	public static void main(String[] args) {
		Ques_1 thread = new Ques_1();
		thread.start();
		
		Thread thread1 = new Thread(new ThreadRunnableImpl());
		thread1.start();
		}

}
