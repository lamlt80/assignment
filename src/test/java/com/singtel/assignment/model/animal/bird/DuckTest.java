package com.singtel.assignment.model.animal.bird;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.singtel.assignment.rules.SystemOutResource;

public class DuckTest {
	
	Duck duck = new Duck();
	Stream<Method> methodsStream;
	
	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();
	
	@Before
	public void init() {
		methodsStream = Arrays.stream(duck.getClass().getMethods());
	}
	
	@Test
	public void givenADuck_WhenSing_ThenHasVoiceQuackquack() {
		duck.sing();
        verify(SystemOutResource.getOut()).println(contains("Quack, quack"));
	}
	
	@Test
	public void givenADuck_ThenCanSwim() {
		
		boolean duckCanSwim = methodsStream
						.filter(x -> x.getName().equals("swim"))
						.findFirst().isPresent();
		
		assertTrue(duckCanSwim);
	}
	
	@Test
	public void givenADuck_ThenCanFly() {
		
		boolean verifyDuckCanFly = methodsStream
						.filter(x -> x.getName().equals("fly"))
						.findFirst().isPresent();
		
		assertTrue(verifyDuckCanFly);
	}
	
	@Test
	public void givenADuck_ThenCanWalk() {
		boolean duckCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertTrue(duckCanWalk);				
	}
}
