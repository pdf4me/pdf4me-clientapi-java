package com.pdf4me.helper;

public class Pdf4meClientException extends RuntimeException {

	// Parameterless Constructor
	public Pdf4meClientException() {
	}

	// Constructor that accepts a message
	public Pdf4meClientException(String message) {
		super(message);
	}
}