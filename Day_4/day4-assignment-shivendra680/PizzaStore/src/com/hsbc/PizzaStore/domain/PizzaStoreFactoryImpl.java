package com.hsbc.PizzaStore.domain;

public class PizzaStoreFactoryImpl implements PizzaStoreFactory{

	@Override
	public PizzaStore getPizzaStore() {
		return new PizzaStoreimpl();
	}

}
