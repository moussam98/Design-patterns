package com.moussam.designpatterns.behavioral.visitor;

public interface Visitor<A> {

	void visit(Book book, A arg);
	void visit(Fruit fruit, A arg);
}
