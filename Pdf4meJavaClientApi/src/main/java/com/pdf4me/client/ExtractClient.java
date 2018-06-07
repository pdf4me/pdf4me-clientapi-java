package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.Extract;
import model.ExtractRes;

public class ExtractClient {

	private Pdf4meClient pdf4meClient;

	public ExtractClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined extraction is carried out.
	 * 
	 * @param extract
	 *            extraction configuration
	 * @return ExtractRes, contains extracted pages in form of a PDF
	 */
	public ExtractRes extract(Extract extract) {

		// check validity of arguments
		checkSplitObjectValidity(extract);
		// execute
		ExtractRes res = (ExtractRes) pdf4meClient.customHttp.postUniversalObject(extract, ExtractRes.class,
				"Extract/Extract");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The chosen pages will be extracted from the given PDF and form a new PDF.
	 * 
	 * @param pageNrs
	 *            the page numbers which will be extracted, number 1 corresponds to
	 *            the first page.
	 * @param file
	 *            to extract the pages from
	 * @return bytes of resulting file, can be directly written to file on disk
	 */
	public byte[] extractPages(String pageNrs, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("pageNrs", pageNrs));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Extract/ExtractPages");
	}

	/**
	 * Checks whether the extract object contains the essential information to be
	 * processed by the server.
	 * 
	 * @param extract
	 *            object to be checked (validity)
	 */
	private void checkSplitObjectValidity(Extract extract) {

		// check provided arguments
		if (extract == null) {
			throw new Pdf4meClientException("The extract parameter cannot be null.");
		} else if (extract.getDocument() == null || extract.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The extract document cannot be null.");
		} else if (extract.getExtractAction() == null) {
			throw new Pdf4meClientException("The extractAction cannot be null.");
		} else if (extract.getExtractAction().getExtractPages() == null
				|| extract.getExtractAction().getExtractPages().isEmpty()) {
			throw new Pdf4meClientException("The extractPages of extractAction cannot be null or empty.");
		}
	}
}
