package com.singtel.assignment.restful.service;

import static com.singtel.assignment.config.ErrorMessage.ASGMT_ERR_001;
import static com.singtel.assignment.config.ErrorMessage.ASGMT_ERR_002;
import static com.singtel.assignment.config.ErrorMessage.getErrorMsg;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import com.singtel.assignment.exception.AssignmentException;
import com.singtel.assignment.model.animal.Animal;
import com.singtel.assignment.utils.animal.bird.ParrotType;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AnimalService {
	
	public Optional<Animal> get(String type, Map<String, String> optionals) {

		Reflections reflections = new Reflections("com.singtel.assignment.model");

		Set<Class<? extends Animal>> allClasses = reflections.getSubTypesOf(Animal.class);

		Optional<Class<? extends Animal>> className = allClasses.parallelStream()
														.filter(x -> x.getName().endsWith(type)).findFirst();

		className.orElseThrow(() -> new AssignmentException(ASGMT_ERR_002, getErrorMsg(ASGMT_ERR_002, type)));
		
		Animal animal;
		try {
			switch (type) {
			case "Parrot":
				animal = className.get()
						.getConstructor(ParrotType.class)
						.newInstance(ParrotType.valueOf(optionals.get("ParrotType")));
				break;
				
			case "Rooster":
				animal = className.get()
						.getConstructor(Locale.class)
						.newInstance(new Locale(optionals.get("locale")));
				break;	

			default:
				animal = className.get().newInstance();
				break;
			}
		} catch (Exception e) {
			log.error("Error: {}", e);
			throw new AssignmentException(ASGMT_ERR_001, getErrorMsg(ASGMT_ERR_001, ""));
		}
			
		return Optional.of(animal);
	}

}
