package com.pdf4me.helper;

import java.util.List;

import model.DocLog;
import model.DocLog.DocLogLevelEnum;
import model.Document;

public class ResponseChecker {

	/**
	 * Checks the docLogs of a document for error messages.
	 * 
	 * @param doc
	 *            document to be check for errors
	 */
	public static void checkDocumentForErrors(Document doc) {

		List<DocLog> docLogs = doc.getDocLogs();

		// check all logs
		for (int i = 0; i < docLogs.size(); i++) {
			DocLog currentLog = docLogs.get(i);
			// in case an error occurred
			if (currentLog.getDocLogLevel() == DocLogLevelEnum.ERROR) {
				// print log
				throw new Pdf4meBackendException(currentLog);
			}
		}
	}

	/**
	 * Checks the documents for docLogs containing error messages.
	 * 
	 * @param docs
	 *            list of documents to be checked for errors
	 */
	public static void checkDocumentsForErrors(List<Document> docs) {

		// check all documents
		for (int i = 0; i < docs.size(); i++) {
			checkDocumentForErrors(docs.get(i));
		}

	}
}
