package com.singtel.assignment.utils.animal.bird;

public enum ParrotType {
	
	LIVING_NEAR_DOGS("Woof, woof"),
	LIVING_NEAR_CATS("Meow"),
	LIVING_NEAR_ROOSTER("Cock-a-doodle-doo");
	
	private String wordToSing;
	
	ParrotType(String wordToSing) {
		this.wordToSing = wordToSing;
	}

	public String getWordToSing() {
		return wordToSing;
	}
	
}
