package com.moussam.designpatterns.behavioral.observer;

public class Client implements Observer {

	private final String name;
	private String newsLetter = "";

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable observable) {
		this.newsLetter = observable.getNews();
	}

	@Override
	public String getNews() {
		return newsLetter;
	}

	public String getName() {
		return name;
	}

}
