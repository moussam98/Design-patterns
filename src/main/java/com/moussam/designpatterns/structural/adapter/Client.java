package com.moussam.designpatterns.structural.adapter;

public class Client {

	private IStandard standard;

	public long performOperation(int n1, int n2) {
		 return standard.operation(n1, n2);
	}

	public void setStandard(IStandard standard) {
		this.standard = standard;
	}

}
