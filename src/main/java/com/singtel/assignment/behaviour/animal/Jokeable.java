package com.singtel.assignment.behaviour.animal;

public interface Jokeable {
	default void joke() {
		System.out.println("I am joking");
	}
}
