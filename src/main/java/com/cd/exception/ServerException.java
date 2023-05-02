package com.cd.exception;

public class ServerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8302441835856323749L;

	public ServerException() {
		super();
	}

	public ServerException(String method) {
		super(String.format("Error during %s() GRPC from server", method));
	}

}
