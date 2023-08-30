package com.hsbc.day5.question4;

public class StatisticalUtility {
	public int getAverageValue(int data[], int min, int max) throws InvalidRangeException {
        int sum = 0;
        for (int value : data) {
            sum=sum+value;
        }
        int avg = sum / data.length;
        if (avg<min || avg > max) {
            throw new InvalidRangeException("Average is outside range");
        }
        return avg;
    }

}
