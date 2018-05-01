package com.pdf4me.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.pdf4me.helper.CustomHttp;

public class Pdf4meClient {
	
	CustomHttp customHttp;
	
	private String propertyFile = "config.properties";

	/**
	 * Creates a Pdf4meClient with the following authorization information:
	 * @param clientId
	 * @param secret
	 */
	public Pdf4meClient(String clientId, String secret){
		
		customHttp = new CustomHttp(clientId, secret);
	}

	/**
	 * Creates a Pdf4meClient with the authorization information stored in the config.properties file.
	 */
	public Pdf4meClient(){
		
		try {
			// read clientId, secret and tenant from the property file
			FileInputStream in = new FileInputStream(propertyFile);
			Properties props = new Properties();
			props.load(in);
			
			String clientId = props.getProperty("clientId");
			String secret = props.getProperty("secret");
			
			in.close();
			
			customHttp = new CustomHttp(clientId, secret);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
