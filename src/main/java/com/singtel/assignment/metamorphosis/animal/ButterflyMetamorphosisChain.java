package com.singtel.assignment.metamorphosis.animal;

import com.singtel.assignment.model.animal.insect.Caterpillar;

public class ButterflyMetamorphosisChain {

	private ButterflyState currentState;

	public ButterflyState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ButterflyState currentState) {
		this.currentState = currentState;
	}

	public ButterflyMetamorphosisChain() {
		this.currentState = new Caterpillar();
	}

	public void metamorphosis() {
		this.currentState.metamorphosis(this);
	}
}
