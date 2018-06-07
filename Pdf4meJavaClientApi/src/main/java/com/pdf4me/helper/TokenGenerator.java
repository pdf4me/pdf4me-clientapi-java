package com.pdf4me.helper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.bson.internal.Base64;
import org.json.JSONObject;

import com.microsoft.aad.adal4j.AuthenticationCallback;
import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;

public class TokenGenerator {

	private String authString = "https://login.microsoftonline.com/" + "devynooxlive.onmicrosoft.com";

	private String clientId;
	private String secret;
	private String token = null;

	private ExecutorService service;

	// slack: time before expiration, when already a new token is acquired
	private int slack = 60; // 1min

	public TokenGenerator(String clientId, String secret) {
		this.clientId = clientId;
		this.secret = secret;
	}

	/**
	 * Loads or aquires the authorization token.
	 * 
	 * @return authorization token string
	 */
	public String getToken() {
		if (validToken()) {
			return token;
		} else {
			return getNewToken();
		}
	}

	/**
	 * Checks whether the stored token has not expired yet.
	 * 
	 * @return whether the stored token is still valid
	 */
	private Boolean validToken() {

		// check existence of token
		if (token == null) {
			return false;
		}

		// check expiration of token
		String tokenBody = token.split("\\.")[1];
		// decode base64
		byte[] valueDecoded = Base64.decode(tokenBody);
		String bodyString = new String(valueDecoded);
		// convert to json
		JSONObject json = new JSONObject(bodyString);
		// extract expiration time
		int exp = ((Integer) json.get("exp"));
		Long expiration = new Long(exp);
		expiration *= 1000;
		// check validity
		if (expiration - slack < System.currentTimeMillis()) {
			return false;
		}

		// return token
		return true;
	}

	/**
	 * Acquires a new token using the clientID and secret.
	 * 
	 * @return newly generated token
	 */
	private String getNewToken() {

		try {

			ClientCredential asyKey = new ClientCredential(clientId, secret);
			this.service = Executors.newFixedThreadPool(1);
			AuthenticationContext authenticationContext = new AuthenticationContext(authString, false, service);
			AuthenticationCallback ac = new AuthenticationCallback() {

				@Override
				public void onSuccess(AuthenticationResult result) {
					// TODO Auto-generated method stub
					// System.out.println("Token Generation Succeeded");
				}

				@Override
				public void onFailure(Throwable exc) {
					// TODO Auto-generated method stub
					// System.out.println("Token Generation Failed");
				}
			};

			Future<AuthenticationResult> res = authenticationContext.acquireToken(clientId, asyKey, ac);
			token = res.get().getAccessToken();
			this.service.shutdown();

		} catch (Exception e) {
			this.service.shutdown();
			e.printStackTrace();
		}
		return token;
	}
}