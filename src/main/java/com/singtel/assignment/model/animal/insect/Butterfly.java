package com.singtel.assignment.model.animal.insect;

import com.singtel.assignment.behaviour.animal.Flyable;
import com.singtel.assignment.metamorphosis.animal.ButterflyMetamorphosisChain;
import com.singtel.assignment.metamorphosis.animal.ButterflyState;

public class Butterfly extends Insect implements Flyable, ButterflyState  {
	
	public Butterfly() {
		this.name = "Butterfly";
	}

	@Override
	public void metamorphosis(ButterflyMetamorphosisChain metamorphosisChain) {
		metamorphosisChain.setCurrentState(new Caterpillar());;
	}

}
