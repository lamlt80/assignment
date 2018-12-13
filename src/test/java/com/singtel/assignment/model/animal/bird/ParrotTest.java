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
import com.singtel.assignment.utils.animal.bird.ParrotType;

public class ParrotTest {
	
	Parrot parrot = new Parrot();
	Stream<Method> methodsStream;
	
	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();
	
	@Before
	public void init() {
		methodsStream = Arrays.stream(parrot.getClass().getMethods());
	}
	
	@Test
	public void givenAParrotLivingWithDog_WhenSing_ThenHasVoiceWoofwoof() {
		parrot = new Parrot(ParrotType.LIVING_NEAR_DOGS);
		parrot.sing();
        verify(SystemOutResource.getOut()).println(contains("Woof, woof"));
	}
	
	@Test
	public void givenAParrotLivingWithCat_WhenSing_ThenHasVoiceMeow() {
		parrot = new Parrot(ParrotType.LIVING_NEAR_CATS);
		parrot.sing();
        verify(SystemOutResource.getOut()).println(contains("Meow"));
	}
	
	@Test
	public void givenAParrotLivingWithRooster_WhenSing_ThenHasVoiceCock_a_doodle_doo() {
		parrot = new Parrot(ParrotType.LIVING_NEAR_ROOSTER);
		parrot.sing();
        verify(SystemOutResource.getOut()).println(contains("Cock-a-doodle-doo"));
	}
	
	@Test
	public void givenAParrot_ThenCanFly() {
		boolean parrotCanFly = methodsStream
						.filter(x -> x.getName().equals("fly"))
						.findFirst().isPresent();
		
		assertTrue(parrotCanFly);
	}
	
	@Test
	public void givenAParrot_ThenCanWalk() {
		boolean parrotCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertTrue(parrotCanWalk);				
	}

}
