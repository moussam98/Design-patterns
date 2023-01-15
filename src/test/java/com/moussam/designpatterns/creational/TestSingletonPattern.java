package com.moussam.designpatterns.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.creational.singleton.Singleton;

class TestSingletonPattern {

	@Test
	void testSingleton() {
		Singleton singleton = Singleton.getInstance(); 
		Singleton singleton2 = Singleton.getInstance(); 
		
		assertEquals(singleton, singleton2);
	}

}
