package com.pdf4me.client;

import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.Document;
import model.Extract;
import model.ExtractAction;
import model.ExtractRes;

public class ExtractClient {

	private Pdf4meClient pdf4meClient;

	public ExtractClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined extract is carried out.
	 * @param extract
	 * @return ExtractRes
	 */
	public ExtractRes extract(Extract extract) {

		// check validity of arguments
		checkSplitObjectValidity(extract);
		// execute
		ExtractRes res = (ExtractRes) pdf4meClient.customHttp.post(extract, ExtractRes.class, "Extract/Extract");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The chosen pages will be extracted from the given PDF and form a new PDF.
	 * @param pageNrs to be extracted, the Integer 1 corresponds to the first page
	 * @param file
	 * @return new PDF containing the extracted pages
	 */
	public byte[] extractPages(List<Integer> pageNrs, byte[] file) {

		// setup extract object
		Extract extract = new Extract();

		// document
		Document document = new Document();
		document.setDocData(file);
		extract.setDocument(document);

		// action
		ExtractAction extractAction = new ExtractAction();
		extractAction.setExtractPages(pageNrs);
		extract.setExtractAction(extractAction);

		ExtractRes res = extract(extract);

		// extract the resulting document
		return res.getDocument().getDocData();
	}

	private void checkSplitObjectValidity(Extract extract) {

		// check provided arguments
		if(extract == null) {
			throw new Pdf4meClientException("The extract parameter cannot be null.");
		}else if(extract.getDocument() == null || extract.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The extract document cannot be null.");
		}else if(extract.getExtractAction() == null) {
			throw new Pdf4meClientException("The extractAction cannot be null.");
		}else if(extract.getExtractAction().getExtractPages() == null || extract.getExtractAction().getExtractPages().isEmpty()) {
			throw new Pdf4meClientException("The extractPages of extractAction cannot be null or empty.");
		}
	}

}
