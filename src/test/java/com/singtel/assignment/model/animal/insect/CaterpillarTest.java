package com.singtel.assignment.model.animal.insect;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.singtel.assignment.model.animal.insect.Caterpillar;

public class CaterpillarTest {
	Stream<Method> methodsStream;

	@Before
	public void init() {
		methodsStream = Arrays.stream(Caterpillar.class.getMethods());
	}

	@Test
	public void givenCaterpillar_ThenCanNotFly() {
		boolean caterpillarCanFly = methodsStream
				.filter(x -> x.getName().equals("fly"))
				.findFirst().isPresent();

		assertFalse(caterpillarCanFly);
	}
	
	@Test
	public void givenCaterpillar_ThenCanWalk() {
		boolean caterpillarCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertTrue(caterpillarCanWalk);
	}
	
}
