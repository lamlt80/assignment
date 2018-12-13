package com.singtel.assignment.model.animal.bird;

import java.util.Locale;

import com.singtel.assignment.utils.i18n.I18nHelper;

public class Rooster extends Chicken {
	
	public Rooster() {
		this.name = "Rooster";
		this.locale = Locale.getDefault();
	}
	
	public Rooster(Locale locale) {
		this.name = "Rooster";
		this.locale = locale;
	}
	
	@Override
	public void sing() {
		System.out.println(I18nHelper.getMessage(this.locale, "rooster.say"));
	}
}
