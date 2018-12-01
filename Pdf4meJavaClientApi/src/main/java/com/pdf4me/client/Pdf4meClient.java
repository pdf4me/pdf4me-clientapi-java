package com.pdf4me.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.pdf4me.helper.CustomHttp;
import com.pdf4me.helper.Pdf4meClientException;

public class Pdf4meClient {

	CustomHttp customHttp;

	/**
	 * Creates a Pdf4meClient with the following authorization information:
	 * 
	 * @param clientId
	 * @param secret
	 */
	public Pdf4meClient(String tokenType, String token) {

		if (token == null || token == "") {
			throw new Pdf4meClientException("Please provide a valid token.");
		} 
//		else if (secret == null || secret == "") {
//			throw new Pdf4meClientException("Please provide a valid secret.");
//		}

		customHttp = new CustomHttp(token);
	}

	/**
	 * Creates a Pdf4meClient with the authorization information stored in the
	 * config.properties file. The config.properties file is stored in the
	 * pathToConfigFile location.
	 * 
	 * @param pathToConfigFile
	 *            path to the config.properties file
	 */
	public Pdf4meClient(String pathToConfigFile) {

		try {
			// read clientId, secret and tenant from the property file
			InputStream in = getClass().getClassLoader().getResourceAsStream(pathToConfigFile);
			//FileInputStream in = new FileInputStream(pathToConfigFile);
			Properties props = new Properties();
			props.load(in);

			String basicToken = props.getProperty("basic_token");
			//String secret = props.getProperty("");

			if (basicToken == null) {
				throw new Pdf4meClientException(
						"Please store your basic?token in the 'config.properies' file on the following path: "
								+ pathToConfigFile + "."
								+ " Or else provide your basicToken  in the Pdf4meClient constructor.");
			}
//			 else if (secret == null) {
//				throw new Pdf4meClientException(
//						"Please provide your secret in the 'config.properies' file on the following path: "
//								+ pathToConfigFile + "."
//								+ " Or else provide your clientId and secret in the Pdf4meClient constructor.");
//			}

			in.close();

			customHttp = new CustomHttp(basicToken);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new Pdf4meClientException("Please make sure there is a 'config.properties' file on this path: "
					+ pathToConfigFile + ". " + "The 'config.properties' must store the properties clientId and secret."
					+ " Or else provide your clientId and secret in the Pdf4meClient constructor.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Creates a Pdf4meClient with the authorization information stored in the
	 * config.properties file. The config.properties file is stored at the default
	 * location, the source folder.
	 */
	public Pdf4meClient() {
		this("config.properties");
	}
}
