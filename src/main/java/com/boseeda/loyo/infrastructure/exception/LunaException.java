package com.boseeda.loyo.infrastructure.exception;

import java.util.Locale;

import com.boseeda.loyo.infrastructure.resources.BundleUtil;
import com.boseeda.loyo.infrastructure.resources.IResourcesBundleName;

public class LunaException extends Exception {

	private String bundleName = IResourcesBundleName.DEFAULT_BUNDLE_NAME;
	private String key;
	private Object[] parameters;
	private String localizedMessage;
		

	public LunaException(Throwable t, String resourcekey,
			Object[] parameters) {
		super(t);
		this.key = resourcekey;
		this.parameters = parameters;
		this.localizedMessage = resolveLocalizedMessage();
	}	
	
	public LunaException(Throwable t, String resourcekey,
			Object[] parameters, String bundleName) {
		super(t);
		this.key = resourcekey;
		this.parameters = parameters;
		this.bundleName = bundleName;
		this.localizedMessage = resolveLocalizedMessage();
	}

	
	private String resolve(String message, String key, Object[] parameters) {
		return resolve(message, key, parameters, Locale.getDefault());
	}

	
	private String resolve(String message, String key, Object[] parameters,
			Locale locale) {
		return BundleUtil.resolve(message, key, parameters, getBundleName(), locale);
	}

	public String resolveLocalizedMessage() {
		return resolve(getMessage(), key, parameters);
	}

	public String getLocalizedMessage(Locale locale) {
		return resolve(getMessage(), key, parameters, locale);
	}

	public String getKey() {
		return key;
	}

	public Object[] getParameters() {
		return parameters;
	}

	public String getBundleName() {
		return bundleName;
	}
	
	public void setBundleName(String bundleName ) {
		this.bundleName = bundleName;
	}
	
	public String getLocalizedMessage() {
		return localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
}
