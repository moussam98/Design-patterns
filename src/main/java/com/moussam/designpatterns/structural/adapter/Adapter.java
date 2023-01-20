package com.moussam.designpatterns.structural.adapter;

public class Adapter implements IStandard {

	private OldImpl oldImpl; 
	
	public Adapter() {
		oldImpl = new OldImpl();
	}
	
	@Override
	public long operation(int n1, int n2) {
		return oldImpl.compute(n1, n2);
	}

}
