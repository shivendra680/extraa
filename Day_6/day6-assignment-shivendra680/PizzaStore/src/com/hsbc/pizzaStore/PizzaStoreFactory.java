package com.hsbc.pizzaStore;

public class PizzaStoreFactory {
	public static PizzaStore getPizzaStoreFileImpl(String fileName) {
        return new PizzaStoreImpl(fileName);
    }

}
