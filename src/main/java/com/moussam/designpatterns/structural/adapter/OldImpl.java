package com.moussam.designpatterns.structural.adapter;

public class OldImpl {
	
	private long result; 

	public long compute(int n1, int n2) {
		result = (long) 2 * (n1 + n2);
		return result;
	}

	// other method
	public void print(double a) {
		System.out.println("OldImpl => "  + result);
	}

}
