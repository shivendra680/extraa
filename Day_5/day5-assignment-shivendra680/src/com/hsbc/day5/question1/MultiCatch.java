package com.hsbc.day5.question1;

public class MultiCatch {
	  public static void main(String[] args) {
	        try {
	            int[] numbers = { 1, 2, 3 };
	            System.out.println(numbers[4]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception ee) {
	            System.out.println(ee.getMessage());
	        }
	    }

}
