package com.moussam.designpatterns.structural.proxy;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String serverHost) {
		System.out.println("Connecting to " + serverHost);
	}

}
