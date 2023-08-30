package com.hsbc.PizzaStore.domain;

import java.util.List;

public class PizzaStoreimpl implements PizzaStore{
	
	private final List<Pizza> pizzas;

	@Override
	public void addNewPizza(Pizza pizza) {
		pizzas.add(pizza);
		
	}
	
	

	public PizzaStoreimpl(List<Pizza> pizzas) {
		super();
		this.pizzas = pizzas;
	}



	@Override
	public Pizza getPizzaByName(String pizzaName) {
		for (Pizza pizza : pizzas) {
        if (pizza.pizzaName.equals(pizzaName)) {
            return pizza;
        }
    }
    return null;
	}

	@Override
	public Pizza[] getPizzaBySize(int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
