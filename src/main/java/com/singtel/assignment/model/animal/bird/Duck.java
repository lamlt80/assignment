package com.singtel.assignment.model.animal.bird;

import com.singtel.assignment.behaviour.animal.Flyable;
import com.singtel.assignment.behaviour.animal.Swimmable;
import com.singtel.assignment.behaviour.animal.Walkable;

public class Duck extends Bird implements Walkable, Flyable, Swimmable {
	
	public Duck() {
		super();
		this.name = "Duck";
	}
	
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

}
