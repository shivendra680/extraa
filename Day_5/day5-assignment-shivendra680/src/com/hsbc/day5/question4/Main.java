package com.hsbc.day5.question4;

public class Main {
	public static void main(String[] args) {
		
		int data[] = {45,43,53,32,4454,432};
		int min = 23;
		int max =5000;
		int v1 = 100;
		int v2 = 400;

		DataCollector dataCollector = new DataCollector();

        try {
            int result = dataCollector.getResult(data, min, max, v1, v2);
            System.out.println("Result: " + result);
        } catch (InvalidInputException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
	}

}
