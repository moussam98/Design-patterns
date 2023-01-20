package com.moussam.designpatterns.structural.decorator;

import lombok.Getter;

@Getter
public abstract class Beverage {

	protected String description = "Unknown Beverage";

	public abstract double cost();

}
