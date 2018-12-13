package com.singtel.assignment.restful.controller;

import java.util.Map;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.assignment.model.animal.Animal;
import com.singtel.assignment.restful.service.AnimalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")
public class AnimalController {
	
	private AnimalService animalService;
	
	@Autowired
	AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}
	
	@GetMapping(path = "/animal/{type}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Animal> getAnimal(@NotBlank @PathVariable String type, @RequestParam Map<String, String> optionals) {
		
		log.info("get animal for type: {}", type);
		
		log.info("optionals: {}", optionals);
		
		Animal animal = animalService.get(type, optionals).get();
		
		log.info("return value: {}", animal);
		
		return ResponseEntity.ok(animal);
	}

}
