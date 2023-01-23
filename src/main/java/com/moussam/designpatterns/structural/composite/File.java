package com.moussam.designpatterns.structural.composite;

public class File extends Component {

	public File(String name) {
		super(name);
	}

	@Override
	public void view() {
		String tab = this.getIndentation();
		System.out.println(tab + "File: " + this.getName());
	}

}
