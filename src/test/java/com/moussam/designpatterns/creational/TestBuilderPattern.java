package com.moussam.designpatterns.creational;

import static com.moussam.designpatterns.creational.builder.Color.BLUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.creational.builder.BankAccount;
import com.moussam.designpatterns.creational.builder.Car;

class TestBuilderPattern {

	@Test
	void test() {
		// given 
		int id = 1;
		String brand = "Mercedes";
		String model = "AMX";
		
		Car underTest =  Car
				.builder()
				.withId(id)
				.withBrand(brand)
				.withModel(model)
				.withColor(BLUE)
				.build();
		
		
		assertNotNull(underTest);
		assertEquals(id, underTest.getId());
		assertEquals(brand, underTest.getBrand());
		assertEquals(model, underTest.getModel());
		assertEquals(BLUE, underTest.getColor());
	}
	
	@Test
	void testBuilderPatternUsingLombok() {
		// given 
		String accountNumber = "22738022275";
		String name = "Ali";
		String email = "ali@test.com";
		
		
		BankAccount underTest = BankAccount
											.builder()
											.name(name)
											.accountNumber(accountNumber)
											.email(email)
											.newsletter(true)
											.build();
		
		
		assertNotNull(underTest);
		assertEquals(name, underTest.getName());
		assertEquals(accountNumber, underTest.getAccountNumber());
		assertEquals(email, underTest.getEmail());
		assertTrue(underTest.isNewsletter());
		
	}

}
