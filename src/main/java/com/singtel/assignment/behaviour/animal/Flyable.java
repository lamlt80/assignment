package com.singtel.assignment.behaviour.animal;

public interface Flyable {
	default void fly() {
		System.out.println("I am flying");
	}
	
}
