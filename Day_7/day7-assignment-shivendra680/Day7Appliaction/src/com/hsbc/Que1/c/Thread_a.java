package com.hsbc.Que1.c;

public class Thread_a extends Thread{
	
	    private NumberCounter counter;

	    public Thread_a(NumberCounter counter) {
	        this.counter = counter;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 10000; i++) {
	            counter.increment();
	        }
	    }

}
