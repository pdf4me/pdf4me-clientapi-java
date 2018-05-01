package com.pdf4me.client;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.ConvertToPdf;
import model.ConvertToPdfAction;
import model.ConvertToPdfRes;
import model.Document;

public class ConvertClient {
	
	private Pdf4meClient pdf4meClient;

	public ConvertClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}
	
	/**
	 * The predefined converToPdf is carried out.
	 * @param convertToPdf
	 * @return ConvertToPdfRes
	 */
	public ConvertToPdfRes convertToPdf(ConvertToPdf convertToPdf) {

		// check validity of arguments
		checkOptimizeObjectValidity(convertToPdf);
		// execute
		ConvertToPdfRes res = (ConvertToPdfRes) pdf4meClient.customHttp.post(convertToPdf, ConvertToPdfRes.class, "Convert/ConvertToPdf");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The provided Non-PDF file gets converted to a PDF.
	 * @param file
	 * @param fileName (including extension)
	 * @return PDF version of the file
	 */
	public byte[] convertFileToPdf(byte[] file, String fileName) {

		// setup convertToPdf object
		ConvertToPdf convertToPdf = new ConvertToPdf();

		// document
		Document document = new Document();
		document.setDocData(file);
		document.setName(fileName);
		convertToPdf.setDocument(document);

		// action
		ConvertToPdfAction convertToPdfAction = new ConvertToPdfAction();
		convertToPdf.setConvertToPdfAction(convertToPdfAction);

		ConvertToPdfRes res = convertToPdf(convertToPdf);

		return res.getDocument().getDocData();

	}

	private void checkOptimizeObjectValidity(ConvertToPdf convertToPdf) {

		// check provided arguments
		if(convertToPdf == null) {
			throw new Pdf4meClientException("The convertToPdf parameter cannot be null.");
		}else if(convertToPdf.getDocument() == null || convertToPdf.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The convertToPdf document cannot be null.");
		}else if(convertToPdf.getConvertToPdfAction() == null) {
			throw new Pdf4meClientException("The convertToPdfAction cannot be null.");
		}
	}

}
