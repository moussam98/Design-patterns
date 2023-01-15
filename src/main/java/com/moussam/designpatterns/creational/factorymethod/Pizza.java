package com.moussam.designpatterns.creational.factorymethod;

import java.util.logging.Logger;

public abstract class Pizza {
	 
	private static Logger logger = Logger.getLogger(Pizza.class.getName());
	
	protected String name;

	public void cook() {
		logger.info("Pizza cooking...");
	}
	
	public void cut() {
		logger.info("Pizza cutting...");
	}
	
	public void pack() {
		logger.info("Pizza packing...");
	}
	
	public String getName() {
		return name;
	}
	
	
}
