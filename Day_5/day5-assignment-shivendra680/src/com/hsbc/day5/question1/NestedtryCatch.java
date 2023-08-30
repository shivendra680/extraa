package com.hsbc.day5.question1;

public class NestedtryCatch {
	public static void main(String[] args) {
        try {
            int[] num = { 1, 2, 3 };
            try {
                System.out.println(num[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }

}
