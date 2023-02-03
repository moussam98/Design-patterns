package com.moussam.designpatterns.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Fruit implements Element {

	private int pricePerKg;
	private int weight;
	private String name;

	@Override
	public <A> void accept(Visitor<A> visitor, A arg) {
		visitor.visit(this, arg);
	}

}
