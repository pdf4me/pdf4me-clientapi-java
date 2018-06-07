package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.JsonConverter;
import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.Split;
import model.SplitRes;

public class SplitClient {

	private Pdf4meClient pdf4meClient;

	public SplitClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined split is carried out.
	 * 
	 * @param split
	 *            split configuration
	 * @return SplitRes, contains the document splinters of the original PDF
	 *         document
	 */
	public SplitRes split(Split split) {

		// check validity of arguments
		checkSplitObjectValidity(split);
		// execute
		SplitRes res = (SplitRes) pdf4meClient.customHttp.postUniversalObject(split, SplitRes.class, "Split/Split");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentsForErrors(res.getDocuments());
		}
		return res;
	}

	/**
	 * Splits the PDF after the pageNr, this results in two smaller PDF documents.
	 * 
	 * @param pageNr
	 *            determines after which page the split takes place
	 * @param file
	 *            to split into two
	 * @return bytes of resulting file, can be directly written to file on disk
	 */
	public List<byte[]> splitByPageNr(int pageNr, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("pageNr", Integer.toString(pageNr)));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		// send request
		byte[] response = pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Split/SplitByPageNr");

		// extract the generated PDFs from the SplitRes
		JsonConverter jsonConverter = new JsonConverter();
		SplitRes res = (SplitRes) jsonConverter.fromJson(response, SplitRes.class);
		List<byte[]> pdfs = new ArrayList<byte[]>();
		pdfs.add(res.getDocuments().get(0).getDocData());
		pdfs.add(res.getDocuments().get(1).getDocData());

		return pdfs;

	}

	/**
	 * Checks whether the split object contains the essential information to be
	 * processed by the server.
	 * 
	 * @param split
	 *            object to be checked (validity)
	 */
	private void checkSplitObjectValidity(Split split) {
		// check provided arguments
		if (split == null) {
			throw new Pdf4meClientException("The split parameter cannot be null.");
		} else if (split.getDocument() == null || split.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The split document cannot be null.");
		} else if (split.getSplitAction() == null) {
			throw new Pdf4meClientException("The splitAction cannot be null.");
		} else if (split.getSplitAction().getSplitAfterPage() == null) {
			throw new Pdf4meClientException("The splitAfterPage of splitAction cannot be null.");
		} else if (split.getSplitAction().getSplitAfterPage() == 0) {
			throw new Pdf4meClientException(
					"The splitAfterPage of splitAction cannot be zero. The first page of a PDF corresponds to page number one.");
		}
	}
}
