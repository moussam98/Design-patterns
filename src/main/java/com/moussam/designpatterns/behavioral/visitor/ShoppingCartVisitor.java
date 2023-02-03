package com.moussam.designpatterns.behavioral.visitor;

import java.util.Map;

public class ShoppingCartVisitor implements Visitor<Map<String, Integer>> {

	@Override
	public void visit(Book book, final Map<String, Integer> arg) {
		int cost = getDiscount(book);
		updateElement(arg,"Book", cost);
	}

	@Override
	public void visit(Fruit fruit, final Map<String, Integer> arg) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		updateElement(arg, "Fruit", cost);
	}

	
	private void updateElement(final Map<String, Integer> arg, String type, int cost) {
		Integer value = arg.get(type);
		if (value != null) {
			arg.put(type, value + cost);
		} else {
			arg.put(type, cost);
		}
	}
	
	private int getDiscount(Book book) {
		if (book.getPrice() > 50) {
			return book.getPrice() - 5;
		} else {
			return book.getPrice();
		}
	}

}
