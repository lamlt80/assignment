package com.singtel.assignment.utils.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nHelper {
	
	public static String getDefaultMessage(String key) {
		ResourceBundle bundle = ResourceBundle.getBundle("AssignmentMessages");
		return bundle.getString(key);
	}
	
	public static String getMessage(Locale locale, String key) {
		ResourceBundle bundle = ResourceBundle.getBundle("AssignmentMessages", locale);
		return bundle.getString(key);
	}
}
