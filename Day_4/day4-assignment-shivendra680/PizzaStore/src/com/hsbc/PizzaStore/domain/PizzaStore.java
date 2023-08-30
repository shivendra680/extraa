package com.hsbc.PizzaStore.domain;

public interface PizzaStore {
	 void addNewPizza(Pizza pizza);
	    Pizza getPizzaByName(String pizzaName);
	    Pizza[] getPizzaBySize(int size);
	

}
