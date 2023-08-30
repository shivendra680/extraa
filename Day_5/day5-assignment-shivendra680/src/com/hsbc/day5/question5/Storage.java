package com.hsbc.day5.question5;

public interface Storage {
	public void addNewPizza(Pizza e) throws PizzaAlreadyExistException;
	public Pizza getPizzaByName(String pizzaname) throws PizzaNotFoundException;
	

}
