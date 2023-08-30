package com.hsbc.day5.question1;

public class SingleTryCatch {
	
	public static void main(String[] args) {
        try {
            int div = divide(10, 0);
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("final block");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
