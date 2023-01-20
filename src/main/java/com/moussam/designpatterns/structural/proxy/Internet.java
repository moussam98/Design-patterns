package com.moussam.designpatterns.structural.proxy;

public interface Internet {
	void connectTo(String serverHost) throws AccessDeniedException;

}
