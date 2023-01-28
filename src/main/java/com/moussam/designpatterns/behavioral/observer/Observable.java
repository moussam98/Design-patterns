package com.moussam.designpatterns.behavioral.observer;

public interface Observable {
	
	boolean subscribe(Observer observer); 
	boolean unsubsribe(Observer observer); 
	void notifyObservers(); 
	String getNews();
	void setNews(String news); 
}
