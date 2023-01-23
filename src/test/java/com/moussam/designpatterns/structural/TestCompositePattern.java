package com.moussam.designpatterns.structural;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.structural.composite.Component;
import com.moussam.designpatterns.structural.composite.File;
import com.moussam.designpatterns.structural.composite.Folder;

class TestCompositePattern {

	@Test
	void testComposite() {
		Folder root = buildFolder();
		
		assertEquals(3, root.getComponents().size());
		assertEquals("Design patterns", root.getName());
		List<String> expectedSubfolderNames = Arrays.asList( "Creational pattern", "Structural pattern", "Behavioral pattern");
		List<String> subfolderNames = root.getComponents().stream().map(Component::getName).collect(Collectors.toList()); 

		assertEquals(expectedSubfolderNames, subfolderNames);
		
		root.view();
	}

	private Folder buildFolder() {
		Folder root = new Folder("Design patterns"); 
		Folder folder1 = new Folder("Creational pattern"); 
		Folder folder2 = new Folder("Structural pattern"); 
		Folder folder3 = new Folder("Behavioral pattern");
		
		// creational pattern folder
		Folder creationalPatternFolder = (Folder) root.addComponent(folder1);
		Folder creationFolder1 = (Folder) creationalPatternFolder.addComponent(new Folder("Cours"));
		creationFolder1.addComponent(new File("Builder"));
		creationFolder1.addComponent(new File("Singleton"));
		Folder creationFolder2 = (Folder) creationalPatternFolder.addComponent(new Folder("TPs"));
		creationFolder2.addComponent(new File("Builder.java"));
		creationFolder2.addComponent(new File("Singleton.java"));
		creationFolder2.addComponent(new Folder("resources"));
		

		Folder structuralPatternFolder = (Folder) root.addComponent(folder2);
		Folder structureFolder1 = (Folder) structuralPatternFolder.addComponent(new Folder("Cours"));
		structureFolder1.addComponent(new File("Decorator"));
		structureFolder1.addComponent(new File("Composite"));
		

		Folder behavioralPatternFolder = (Folder) root.addComponent(folder3);
		Folder comportementFolder1 = (Folder) behavioralPatternFolder.addComponent(new Folder("Cours"));
		comportementFolder1.addComponent(new File("Observer"));
		comportementFolder1.addComponent(new File("Strategy"));
		Folder comportementFolder2 = (Folder) behavioralPatternFolder.addComponent(new Folder("TPs"));
		comportementFolder2.addComponent(new File("Observer.java"));
		comportementFolder2.addComponent(new File("Strategy.java"));
		comportementFolder2.addComponent(new Folder("ressources"));
		
		return root;
	}

}
