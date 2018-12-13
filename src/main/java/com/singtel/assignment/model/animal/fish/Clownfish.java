package com.singtel.assignment.model.animal.fish;

import com.singtel.assignment.utils.animal.Color;
import com.singtel.assignment.utils.animal.Size;

public class Clownfish extends Fish {
	
	public Clownfish() {
		this.name = "Clownfish";
		this.size = Size.SMALL;
		this.color = Color.ORANGE;
	}
	
	public void makeJokes() {
		System.out.println("I am making jokes");
	}
}
