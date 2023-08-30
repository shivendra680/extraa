package com.hsbc.Que1.c;

public class NumberCounter {
	
	 private int count = 0;

	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }

}
