package com.singtel.assignment.model.animal.fish;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.singtel.assignment.utils.animal.Color;
import com.singtel.assignment.utils.animal.Size;

public class ClownfishTest {
	
	Clownfish clownFish = new Clownfish();
	Stream<Method> methodsStream;
	
	@Before
	public void init() {
		methodsStream = Arrays.stream(clownFish.getClass().getMethods());
	}
	
	@Test
	public void givenAClownfish_ThenCanSwim() {
		
		boolean clownfishCanSwim = methodsStream
						.filter(x -> x.getName().equals("swim"))
						.findFirst().isPresent();
		
		assertTrue(clownfishCanSwim);
	}
	
	@Test
	public void givenAFish_ThenDoNotSing() {
		boolean clownfishCanSing = methodsStream
				.filter(x -> x.getName().equals("sing"))
				.findFirst().isPresent();

		assertFalse(clownfishCanSing);
	}
	
	@Test
	public void givenAFish_ThenDoNotWalk() {
		boolean clownfishCanWalk = methodsStream
				.filter(x -> x.getName().equals("walk"))
				.findFirst().isPresent();

		assertFalse(clownfishCanWalk);
	}
	
	@Test
	public void givenAClownfish_ThenSizeIsSmall() {
		assertTrue(Size.SMALL == clownFish.getSize());
	}
	
	@Test
	public void givenAClownfish_ThenColorIsOrange() {
		assertTrue(Color.ORANGE == clownFish.getColor());
	}

}
