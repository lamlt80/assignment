package com.singtel.assignment.metamorphosis.animal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.assignment.model.animal.insect.Butterfly;
import com.singtel.assignment.model.animal.insect.Caterpillar;

public class ButterflyMetamorphosisChainTest {
	
	ButterflyMetamorphosisChain chain;
	
	@Before
	public void init() {
		chain = new ButterflyMetamorphosisChain();
	}
	
	@Test
	public void givenAButterflyMetamorphosisChain_ThenItStateIsCaterpillar() {
		Assert.assertTrue(chain.getCurrentState() instanceof Caterpillar);
	}
	
	@Test
	public void givenAButterflyMetamorphosisChain_ThenItStateTransformFromCaterpillarToButterfly() {
		Assert.assertTrue(chain.getCurrentState() instanceof Caterpillar);
		
		chain.metamorphosis();
		
		Assert.assertTrue(chain.getCurrentState() instanceof Butterfly);
	}
	
	@Test
	public void givenAButterflyMetamorphosisChain_ThenItStateTransformFromButterflyToCaterpillar() {
		Assert.assertTrue(chain.getCurrentState() instanceof Caterpillar);
		
		chain.metamorphosis();
		
		Assert.assertTrue(chain.getCurrentState() instanceof Butterfly);
		
		chain.metamorphosis();
		
		Assert.assertTrue(chain.getCurrentState() instanceof Caterpillar);
	}

}
