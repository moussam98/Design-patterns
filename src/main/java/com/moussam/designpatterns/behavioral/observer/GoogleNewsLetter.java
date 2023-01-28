package com.moussam.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class GoogleNewsLetter implements Observable {
	
	private String news; 
	List<Observer> observers; 
	
	
	public GoogleNewsLetter() {
		observers = new ArrayList<>(); 
	}


	@Override
	public boolean subscribe(Observer observer) {
		return observers.add(observer);
	}

	@Override
	public boolean unsubsribe(Observer observer) {
		return observers.remove(observer); 
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(this);
		}
	}


	@Override
	public String getNews() {
		return this.news;
	}


	@Override
	public void setNews(String news) {
		this.news = news; 
		this.notifyObservers();
	}

}
