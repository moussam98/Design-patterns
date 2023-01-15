package com.moussam.designpatterns.creational.factorymethod;

import java.util.logging.Logger;

public class StrasbourgCheesePizza extends Pizza{
	private static Logger logger = Logger.getLogger(StrasbourgCheesePizza.class.getName());

	public StrasbourgCheesePizza() {
		name = "Pizza sauce style strasbourg et fromage"; 
	}

	@Override
	public void cut() {
		logger.info("pizza cut into squares");
	}

	
}
