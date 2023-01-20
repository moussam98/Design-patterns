package com.moussam.designpatterns.structural.decorator;

public class CaramelDecorator extends BeverageDecorator {

	public CaramelDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Caramel";
	}

	@Override
	public double cost() {
		return beverage.cost() + 4;
	}

}
