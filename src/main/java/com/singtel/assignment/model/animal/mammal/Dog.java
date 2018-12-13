package com.singtel.assignment.model.animal.mammal;

import com.singtel.assignment.behaviour.animal.Walkable;

public class Dog extends Mammal implements Walkable {
	
	public Dog() {
		super();
		this.name = "Dog";
	}

	public void bark() {
		System.out.println("Woof, woof");
	}

}
