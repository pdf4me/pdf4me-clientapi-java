package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.CreatePdfA;
import model.CreatePdfARes;
import model.PdfAAction.ComplianceEnum;

public class PdfAClient {

	private Pdf4meClient pdf4meClient;

	public PdfAClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined PDF/A creation is carried out.
	 * 
	 * @param createPdfA
	 *            PDF/A configuration
	 * @return CreatePdfARes, contains generated PDF/A.
	 */
	public CreatePdfARes pdfA(CreatePdfA createPdfA) {

		// check validity of arguments
		checkCreatePdfAObjectValidity(createPdfA);
		// execute
		CreatePdfARes res = (CreatePdfARes) pdf4meClient.customHttp.postUniversalObject(createPdfA, CreatePdfARes.class,
				"PdfA/PdfA");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * Converts PDF documents to the PDF/A format for long-term archiving.
	 * 
	 * @param file
	 *            to be converted to PDF/A
	 * @param compliance
	 *            PDF/A compliance level
	 * @return PDF/A bytes of resulting file, can be directly written to file on
	 *         disk
	 */
	public byte[] createPdfA(ComplianceEnum pdfCompliance, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("pdfCompliance", pdfCompliance.getValue()));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/PdfA/CreatePdfA");

	}

	/**
	 * Converts PDF documents to the PDF/A format for long-term archiving.
	 * 
	 * @param file
	 *            to be converted to PDF/A
	 * @return PDF/A bytes of resulting file, can be directly written to file on
	 *         disk
	 */
	public byte[] createPdfA(File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/PdfA/CreatePdfA");

	}

	/**
	 * Checks whether the create_pdfA object contains the essential information to
	 * be processed by the server.
	 * 
	 * @param createPdfA
	 *            object to be checked (validity)
	 */
	private void checkCreatePdfAObjectValidity(CreatePdfA createPdfA) {

		// check provided arguments
		if (createPdfA == null) {
			throw new Pdf4meClientException("The createPdfA parameter cannot be null.");
		} else if (createPdfA.getDocument() == null || createPdfA.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The createPdfA document cannot be null.");
		} else if (createPdfA.getPdfAAction() == null) {
			throw new Pdf4meClientException("The pdfAAction cannot be null.");
		} else if (createPdfA.getPdfAAction().getCompliance() == null) {
			throw new Pdf4meClientException("The compliance parameter of pdfAAction cannot be null.");
		}
	}
}
