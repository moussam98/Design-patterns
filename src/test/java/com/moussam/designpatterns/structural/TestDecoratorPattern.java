package com.moussam.designpatterns.structural;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.structural.decorator.Beverage;
import com.moussam.designpatterns.structural.decorator.CaramelDecorator;
import com.moussam.designpatterns.structural.decorator.Espresso;
import com.moussam.designpatterns.structural.decorator.MilkDecorator;

class TestDecoratorPattern {

	@Test
	void testDecorator() {
		Beverage beverage = new Espresso(); 

		beverage = new MilkDecorator(beverage);
		beverage = new CaramelDecorator(beverage);
		
		assertEquals("Espresso, Milk, Caramel", beverage.getDescription());
		assertEquals(13, beverage.cost());
	
		
	}

}
