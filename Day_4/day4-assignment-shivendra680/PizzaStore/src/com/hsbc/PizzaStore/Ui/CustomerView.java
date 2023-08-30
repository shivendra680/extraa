package com.hsbc.PizzaStore.Ui;

import com.hsbc.PizzaStore.domain.Pizza;
import com.hsbc.PizzaStore.domain.PizzaStore;

public class CustomerView {
	
	private final PizzaStore pizzaStore;

    public CustomerView(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    public void addPizzaDetailsAndStore(Pizza pizza) {
        pizzaStore.addNewPizza(pizza);
    }

    public void displayPizzaDetailsByName(String pizzaName) {
        Pizza pizza = pizzaStore.getPizzaByName(pizzaName);
        System.out.println(pizza);
    }


}
