package com.boseeda.loyo.infrastructure.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandler {

	public static LunaServerException handleException(Class cls, Throwable e) {

		try {

			Logger logger = Logger.getLogger(cls.toString());
			logger.log(Level.SEVERE, e.toString(), e);

		} catch (Throwable t) {
			// Can't logging the exception
			System.out.println("Can't logging the exception due to following issue:");
			t.printStackTrace();
			System.out.println("The original exception was:");
			e.printStackTrace();
		}

		if (e instanceof LunaException) {

			return (LunaServerException) e;

		} else {

			return transferToLunaServerException(e);
		}

	}

	public static LunaServerException transferToLunaServerException(
			Throwable e) {

		DefaultResourceKey resourceKey = resourceKeyMapping(e);

		String[] parameters = { e.getMessage() };
		
		return new LunaServerException(e, resourceKey, parameters);

	}

	public static DefaultResourceKey resourceKeyMapping(Throwable e) {

		DefaultResourceKey resourceKey = null;

		if (e instanceof ArithmeticException) {
			resourceKey = DefaultResourceKey.ARITHMETIC_EXCEPTION;
		} else {
			// TBD;
		}

		return resourceKey;

	}
}
