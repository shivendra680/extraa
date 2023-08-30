package com.hsbc.pizzaStore;

public interface PizzaStore {
	void addPizza(String pizza,double price);
	void removePizza(String pizzaName);
	double getPizzaPrice(String pizzaName);

}
