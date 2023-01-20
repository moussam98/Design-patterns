package com.moussam.designpatterns.structural.decorator;

public abstract class BeverageDecorator extends Beverage {

	protected Beverage beverage;
	
	@Override
	public abstract String getDescription();
}
