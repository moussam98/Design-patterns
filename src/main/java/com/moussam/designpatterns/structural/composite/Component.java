package com.moussam.designpatterns.structural.composite;

public abstract class Component {
	
	private String name;
	private int level;

	protected Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public abstract void view();

	public String getIndentation() {
		StringBuilder stringBuilder = new StringBuilder(""); 
		for (int i = 0; i < level; i++) {
			stringBuilder.append("\t");
		}
		return stringBuilder.toString();
	}
}
