package com.moussam.designpatterns.creational.factorymethod;

public abstract class Pizzeria {

	protected abstract Pizza createPizza(PizzaType type);

	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		pizza.cook();
		pizza.cut();
		pizza.pack();
		return pizza;
	}

}
