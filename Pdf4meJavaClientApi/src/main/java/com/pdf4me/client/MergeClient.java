package com.pdf4me.client;

import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.Document;
import model.Merge;
import model.MergeAction;
import model.MergeRes;

public class MergeClient {

	private Pdf4meClient pdf4meClient;

	public MergeClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined merge is carried out.
	 * @param merge
	 * @return MergeRes
	 */
	public MergeRes merge(Merge merge) {

		// check validity of arguments
		checkMergeObjectValidity(merge);
		// execute
		MergeRes res = (MergeRes) pdf4meClient.customHttp.post(merge, MergeRes.class, "Merge/Merge");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The two provided PDFs are merged.
	 * @param file1
	 * @param file2
	 * @return merged PDF
	 */
	public byte[] merge2Pdfs(byte[] file1, byte[] file2) {

		// setup merge object
		Merge merge = new Merge();

		// documents
		List<Document> documents = new ArrayList<Document>();
		Document doc1 = new Document();
		Document doc2 = new Document();
		doc1.setDocData(file1);
		doc2.setDocData(file2);
		documents.add(doc1);
		documents.add(doc2);
		merge.setDocuments(documents);

		// action
		MergeAction mergeAction = new MergeAction();
		merge.setMergeAction(mergeAction);

		MergeRes res = merge(merge);

		return res.getDocument().getDocData();
	}

	private void checkMergeObjectValidity(Merge merge) {

		// check provided arguments
		if(merge == null) {
			throw new Pdf4meClientException("The merge parameter cannot be null.");
		}else if(merge.getDocuments() == null || 
				merge.getDocuments().isEmpty() || merge.getDocuments().get(0).getDocData() == null ||
				merge.getDocuments().size() < 2 || merge.getDocuments().get(1).getDocData() == null) {
			throw new Pdf4meClientException("The merge documents cannot be null.");
		}else if(merge.getMergeAction() == null) {
			throw new Pdf4meClientException("The mergeAction cannot be null.");
		}
	}
}
