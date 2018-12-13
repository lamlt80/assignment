package com.singtel.assignment.model.animal.fish;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DolphinTest {

	Dolphin dolphin = new Dolphin();
	Stream<Method> methodsStream;

	@Before
	public void init() {
		methodsStream = Arrays.stream(dolphin.getClass().getMethods());
	}

	@Test
	public void givenADolphin_ThenDoNotSing() {
		boolean dolphinCanSing = methodsStream
				.filter(x -> x.getName().equals("sing"))
				.findFirst().isPresent();

		assertFalse(dolphinCanSing);
	}

	@Test
	public void givenADolphin_ThenDoNotWalk() {
		boolean dolphinCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertFalse(dolphinCanWalk);
	}

	@Test
	public void givenADolphin_ThenCanSwim() {

		boolean dolphinCanSwim = methodsStream
				.filter(x -> x.getName().equals("swim"))
				.findFirst().isPresent();

		assertTrue(dolphinCanSwim);
	}
}
