package jUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.PdfAClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.CreatePdfA;
import model.CreatePdfARes;
import model.Document;
import model.PdfAAction;
import model.PdfAAction.ComplianceEnum;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class PdfAClientTest {
	
	private Check check = new Check();
	private TestFiles testFiles = new TestFiles();
	
	private Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private PdfAClient pdfAClient = new PdfAClient(pdf4meTestSetup.getPdf4meClient());
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	public CreatePdfA createPdfA() {

		// setup createPdfA object
		CreatePdfA createPdfA = new CreatePdfA();

		// document
		Document document = new Document();
		byte[] file = testFiles.getPdfBytesLong();
		document.setDocData(file);
		createPdfA.setDocument(document);

		// action
		PdfAAction pdfAAction = new PdfAAction();
		pdfAAction.setCompliance(ComplianceEnum.PDFA2U);
		createPdfA.setPdfAAction(pdfAAction);

		return createPdfA;
	}

	@Test
	public void testPdfAThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The createPdfA parameter cannot be null.");
        
		// request
		CreatePdfA createPdfA = null;
		CreatePdfARes res = pdfAClient.pdfA(createPdfA);
	}

	@Test
	public void testPdfADocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The createPdfA document cannot be null.");
        
		// request
		CreatePdfA createPdfA = createPdfA();
		createPdfA.setDocument(null);

		CreatePdfARes res = pdfAClient.pdfA(createPdfA);
	}

	@Test
	public void testPdfADocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The createPdfA document cannot be null.");
        
		// request
		CreatePdfA createPdfA = createPdfA();
		createPdfA.getDocument().setDocData(null);

		CreatePdfARes res = pdfAClient.pdfA(createPdfA);
	}

	@Test
	public void testCreatePdfAPdfAActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The pdfAAction cannot be null.");
        
		// request
		CreatePdfA createPdfA = createPdfA();
		createPdfA.setPdfAAction(null);

		CreatePdfARes res = pdfAClient.pdfA(createPdfA);
	}

	@Test
	public void testCreatePdfAPdfAActionComplianceThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The compliance parameter of pdfAAction cannot be null.");
        
		// request
		CreatePdfA createPdfA = createPdfA();
		createPdfA.getPdfAAction().setCompliance(null);

		CreatePdfARes res = pdfAClient.pdfA(createPdfA);
	}

	@Test
	public void testPdfANoNullResponse() {

		// request
		CreatePdfA createPdfA = createPdfA();
		CreatePdfARes res = pdfAClient.pdfA(createPdfA);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());

	}
	
	@Test
	public void testPdfADocLength() {

		// request
		CreatePdfA createPdfA = createPdfA();
		CreatePdfARes res = pdfAClient.pdfA(createPdfA);

		int originalLength = testFiles.pdfLengthLong();
		int pdfALength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.belowNotZero(pdfALength, originalLength));

	}
	
	@Test
	public void testCreatePdfANoNullResponse() {

		// request
		byte[] file = testFiles.getPdfBytesLong();
		byte[] res = pdfAClient.createPdfA(file);

		// validation
		assertNotNull(res);
		
		// request file and compliance level
		file = testFiles.getPdfBytesLong();
		res = pdfAClient.createPdfA(file, ComplianceEnum.PDFA2U);

		// validation
		assertNotNull(res);
	}

	@Test
	public void testCreatePdfADocLength() {

		// request file only
		byte[] file = testFiles.getPdfBytesLong();
		byte[] res = pdfAClient.createPdfA(file);

		int originalLength = testFiles.pdfLengthLong();
		int pdfALength = res.length;

		// validation
		assertTrue(check.belowNotZero(pdfALength, originalLength));
		
		// request file and compliance level
		file = testFiles.getPdfBytesLong();
		res = pdfAClient.createPdfA(file, ComplianceEnum.PDFA2U);

		originalLength = testFiles.pdfLengthLong();
		pdfALength = res.length;

		// validation
		assertTrue(check.belowNotZero(pdfALength, originalLength));
	}

}
