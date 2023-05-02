package com.cd.exception;

public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4393492614626637492L;

	public NotFoundException() {
		super("Object cannot be found.");
	}

	public NotFoundException(String message) {
		super(message);
	}

}
