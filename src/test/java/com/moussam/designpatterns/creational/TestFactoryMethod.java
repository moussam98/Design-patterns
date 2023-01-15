package com.moussam.designpatterns.creational;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.creational.factorymethod.BrestCheesePizza;
import com.moussam.designpatterns.creational.factorymethod.BrestPizzeria;
import com.moussam.designpatterns.creational.factorymethod.BrestVegetarianPizza;
import com.moussam.designpatterns.creational.factorymethod.Pizza;
import com.moussam.designpatterns.creational.factorymethod.PizzaType;
import com.moussam.designpatterns.creational.factorymethod.Pizzeria;
import com.moussam.designpatterns.creational.factorymethod.StrasbourgCheesePizza;
import com.moussam.designpatterns.creational.factorymethod.StrasbourgPizzeria;
import com.moussam.designpatterns.creational.factorymethod.StrasbourgVegetarianPizza;

class TestFactoryMethod {
	@Test
	void testBrestPizzeria() {
		Pizzeria  pizzeria = new BrestPizzeria(); 
		Pizza cheesePizza = pizzeria.orderPizza(PizzaType.CHEESE);
		assertTrue(cheesePizza instanceof BrestCheesePizza);
		
		Pizza vegetarianPizza = pizzeria.orderPizza(PizzaType.VEGETARIAN);
		assertTrue(vegetarianPizza instanceof BrestVegetarianPizza);
	}
	
	@Test
	void testStrasbourgPizzeria() {
		Pizzeria  pizzeria = new StrasbourgPizzeria(); 
		Pizza cheesePizza = pizzeria.orderPizza(PizzaType.CHEESE);
		assertTrue(cheesePizza instanceof StrasbourgCheesePizza);
		
		Pizza vegetarianPizza = pizzeria.orderPizza(PizzaType.VEGETARIAN);
		assertTrue(vegetarianPizza instanceof StrasbourgVegetarianPizza);
	}

}
