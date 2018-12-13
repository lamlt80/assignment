package com.singtel.assignment.model.animal.bird;

import com.singtel.assignment.behaviour.animal.Flyable;
import com.singtel.assignment.behaviour.animal.Walkable;
import com.singtel.assignment.utils.animal.bird.ParrotType;

public class Parrot extends Bird implements Walkable, Flyable {
	
	private ParrotType parrotType;
	
	public Parrot() {
		super();
		this.name = "Parrot";
	}
	
	public Parrot(ParrotType parrotType) {
		super();
		this.name = "Parrot";
		this.parrotType = parrotType;
	}
	
	@Override
	public void sing() {
		if (this.parrotType == null) {
			super.sing();
		} else {
			System.out.println(this.parrotType.getWordToSing());
		}
	}
	
}
