package com.singtel.assignment.model.animal.insect;

import com.singtel.assignment.behaviour.animal.Walkable;
import com.singtel.assignment.metamorphosis.animal.ButterflyMetamorphosisChain;
import com.singtel.assignment.metamorphosis.animal.ButterflyState;

public class Caterpillar extends Insect implements Walkable, ButterflyState {
	
	public Caterpillar() {
		this.name = "Caterpillar";
	}

	@Override
	public void metamorphosis(ButterflyMetamorphosisChain metamorphosisChain) {
		metamorphosisChain.setCurrentState(new Butterfly());
	}

}
