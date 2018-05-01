package com.pdf4me.helper;

import model.DocLog;

public class Pdf4meBackendException extends RuntimeException {

	// Parameterless Constructor
	public Pdf4meBackendException() {}

	// Constructor that accepts a message
	public Pdf4meBackendException(String message)
	{
		super(message);
	}

	// Constructor that accepts a DocLog
	public Pdf4meBackendException(DocLog docLog)
	{
		super(docLog.getMessage());
	}

}
