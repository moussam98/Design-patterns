package com.moussam.designpatterns.behavioral.visitor;

public interface Element {
	<A> void accept(Visitor<A> visitor, A arg);
}
