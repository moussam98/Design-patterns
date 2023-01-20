package com.moussam.designpatterns.structural.adapter;

public class StandardImpl implements IStandard {

	@Override
	public long operation(int n1, int n2) {
		return (long) n1 + n2; 
	}

}
