package com.moussam.designpatterns.structural.decorator;

public class MilkDecorator extends BeverageDecorator {

	public MilkDecorator(Beverage beverage) {
		this.beverage = beverage; 
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk"; 
	}

	@Override
	public double cost() {
		return beverage.cost() + 3;
	}
	
}
