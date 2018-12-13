package com.singtel.assignment.model.animal.fish;

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
import com.singtel.assignment.utils.animal.Color;
import com.singtel.assignment.utils.animal.Size;

public class SharkTest {
	
	Shark shark = new Shark();
	Stream<Method> methodsStream;
	
	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();
	
	@Before
	public void init() {
		methodsStream = Arrays.stream(shark.getClass().getMethods());
	}
	
	@Test
	public void givenAFish_ThenDoNotSing() {
		boolean sharkCanSing = methodsStream
				.filter(x -> x.getName().equals("sing"))
				.findFirst().isPresent();

		assertFalse(sharkCanSing);
	}
	
	@Test
	public void givenAFish_ThenDoNotWalk() {
		boolean sharkCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertFalse(sharkCanWalk);
	}
	
	@Test
	public void givenAShark_ThenCanSwim() {
		boolean sharkCanSwim = methodsStream
						.filter(x -> x.getName().equals("swim"))
						.findFirst().isPresent();
		
		assertTrue(sharkCanSwim);
	}
	
	@Test
	public void givenAShark_ThenSizeIsLarge() {
		assertTrue(Size.LARGE == shark.getSize());
	}
	
	@Test
	public void givenAShark_ThenColorIsGrey() {
		assertTrue(Color.GREY == shark.getColor());
	}
	
	@Test
	public void givenAShark_WhenEat_ThenEatOtherFish() {
		shark.eat();
        verify(SystemOutResource.getOut()).println(contains("I am eating other fish"));
	}
}
