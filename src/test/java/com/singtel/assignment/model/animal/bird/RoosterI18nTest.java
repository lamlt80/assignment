package com.singtel.assignment.model.animal.bird;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;

import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.assignment.rules.SystemOutResource;

public class RoosterI18nTest {
	
	@Rule
	public final SystemOutResource systemOutResource = new SystemOutResource();
	
	@Test
	public void givenADefaultRooster_whenSay_thenHasVoiceCock_a_doodle_doo() {
		Rooster rooster = new Rooster();
		rooster.sing();
        verify(SystemOutResource.getOut()).println(contains("Cock-a-doodle-doo"));
	}
	
	@Test
	public void givenAVNRooster_whenSay_thenHasVoiceo_o_o() {
		Rooster rooster = new Rooster(new Locale("fr", "FR"));
		rooster.sing();
        verify(SystemOutResource.getOut()).println(contains("cocorico"));
	}

}
