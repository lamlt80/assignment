package com.singtel.assignment.utils.animal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import com.singtel.assignment.model.animal.Animal;

public class AnimalCounter {

	public static int countFlyableAnimal(Animal... animals) {
		return count("fly", animals);
	}
	
	public static int countWalkableAnimal(Animal... animals) {
		return count("walk", animals);
	}
	
	public static int countSingableAnimal(Animal... animals) {
		return count("sing", animals);
	}
	
	public static int countSwimmableAnimal(Animal... animals) {
		return count("swim", animals);
	}
	
	private static int count(String behaviour, Animal... animals) {
		if (animals == null || animals.length == 0) {
			return 0;
		}

		AtomicInteger result = new AtomicInteger(0);

		Arrays.stream(animals).forEach(x -> {
			Arrays.stream(x.getClass().getMethods())
			.filter(y -> y.getName().equals(behaviour))
			.forEach(z -> result.set(result.get() + 1));
		});

		return result.get();
	}

}
