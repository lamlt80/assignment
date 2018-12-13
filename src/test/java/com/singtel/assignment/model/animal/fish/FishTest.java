package com.singtel.assignment.model.animal.fish;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class FishTest {
	
	Fish fish = new Fish();
	Stream<Method> methodsStream;
	
	@Before
	public void init() {
		methodsStream = Arrays.stream(fish.getClass().getMethods());
	}
	
	@Test
	public void givenAFish_ThenCanNotSing() {
		boolean fishCanSing = methodsStream
				.filter(x -> x.getName().equals("sing"))
				.findFirst().isPresent();

		assertFalse(fishCanSing);
	}
	
	@Test
	public void givenAFish_ThenCanNotWalk() {
		boolean fishCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertFalse(fishCanWalk);
	}
	
	@Test
	public void givenAFish_ThenCanSwim() {
		boolean fishCanSwim = methodsStream
						.filter(x -> x.getName().equals("swim"))
						.findFirst().isPresent();
		
		assertTrue(fishCanSwim);
	}
	
}
