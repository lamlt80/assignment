package com.singtel.assignment.model.animal.bird;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.assignment.rules.SystemOutResource;

public class BirdTest {
	
	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();
	
	@Test
	public void givenABird_WhenSing_ThenHasVoiceIamSinging() {
		Bird bird = new Bird();
        bird.sing();
        verify(SystemOutResource.getOut()).println(contains("I am singing"));
	}
}
