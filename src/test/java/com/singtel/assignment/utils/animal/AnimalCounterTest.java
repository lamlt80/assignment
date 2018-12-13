package com.singtel.assignment.utils.animal;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.assignment.model.animal.Animal;
import com.singtel.assignment.model.animal.bird.Bird;
import com.singtel.assignment.model.animal.bird.Chicken;
import com.singtel.assignment.model.animal.bird.Duck;
import com.singtel.assignment.model.animal.bird.Parrot;
import com.singtel.assignment.model.animal.bird.Rooster;
import com.singtel.assignment.model.animal.fish.Clownfish;
import com.singtel.assignment.model.animal.fish.Dolphin;
import com.singtel.assignment.model.animal.fish.Fish;
import com.singtel.assignment.model.animal.fish.Shark;
import com.singtel.assignment.model.animal.insect.Butterfly;
import com.singtel.assignment.model.animal.mammal.Dog;


public class AnimalCounterTest {
	
	Animal[] animals;
	
	@Before
	public void init() {
		animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Butterfly(),
				new Dog()
				};
	}
	
	@Test
	public void countFlyable() {
		int result = AnimalCounter.countFlyableAnimal(animals);
		assertTrue(result == 3);
	}
	
	@Test
	public void countWalkable() {
		int result = AnimalCounter.countWalkableAnimal(animals);
		assertTrue(result == 5);
	}
	
	@Test
	public void countSingable() {
		int result = AnimalCounter.countSingableAnimal(animals);
		assertTrue(result == 5);
	}
	
	@Test
	public void countSwimmable() {
		int result = AnimalCounter.countSwimmableAnimal(animals);
		assertTrue(result == 5);
	}

}
