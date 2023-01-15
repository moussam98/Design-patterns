package com.moussam.designpatterns.creational.factorymethod;

public class BrestPizzeria extends Pizzeria {

	@Override
	protected Pizza createPizza(PizzaType type) {

		switch (type) {
		case CHEESE:
			return new BrestCheesePizza();
		case VEGETARIAN:
			return new BrestVegetarianPizza();
		default:
			return null;
		}
	}

}
