package com.singtel.assignment.model.animal.bird;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.singtel.assignment.rules.SystemOutResource;

public class ChickenTest {

	Chicken chicken = new Chicken();

	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();

	Stream<Method> methodsStream;

	@Before
	public void init() {
		methodsStream = Arrays.stream(chicken.getClass().getMethods());
	}

	@Test
	public void givenAChicken_WhenSing_ThenHasVoiceCluckcluck() {
		chicken.sing();
		verify(SystemOutResource.getOut()).println(contains("Cluck, cluck"));
	}

	@Test
	public void givenAChicken_ThenCanNotFly() {
		boolean chickenCanFly = methodsStream
				.filter(x -> x.getName().equals("fly"))
				.findFirst().isPresent();

		assertFalse(chickenCanFly);
	}
	
	@Test
	public void givenAChicken_ThenCanWalk() {
		boolean chickenCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertTrue(chickenCanWalk);				
	}

}
