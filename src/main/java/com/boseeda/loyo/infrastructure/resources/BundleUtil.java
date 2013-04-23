package com.boseeda.loyo.infrastructure.resources;

import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class BundleUtil {

	public static final String resolve(
	        String message,
	        String key,
	        Object[] parameters,
	        String bundleName,
	        Locale locale)
	    {
	        // assertion
	        if (key == null) {
	            return message;
	        }

	        ResourceBundle bundle;
	        String formatString;
	        try {
	                
	        	bundle = ResourceBundle.getBundle(bundleName, locale);

	            String s = bundle.getString(key);
	            formatString = String.format(s, parameters);
	            return formatString;
	        }
	        catch (MissingResourceException ex) {
	            return message;
	        }
	        catch (IllegalFormatException ife){
	        	return "--- CONVERSION EXCEPTION >>>>> "+key;
	        }
	    }
}
