package com.boseeda.loyo.infrastructure.exception;

import com.boseeda.loyo.infrastructure.resources.IResourcesBundleName;

public class LunaServerException extends LunaException {	

	public LunaServerException(
        Throwable t,
        DefaultResourceKey resourcekey,
        Object[] parameters)
    {
        super(t, resourcekey.toString(), parameters, IResourcesBundleName.SERVER_BUNDLE_NAME);
    }
}
