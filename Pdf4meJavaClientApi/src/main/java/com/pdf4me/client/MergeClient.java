package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.Document;
import model.Merge;
import model.MergeRes;

public class MergeClient {

	private Pdf4meClient pdf4meClient;

	public MergeClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined merge is carried out.
	 * 
	 * @param merge
	 *            merge configuration
	 * @return MergeRes, contains merged PDF
	 */
	public MergeRes merge(Merge merge) {

		// check validity of arguments
		checkMergeObjectValidity(merge);
		// execute
		MergeRes res = (MergeRes) pdf4meClient.customHttp.postUniversalObject(merge, MergeRes.class, "Merge/Merge");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * Merges the two provided PDF files.
	 * 
	 * @param file1
	 *            first PDF
	 * @param file2
	 *            second PDF
	 * @return bytes of resulting file, can be directly written to file on disk
	 */
	public byte[] merge2Pdfs(File file1, File file2) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file1", file1));
		uploadFiles.add(new Tuple("file2", file2));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Merge/Merge2Pdfs");
	}

	/**
	 * Checks whether the merge object contains the essential information to be
	 * processed by the server.
	 * 
	 * @param merge
	 *            object to be checked (validity)
	 */
	private void checkMergeObjectValidity(Merge merge) {

		if (merge == null) {
			throw new Pdf4meClientException("The merge parameter cannot be null.");
		} else if (merge.getDocuments() == null) {
			throw new Pdf4meClientException("The merge documents cannot be null.");
		} else if (merge.getMergeAction() == null) {
			throw new Pdf4meClientException("The mergeAction cannot be null.");
		}

		// check whether there are at least two documents
		int numDocs = merge.getDocuments().size();
		if (numDocs < 2) {
			throw new Pdf4meClientException("The merge documents must contain at least two documents.");
		}
		// check whether all documents are not undefined neither is their docData
		List<Document> docs = merge.getDocuments();
		for (int i = 0; i < numDocs; i++) {
			Document currentDoc = docs.get(i);
			if (currentDoc == null || currentDoc.getDocData() == null) {
				throw new Pdf4meClientException("The merge documents cannot be null nor can the document.docData.");
			}
		}
	}
}
