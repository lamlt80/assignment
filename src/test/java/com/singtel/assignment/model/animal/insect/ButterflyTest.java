package com.singtel.assignment.model.animal.insect;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.singtel.assignment.model.animal.insect.Butterfly;

public class ButterflyTest {
	
	Stream<Method> methodsStream;

	@Before
	public void init() {
		methodsStream = Arrays.stream(Butterfly.class.getMethods());
	}

	@Test
	public void givenButterfly_ThenCanFly() {
		boolean butterflyCanFly = methodsStream
				.filter(x -> x.getName().equals("fly"))
				.findFirst().isPresent();

		assertTrue(butterflyCanFly);
	}
	
	@Test
	public void givenButterfly_ThenDoesNotMakeSound() {
		boolean butterflyMakeSound = methodsStream
				.filter(x -> x.getName().equals("makeSound"))
				.findFirst().isPresent();

		assertFalse(butterflyMakeSound);
	}
	
	@Test
	public void givenButterfly_ThenDoesNotSing() {
		boolean butterflyCanSing = methodsStream
				.filter(x -> x.getName().equals("sing"))
				.findFirst().isPresent();

		assertFalse(butterflyCanSing);
	}

}
