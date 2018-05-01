package com.pdf4me.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class CustomHttp {

	private CloseableHttpClient client = HttpClients.createDefault();	
	private BsonConverter bsonConverter = new BsonConverter();
	
	private String clientId;
	private String secret;
	
	public CustomHttp(String clientId, String secret) {
		this.clientId = clientId;
		this.secret =secret;
	}

	public <Req,Res> Res post(Req request, Class<?> returnType, String path) {
		try {

			HttpPost httpPost = postSetup(path);

			// convert request to bson
			byte[] bsonRequest = bsonConverter.toBson(request);
			
			// send request
			httpPost.setEntity(new ByteArrayEntity(bsonRequest));
			CloseableHttpResponse response = client.execute(httpPost);

			// read content from response
			HttpEntity entity = response.getEntity();
			InputStream content = entity.getContent();
			
			// convert response to Res
			byte[] answer = IOUtils.toByteArray(content);
			Res result = (Res) bsonConverter.fromBson(answer, returnType);

			return result;

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}


	public <Req,Res> void postSend(Req request, Class<?> returnType, String path) {
		try {

			HttpPost httpPost = postSetup(path);

			// convert request to bson
			byte[] bsonRequest = bsonConverter.toBson(request);

			// send request
			httpPost.setEntity(new ByteArrayEntity(bsonRequest));
			CloseableHttpResponse response = client.execute(httpPost);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public <Res> Res get(Class<?> returnType, String path) {

		try {

			HttpGet httpGet = getSetup(path);

			// send request
			CloseableHttpResponse response = client.execute(httpGet);

			// read content from response
			HttpEntity entity = response.getEntity();
			InputStream content = entity.getContent();

			// convert response to Res
			byte[] answer = IOUtils.toByteArray(content);
			Res result = (Res) bsonConverter.fromBson(answer, returnType);

			return result;

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}


	public <Res> void getSend(Class<?> returnType, String path) {

		try {

			HttpGet httpGet = getSetup(path);

			// send request
			CloseableHttpResponse response = client.execute(httpGet);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private HttpPost postSetup(String methodName) {
		
		// generate token
		String token = TokenGenerator.getToken(clientId, secret);

		// httpPost setup
		HttpPost httpPost = new HttpPost("https://api-dev.pdf4me.com/" + methodName);
		httpPost.addHeader("Authorization", "Bearer " + token);
		httpPost.addHeader("Content-Type", "application/bson");
		httpPost.addHeader("Accept", "application/bson");

		return httpPost;
	}

	private HttpGet getSetup(String methodName) {
		
		// generate token
		String token = TokenGenerator.getToken(clientId, secret);

		// httpPost setup
		HttpGet httpGet = new HttpGet("https://api-dev.pdf4me.com/" + methodName);
		httpGet.addHeader("Authorization", "Bearer " + token);
		httpGet.addHeader("Content-Type", "application/bson");
		httpGet.addHeader("Accept", "application/bson");

		return httpGet;
	}
}
