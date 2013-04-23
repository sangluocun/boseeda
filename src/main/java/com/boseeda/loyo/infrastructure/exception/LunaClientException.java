package com.boseeda.loyo.infrastructure.exception;

import com.boseeda.loyo.infrastructure.resources.IResourcesBundleName;

public class LunaClientException extends LunaException {	
	
    /**
     * @param t
     * @param resourcekey
     * @param parameters
     * @param bundleName
     */
    public LunaClientException(
        Throwable t,
        DefaultResourceKey resourcekey,
        Object[] parameters)
    {
        super(t, resourcekey.toString(), parameters, IResourcesBundleName.CLIENT_BUNDLE_NAME);
    }
}
