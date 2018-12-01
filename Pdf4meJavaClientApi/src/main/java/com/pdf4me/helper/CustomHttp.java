package com.pdf4me.helper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class CustomHttp {

	private CloseableHttpClient client = HttpClients.createDefault();
	private JsonConverter jsonConverter = new JsonConverter();
//	private TokenGenerator tokenGenerator;
    private String basicToken ;
	public CustomHttp(String basicToken) {
	//	this.tokenGenerator = new TokenGenerator(basicToken);
		this.basicToken = basicToken;
	}

	/**
	 * Sends a post request to the specified controller with the given
	 * universalObject as a body.
	 * 
	 * @param request
	 *            object to be sent
	 * @param returnType
	 *            type of expected response
	 * @param path
	 *            controller
	 * @return an object of type returnType
	 */
	public <Req, Res> Res postUniversalObject(Req request, Class<?> returnType, String path) {
		try {

			// prepare request header
			HttpPost httpPost = postSetup(path);
			httpPost.addHeader("Content-Type", "application/json");

			// convert request to json
			byte[] jsonRequest = jsonConverter.toJson(request);

			// send request
			httpPost.setEntity(new ByteArrayEntity(jsonRequest));
			CloseableHttpResponse response = client.execute(httpPost);

			// check status code
			checkStatusCode(response);

			// read content from response
			HttpEntity entity = response.getEntity();
			InputStream content = entity.getContent();

			// convert response to Res
			byte[] answer = IOUtils.toByteArray(content);
			Res result = (Res) jsonConverter.fromJson(answer, returnType);

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

	/**
	 * Builds a post requests from the given parameters.
	 * 
	 * @param params
	 *            List of (key, value) tuples, storing the parameters to be sent to
	 *            the server
	 * @param fileUploads
	 *            List of (key, value) tuples, storing the files to be uploaded to
	 *            the server
	 * @param path
	 *            controller
	 * @return
	 */
	public byte[] postWrapper(List<Tuple<String, String>> params, List<Tuple<String, File>> fileUploads, String path) {

		try {

			// prepare request header
			HttpPost httpPost = postSetup(path);

			// MultipartEntityBuilder
			MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();

			// set params
			for (Tuple<String, String> entry : params) {
				multipartEntityBuilder.addTextBody(entry.getLeft(), entry.getRight());
			}

			// set files to be uploaded
			for (Tuple<String, File> entry : fileUploads) {
				multipartEntityBuilder.addBinaryBody(entry.getLeft(), entry.getRight(),
						ContentType.create("application/octet-stream"), "pdf.pdf");
			}

			// send request
			httpPost.setEntity(multipartEntityBuilder.build());
			CloseableHttpResponse response = client.execute(httpPost);

			// check status code
			checkStatusCode(response);

			// read content from response
			HttpEntity entity = response.getEntity();
			InputStream content = entity.getContent();

			byte[] answer = IOUtils.toByteArray(content);

			return answer;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Configures the HTTP Post Header.
	 * 
	 * @param methodName
	 *            controller
	 * @return HTTP post instance
	 */
	private HttpPost postSetup(String methodName) {

		// generate token
		//String token = tokenGenerator.getToken();

		// httpPost setup
		HttpPost httpPost = new HttpPost("https://api-dev.pdf4me.com/" + methodName);
		//httpPost.addHeader("Authorization", "Bearer " + token);
		httpPost.addHeader("Authorization", "Basic " + this.basicToken);
		httpPost.addHeader("Accept", "application/json");

		return httpPost;
	}

	/**
	 * Checks whether the status code is either 200 or 204, otw. throws a
	 * Pdf4meBackendException.
	 * 
	 * @param response
	 *            HTTP post response
	 */
	private void checkStatusCode(CloseableHttpResponse response) {

		try {
			// check status code
			int statusCode = response.getStatusLine().getStatusCode();

			// internal server error
			if (statusCode == 500) {
				String responsePhrase = response.getStatusLine().getReasonPhrase();
				// server error message extraction
				byte[] responseContent = IOUtils.toByteArray(response.getEntity().getContent());
				ServerErrorMessage serverErrorMessage = (ServerErrorMessage) jsonConverter.fromJson(responseContent,
						ServerErrorMessage.class);
				String errMsg = serverErrorMessage.getErrorMessage();
				throw new Pdf4meBackendException("HTTP 500 " + responsePhrase + " : " + errMsg);
			} // any kind of error
			else if (statusCode != 200 && statusCode != 204) {
				String responsePhrase = response.getStatusLine().getReasonPhrase();
				String errMsg = new String(IOUtils.toByteArray(response.getEntity().getContent()));
				throw new Pdf4meBackendException("HTTP " + statusCode + ": " + responsePhrase + " : " + errMsg);
			}
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
