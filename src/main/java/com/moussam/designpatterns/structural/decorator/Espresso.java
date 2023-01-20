package com.moussam.designpatterns.structural.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		super.description = "Espresso";
	}

	@Override
	public double cost() {
		return 6;
	}

}
