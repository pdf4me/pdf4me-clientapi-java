package com.pdf4me.client;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.CreatePdfA;
import model.CreatePdfARes;
import model.Document;
import model.PdfAAction;
import model.PdfAAction.ComplianceEnum;

public class PdfAClient {

	private Pdf4meClient pdf4meClient;

	public PdfAClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined createPdfA is carried out.
	 * @param createPdfA
	 * @return CreatePdfARes
	 */
	public CreatePdfARes pdfA(CreatePdfA createPdfA) {

		// check validity of arguments
		checkCreatePdfAObjectValidity(createPdfA);
		// execute
		CreatePdfARes res = (CreatePdfARes) pdf4meClient.customHttp.post(createPdfA, CreatePdfARes.class, "PdfA/PdfA");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The PDF file gets converted to a PDF/A, designed for archiving.
	 * @param file
	 * @param compliance level
	 * @return PDF/A
	 */
	public byte[] createPdfA(byte[] file, ComplianceEnum pdfCompliance) {

		// setup createPdfA object
		CreatePdfA createPdfA = new CreatePdfA();

		// document
		Document document = new Document();
		document.setDocData(file);
		createPdfA.setDocument(document);

		// action
		PdfAAction pdfAAction = new PdfAAction();
		pdfAAction.setCompliance(pdfCompliance); 
		createPdfA.setPdfAAction(pdfAAction);

		CreatePdfARes res = pdfA(createPdfA);

		return res.getDocument().getDocData();

	}
	
	/**
	 * The PDF file gets converted to a PDF/A, designed for archiving.
	 * @param file
	 * @return PDF/A
	 */
	public byte[] createPdfA(byte[] file) {

		// setup createPdfA object
		CreatePdfA createPdfA = new CreatePdfA();

		// document
		Document document = new Document();
		document.setDocData(file);
		createPdfA.setDocument(document);

		// action
		PdfAAction pdfAAction = new PdfAAction();
		pdfAAction.setCompliance(ComplianceEnum.PDFA2B); 
		createPdfA.setPdfAAction(pdfAAction);

		CreatePdfARes res = pdfA(createPdfA);

		return res.getDocument().getDocData();

	}

	private void checkCreatePdfAObjectValidity(CreatePdfA createPdfA) {

		// check provided arguments
		if(createPdfA == null) {
			throw new Pdf4meClientException("The createPdfA parameter cannot be null.");
		}else if(createPdfA.getDocument() == null || createPdfA.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The createPdfA document cannot be null.");
		}else if(createPdfA.getPdfAAction() == null) {
			throw new Pdf4meClientException("The pdfAAction cannot be null.");
		}else if(createPdfA.getPdfAAction().getCompliance() == null) {
			throw new Pdf4meClientException("The compliance parameter of pdfAAction cannot be null.");
		}
	}

}
