package jUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.ConvertClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.ConvertToPdf;
import model.ConvertToPdfAction;
import model.ConvertToPdfRes;
import model.Document;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class ConvertClientTest {

	private Check check = new Check();
	private TestFiles testFiles = new TestFiles();

	private Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private ConvertClient convertClient = new ConvertClient(pdf4meTestSetup.getPdf4meClient());

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	public ConvertToPdf createConvertToPdf(byte[] file, String fileName) {

		// setup convertToPdf object
		ConvertToPdf convertToPdf = new ConvertToPdf();

		// document
		Document document = new Document();
		document.setDocData(file);
		document.setName(fileName);
		convertToPdf.setDocument(document);

		// action
		ConvertToPdfAction convertToPdfAction = new ConvertToPdfAction();
		convertToPdf.setConvertToPdfAction(convertToPdfAction);

		return convertToPdf;
	}

	@Test
	public void testConvertToPdfThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The convertToPdf parameter cannot be null.");

		// request
		ConvertToPdf convertToPdf = null;
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);
	}

	@Test
	public void testConvertToPdfDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The convertToPdf document cannot be null.");

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getTextFileBytes(), testFiles.getTextFileName());
		convertToPdf.setDocument(null);

		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);
	}

	@Test
	public void testConvertToPdfDocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The convertToPdf document cannot be null.");

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getTextFileBytes(), testFiles.getTextFileName());
		convertToPdf.getDocument().setDocData(null);

		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);
	}

	@Test
	public void testConvertToPdfConvertToPdfActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The convertToPdfAction cannot be null.");

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getTextFileBytes(), testFiles.getTextFileName());
		convertToPdf.setConvertToPdfAction(null);

		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);
	}

	@Test
	public void testConvertToPdfTextNoNullResponse() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getTextFileBytes(), testFiles.getTextFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());
	}

	@Test
	public void testConvertToPdfTextDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getTextFileBytes(), testFiles.getTextFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.textFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));

	}

	@Test
	public void testConvertFileToPdfTextNoNullResponse() {

		// request
		byte[] textFile = testFiles.getTextFileBytes();
		String textFileName = testFiles.getTextFileName();
		byte[] res = convertClient.convertFileToPdf(textFile, textFileName);

		// validation
		assertNotNull(res);
	}

	@Test
	public void testConvertFileToPdfTextDocLength() {

		// request
		byte[] textFile = testFiles.getTextFileBytes();
		String textFileName = testFiles.getTextFileName();
		byte[] res = convertClient.convertFileToPdf(textFile, textFileName);

		int originalLength = testFiles.textFileLength();
		int pdfLength = res.length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));
	}

	// Word Doc

	@Test
	public void testConvertToPdfWordDocNoNullResponse() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getWordDocBytes(), testFiles.getWordDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());

	}


	@Test
	public void testConvertToPdfWordDocDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getWordDocBytes(), testFiles.getWordDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.wordDocFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));

	}

	// Excel File

	@Test
	public void testConvertToPdfExcelNoNullResponse() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getExcelDocBytes(), testFiles.getExcelDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());

	}


	@Test
	public void testConvertToPdfExcelDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getExcelDocBytes(), testFiles.getExcelDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.excelDocFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));

	}

	// EML File

	@Test
	public void testConvertToPdfEmlNoNullResponse() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getEmlDocBytes(), testFiles.getEmlDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());

	}


	@Test
	public void testConvertToPdfEmlDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getEmlDocBytes(), testFiles.getEmlDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.emlDocFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));

	}

	// Msg File

	@Test
	public void testConvertToPdfMsgNoNullResponse() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getMsgDocBytes(), testFiles.getMsgDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());

	}


	@Test
	public void testConvertToPdfMsgDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getMsgDocBytes(), testFiles.getMsgDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.msgDocFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));

	}

	// JPG File

	@Test
	public void testConvertToPdfJPGNoNullResponse() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getJPGDocBytes(), testFiles.getJPGDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());

	}


	@Test
	public void testConvertToPdfJPGDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getJPGDocBytes(), testFiles.getJPGDocFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.jpgDocFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.above(pdfLength, originalLength));

	}

	// Zip File

	@Test
	public void testConvertToPdfZipNoNullResponse() {
		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getzipBytes(), testFiles.getzipFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());
	}
	
	@Test
	public void testConvertToPdfZipDocLength() {

		// request
		ConvertToPdf convertToPdf = createConvertToPdf(testFiles.getzipBytes(), testFiles.getzipFileName());
		ConvertToPdfRes res = convertClient.convertToPdf(convertToPdf);

		int originalLength = testFiles.zipFileLength();
		int pdfLength = res.getDocument().getDocData().length;

		// validation
		assertTrue(check.belowNotZero(pdfLength, originalLength));

	}
}
