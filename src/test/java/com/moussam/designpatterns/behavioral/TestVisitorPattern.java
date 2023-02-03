package com.moussam.designpatterns.behavioral;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.behavioral.visitor.Book;
import com.moussam.designpatterns.behavioral.visitor.Element;
import com.moussam.designpatterns.behavioral.visitor.Fruit;
import com.moussam.designpatterns.behavioral.visitor.ShoppingCartVisitor;
import com.moussam.designpatterns.behavioral.visitor.Visitor;

class TestVisitorPattern {
	
	List<Element> items; 
	Visitor<Map<String, Integer>> visitor; 
	
	@BeforeEach
	void setUp() {
		items = new ArrayList<>();
		items.add(new Book(150, "Effective Java"));
		items.add(new Book(200, "Design Pattern"));
		items.add(new Fruit(5, 5, "Apple"));
		items.add(new Fruit(5, 4, "Banana")); 
		visitor = new ShoppingCartVisitor(); 
	}

	@Test
	void test() {
		Map<String, Integer> costForEachItems = new HashMap<>(); 
		
		for (Element element : items) {
			element.accept(visitor, costForEachItems);
		}
		
		assertEquals(340, costForEachItems.get("Book"));
		assertEquals(45, costForEachItems.get("Fruit"));
		
	}

}
