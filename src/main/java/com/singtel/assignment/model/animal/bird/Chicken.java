package com.singtel.assignment.model.animal.bird;

import com.singtel.assignment.behaviour.animal.Walkable;

public class Chicken extends Bird implements Walkable {
	
	public Chicken() {
		super();
		this.name = "Chicken";
	}

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
}
