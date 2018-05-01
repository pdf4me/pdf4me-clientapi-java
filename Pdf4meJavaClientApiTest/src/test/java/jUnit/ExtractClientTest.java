package jUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.ExtractClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.Document;
import model.Extract;
import model.ExtractAction;
import model.ExtractRes;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class ExtractClientTest {

	private Check check = new Check();
	private TestFiles testFiles = new TestFiles();
	
	private Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private ExtractClient extractClient = new ExtractClient(pdf4meTestSetup.getPdf4meClient());
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	List<Integer> pageNrs = Arrays.asList(1, 4);

	public Extract createExtract() {

		// setup extract object
		Extract extract = new Extract();

		// document
		Document document = new Document();
		byte[] file = testFiles.getPdfBytesLong();
		document.setDocData(file);
		extract.setDocument(document);

		// action
		ExtractAction extractAction = new ExtractAction();
		extractAction.setExtractPages(pageNrs);
		extract.setExtractAction(extractAction);

		return extract;
	}

	@Test
	public void testExtractThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The extract parameter cannot be null.");
		
		// request
		Extract extract = null;
		ExtractRes res = extractClient.extract(extract);
	}

	@Test
	public void testExtractDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The extract document cannot be null.");
		
		// request
		Extract extract = createExtract();
		extract.setDocument(null);

		ExtractRes res = extractClient.extract(extract);
	}

	@Test
	public void testExtractDocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The extract document cannot be null.");
		
		// request
		Extract extract = createExtract();
		extract.getDocument().setDocData(null);

		ExtractRes res = extractClient.extract(extract);
	}

	@Test
	public void testExtractExtractActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The extractAction cannot be null.");
		
		// request
		Extract extract = createExtract();
		extract.setExtractAction(null);

		ExtractRes res = extractClient.extract(extract);
	}

	@Test
	public void testExtractExtractActionExtractPagesNullThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The extractPages of extractAction cannot be null or empty.");
        
		// request
		Extract extract = createExtract();
		extract.getExtractAction().setExtractPages(null);

		ExtractRes res = extractClient.extract(extract);
	}


	@Test
	public void testExtractExtractActionExtractPagesEmptyThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The extractPages of extractAction cannot be null or empty.");
        
		// request
		Extract extract = createExtract();
		extract.getExtractAction().setExtractPages(new ArrayList<Integer>());

		ExtractRes res = extractClient.extract(extract);
	}
	
	@Test
	public void testExtractNoNullResponse() {

		// request
		Extract extract = createExtract();
		ExtractRes res = extractClient.extract(extract);

		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());
	}

	@Test
	public void testExtractDocLength() {

		// request
		Extract extract = createExtract();
		ExtractRes res = extractClient.extract(extract);

		Document document = res.getDocument();

		int originalLength = testFiles.pdfLengthLong();
		int shortendPdfLength = document.getDocData().length;

		// validation
		assertTrue(check.belowNotZero(shortendPdfLength, originalLength));

	}

	@Test
	public void testExtractPagesNoNullResponse() {

		// request
		byte[] file = testFiles.getPdfBytesLong();
		byte[] res = extractClient.extractPages(pageNrs, file);

		// validation
		assertNotNull(res);
	}

	@Test
	public void testExtractPagesDocLength() {

		// request
		byte[] file = testFiles.getPdfBytesLong();
		byte[] res = extractClient.extractPages(pageNrs, file);

		int originalLength = testFiles.pdfLengthLong();
		int shortendPdfLength = res.length;

		// validation
		assertTrue(check.belowNotZero(shortendPdfLength, originalLength));
	}

	
}
