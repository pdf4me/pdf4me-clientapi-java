package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.ConvertToPdf;
import model.ConvertToPdfRes;

public class ConvertClient {

	private Pdf4meClient pdf4meClient;

	public ConvertClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined converToPdf is carried out.
	 * 
	 * @param convertToPdf
	 *            PDF conversion configuration
	 * @return ConvertToPdfRes, contains generated PDF
	 */
	public ConvertToPdfRes convertToPdf(ConvertToPdf convertToPdf) {

		// check validity of arguments
		checkOptimizeObjectValidity(convertToPdf);
		// execute
		ConvertToPdfRes res = (ConvertToPdfRes) pdf4meClient.customHttp.postUniversalObject(convertToPdf,
				ConvertToPdfRes.class, "Convert/ConvertToPdf");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The provided Non-PDF file gets converted to a PDF
	 * 
	 * @param fileName
	 *            the name of the provided file (including the file extension)
	 * @param file
	 *            to be converted to PDF
	 * @return bytes of resulting PDF file, can be directly written to file on disk
	 */
	public byte[] convertFileToPdf(String fileName, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("fileName", fileName));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Convert/ConvertFileToPdf");

	}

	/**
	 * Checks whether the convertToPdf object contains the essential information to
	 * be processed by the server.
	 * 
	 * @param convertToPdf
	 *            object to be checked (validity)
	 */
	private void checkOptimizeObjectValidity(ConvertToPdf convertToPdf) {

		// check provided arguments
		if (convertToPdf == null) {
			throw new Pdf4meClientException("The convertToPdf parameter cannot be null.");
		} else if (convertToPdf.getDocument() == null || convertToPdf.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The convertToPdf document cannot be null.");
		} else if (convertToPdf.getDocument().getName() == null) {
			throw new Pdf4meClientException(
					"The name field of convertToPdf's document cannot be null (name must incl. file extension).");
		} else if (convertToPdf.getConvertToPdfAction() == null) {
			throw new Pdf4meClientException("The convertToPdfAction cannot be null.");
		}
	}
}
