package com.moussam.designpatterns.structural;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.structural.adapter.Adapter;
import com.moussam.designpatterns.structural.adapter.Client;
import com.moussam.designpatterns.structural.adapter.StandardImpl;

class TestAdapterPattern {

	@Test
	void testAdapter() {
		Client client = new Client(); 
		
		client.setStandard(new StandardImpl());
		long result1 = client.performOperation(4, 8);
		
		assertEquals(12, result1);
		
		client.setStandard(new Adapter());
		 long result2 = client.performOperation(4, 8);
		 
		 assertEquals(24, result2);
		
	}

}
