package com.hsbc.pizzaStore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PizzaStoreImpl implements PizzaStore {
	private String filename;
	private String[][] pizzaArray = new String[5][2];
	
	public PizzaStoreImpl(String filename) {
		this.filename = filename;
	}
	
	private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < 2; i++) {
                writer.write(pizzaArray[i][0] + "," + pizzaArray[i][1]);
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public void addPizza(String pizza, double price) {
		pizzaArray[0][0]=pizza;
        pizzaArray[1][1]=String.valueOf(price);
        saveToFile();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePizza(String pizzaName) {
		int count=2;
		for (int i = 0; i < 2;i++) {
	            if (pizzaArray[i][0].equals(pizzaName)) {
	                // Shift the elements to fill the gap
	                for (int j = i; j < count;j++) {
	                    pizzaArray[j][0] = pizzaArray[j + 1][0];
	                    pizzaArray[j][1] = pizzaArray[j + 1][1];
	                }
	                count--;
	                saveToFile();
	               
		// TODO Auto-generated method stub
		
	            }}}

	@Override
	public double getPizzaPrice(String pizzaName) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2;i++) {
            if (pizzaArray[i][0].equals(pizzaName)) {
                return Double.parseDouble(pizzaArray[i][1]);
            }
        }
        return 0.0;
	}

}
