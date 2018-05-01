package com.pdf4me.client;

import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.Document;
import model.Split;
import model.SplitAction;
import model.SplitRes;

public class SplitClient {

	private Pdf4meClient pdf4meClient;

	public SplitClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined split is carried out.
	 * @param split
	 * @return SplitRes
	 */
	public SplitRes split(Split split) {

		// check validity of arguments
		checkSplitObjectValidity(split);
		// execute
		SplitRes res = (SplitRes) pdf4meClient.customHttp.post(split, SplitRes.class, "Split/Split");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentsForErrors(res.getDocuments());
		}
		return res;
	}

	/**
	 * The provided PDF is split into two new documents. The split happens after the given pageNr.
	 * @param pageNr
	 * @param file
	 * @return two PDFs corresponding to the first and second part of the original PDF
	 */
	public List<byte[]> splitByPageNr(int pageNr, byte[] file){

		// setup split object
		Split split = new Split();

		// document
		Document document = new Document();
		document.setDocData(file);
		split.setDocument(document);

		// action
		SplitAction splitAction = new SplitAction();
		splitAction.setSplitAfterPage(pageNr);
		split.setSplitAction(splitAction);

		SplitRes res =  split(split);

		// extract the resulting documents
		List<Document> documents = res.getDocuments();
		List<byte[]> splitDocuments = new ArrayList<byte[]>();
		splitDocuments.add(documents.get(0).getDocData());
		splitDocuments.add(documents.get(1).getDocData());

		return splitDocuments;

	}

	private void checkSplitObjectValidity(Split split) {
		// check provided arguments
		if(split == null) {
			throw new Pdf4meClientException("The split parameter cannot be null.");
		}else if(split.getDocument() == null || split.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The split document cannot be null.");
		}else if(split.getSplitAction() == null) {
			throw new Pdf4meClientException("The splitAction cannot be null.");
		}else if(split.getSplitAction().getSplitAfterPage() == null) {
			throw new Pdf4meClientException("The splitAfterPage of splitAction cannot be null.");
		}else if(split.getSplitAction().getSplitAfterPage() == 0) {
			throw new Pdf4meClientException("The splitAfterPage of splitAction cannot be zero. The first page of a PDF corresponds to page number one.");
		}
	}

}
