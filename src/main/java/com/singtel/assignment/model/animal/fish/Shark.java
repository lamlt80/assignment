package com.singtel.assignment.model.animal.fish;

import com.singtel.assignment.utils.animal.Color;
import com.singtel.assignment.utils.animal.Size;

public class Shark extends Fish {
	
	public Shark() {
		this.name = "Shark";
		this.size = Size.LARGE;
		this.color = Color.GREY;
	}
	
	@Override
	public void eat() {
		System.out.println("I am eating other fish");
	}
}
