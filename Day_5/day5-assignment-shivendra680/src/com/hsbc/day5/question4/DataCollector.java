package com.hsbc.day5.question4;

public class DataCollector {
	private StatisticalUtility utility;

    public DataCollector() {
        utility = new StatisticalUtility();
    }

    public int getResult(int data[], int min, int max, int v1, int v2) throws InvalidInputException {
        try {
            int avg = utility.getAverageValue(data, min, max);
            return (avg * v1) / v2;
        } catch (InvalidRangeException e) {
            throw new InvalidInputException(e.getMessage());
        }
    }

}
