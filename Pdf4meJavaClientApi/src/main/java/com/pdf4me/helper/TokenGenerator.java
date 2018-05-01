package com.pdf4me.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
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

	private static String propertyFile = "config.properties";
	
	private static String tenant = "devynooxlive.onmicrosoft.com";
	

	public static String getToken(String clientId, String secret) {

		String authString = "https://login.microsoftonline.com/" + tenant;

		try {

			// check validity of cached token
			String cachedToken = getCachedToken();

			if(cachedToken != "") {
				return cachedToken;
			}else {

				ClientCredential asyKey = new ClientCredential(clientId, secret);
				ExecutorService service = Executors.newFixedThreadPool(1);
				AuthenticationContext authenticationContext = new AuthenticationContext(authString, false, service);
				AuthenticationCallback ac = new AuthenticationCallback() {

					@Override
					public void onSuccess(AuthenticationResult result) {
						// TODO Auto-generated method stub
						//System.out.println("Success");
					}

					@Override
					public void onFailure(Throwable exc) {
						// TODO Auto-generated method stub
						System.out.println("Token Generation Failed");
					}
				};
				
				Future<AuthenticationResult> res = authenticationContext.acquireToken(clientId, asyKey, ac);
				String token = res.get().getAccessToken();
				service.shutdown();
				
				// cache token for next use
				cacheToken(token);
				
				return token;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "";
	}

	private static String getCachedToken() {

		try { 
			
			Properties prop = new Properties();
			// check existence of property file
			InputStream input = new FileInputStream(propertyFile);

			// load the property file
			prop.load(input);

			// check existence of key "token"
			if(!prop.containsKey("token")){
				return "";
			}
			
			// read token
			String token = prop.getProperty("token");

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
			if(expiration < System.currentTimeMillis()) {
				return "";
			}

			// return token
			return token;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// property file does not exist
			return "";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}

	private static void cacheToken(String token) {

		try {

			FileInputStream in = new FileInputStream(propertyFile);
			Properties props = new Properties();
			props.load(in);
			in.close();

			FileOutputStream out = new FileOutputStream(propertyFile);
			props.setProperty("token", token);
			props.store(out, null);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot find the file config.properties, please make sure it is present in the project folder.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}