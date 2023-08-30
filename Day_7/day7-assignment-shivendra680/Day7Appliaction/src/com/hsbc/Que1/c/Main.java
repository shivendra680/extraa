package com.hsbc.Que1.c;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
        NumberCounter counter = new NumberCounter();

        Thread_a thread1 = new Thread_a(counter);
        Thread_a thread2 = new Thread_a(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count: " + counter.getCount());
    }

}
