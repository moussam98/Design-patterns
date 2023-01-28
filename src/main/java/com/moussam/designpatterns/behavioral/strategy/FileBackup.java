package com.moussam.designpatterns.behavioral.strategy;

public class FileBackup {

	private IStrategy strategy;
	private String content;

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void process() {
		strategy.save();
	}

}
