package com.hsbc.PizzaStore.Main;

import com.hsbc.PizzaStore.Ui.CustomerView;
import com.hsbc.PizzaStore.domain.PizzaStore;
import com.hsbc.PizzaStore.domain.PizzaStoreFactoryImpl;

public class Main {
	public static void main(String[] args) {
        PizzaStoreFactoryImpl pizzaStorageFactory = new PizzaStoreFactoryImpl();
        PizzaStore pizzaStore = pizzaStorageFactory.getPizzaStore();
        CustomerView customerView = new CustomerView(pizzaStore);
    }

}
