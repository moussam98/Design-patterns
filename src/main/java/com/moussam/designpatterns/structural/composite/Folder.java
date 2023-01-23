package com.moussam.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

	private List<Component> components;

	public Folder(String name) {
		super(name);
		components = new ArrayList<>();
	}

	@Override
	public void view() {
		String tab = this.getIndentation();
		System.out.println(tab + "Folder: " + this.getName());
		for (Component component : components) {
			component.view();
		}
	}

	public Component addComponent(Component component) {
		component.setLevel(this.getLevel() + 1);
		components.add(component);
		return component;
	}

	public Component getComponentByName(String name) {
		for (Component component : components) {
			if (component.getName().equals(name)) {
				return component;
			}
		}
		return null;
	}

	public void deleteComponent(Component component) {
		components.remove(component);
	}
	
	public List<Component> getComponents(){
		return components; 
	}

}
