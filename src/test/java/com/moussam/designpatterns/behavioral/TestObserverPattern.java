package com.moussam.designpatterns.behavioral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.behavioral.observer.Client;
import com.moussam.designpatterns.behavioral.observer.GoogleNewsLetter;
import com.moussam.designpatterns.behavioral.observer.Observable;
import com.moussam.designpatterns.behavioral.observer.Observer;

class TestObserverPattern {

	@Test
	void testObserver() {

		Observable observable = new GoogleNewsLetter();
		Observer client = new Client("John Smith");
		Observer bank = new Client("Industrial and commercial bank"); 
		
		observable.subscribe(client);
		observable.subscribe(bank);
		String news = "New cloud service offerings";
		observable.setNews(news);
		
		assertEquals(news, client.getNews());
		assertEquals(news, bank.getNews());

	}

}
