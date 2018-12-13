package com.singtel.assignment.model.animal.bird;

public class RoosterWithoutInheritance {
	
	private Chicken chicken;
	private String name;
	
	public RoosterWithoutInheritance() {
		this.name = "Rooster";
		this.chicken = new Chicken();
	}
	
	public String getName() {
		return name;
	}

	public void walk() {
		this.chicken.walk();
	} 
	
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}

}
