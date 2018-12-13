package com.singtel.assignment.model.animal;

import java.util.Locale;

import com.singtel.assignment.utils.animal.Color;
import com.singtel.assignment.utils.animal.Size;

import lombok.Getter;

@Getter
public abstract class Animal {
	protected String name;
	protected Color color;
	protected Size size;
	protected Locale locale;
	
	public void eat() {
		System.out.println("I am eating");
	}
	
	public Locale getLocale() {
		return locale;
	}
}
