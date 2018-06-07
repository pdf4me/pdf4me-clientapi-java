package com.pdf4me.helper;

import com.google.gson.annotations.SerializedName;

public class ServerErrorMessage {

	@SerializedName("errorMessage")
	private String errorMessage;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
