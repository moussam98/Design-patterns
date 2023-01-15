package com.moussam.designpatterns.creational.factorymethod;

public class StrasbourgPizzeria extends Pizzeria {

	@Override
	protected Pizza createPizza(PizzaType type) {

		switch (type) {
		case CHEESE:
			return new StrasbourgCheesePizza();
		case VEGETARIAN:
			return new StrasbourgVegetarianPizza();
		default:
			return null;
		}
	}

}
