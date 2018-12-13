package com.singtel.assignment.restful.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AnimalRequest implements Serializable {

	private static final long serialVersionUID = 825155086307409373L;

	private List<Map<String, String>> animals;

	public List<Map<String, String>> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Map<String, String>> animals) {
		this.animals = animals;
	}
}
