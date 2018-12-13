package com.singtel.assignment.model.animal.bird;

import static org.junit.Assert.assertFalse;
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

public class RoosterTest {

	Rooster rooster = new Rooster();
	Stream<Method> methodsStream;
	
	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();
	
	@Before
	public void init() {
		methodsStream = Arrays.stream(rooster.getClass().getMethods());
	}
	
	@Test
	public void givenARooster_WhenSing_ThenHasVoiceCock_a_doodle_doo() {
		rooster.sing();
        verify(SystemOutResource.getOut()).println(contains("Cock-a-doodle-doo"));
	}
	
	@Test
	public void givenARooster_ThenCannotFly() {
		
		boolean roosterCanFly = methodsStream
				.filter(x -> x.getName().equals("fly"))
				.findFirst().isPresent();

		assertFalse(roosterCanFly);
	}
	
	@Test
	public void givenARooster_ThenCanWalk() {
		boolean roosterCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertTrue(roosterCanWalk);				
	}
}
