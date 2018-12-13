package com.singtel.assignment.model.animal.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.singtel.assignment.metamorphosis.animal.ButterflyMetamorphosisChainTest;
import com.singtel.assignment.model.animal.insect.ButterflyTest;
import com.singtel.assignment.model.animal.insect.CaterpillarTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({ 
	ButterflyMetamorphosisChainTest.class, 
	ButterflyTest.class, 
	CaterpillarTest.class 
})
public class ButterflyStateTestSuite {

}
