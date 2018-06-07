package jUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.SplitClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.Document;
import model.Split;
import model.SplitAction;
import model.SplitRes;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class SplitClientTest {

	private static Check check = new Check();
	private static TestFiles testFiles = new TestFiles();

	private static Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private static SplitClient splitClient = new SplitClient(pdf4meTestSetup.getPdf4meClient());

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	int pageNr = 2;

	public Split createSplit() {

		// setup split object
		Split split = new Split();

		// document
		Document document = new Document();
		byte[] file = testFiles.getPdfBytesLong();
		document.setDocData(file);
		split.setDocument(document);

		// action
		SplitAction splitAction = new SplitAction();
		splitAction.setSplitAfterPage(pageNr);
		split.setSplitAction(splitAction);

		return split;
	}

	@Test
	public void testSplitThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The split parameter cannot be null.");

		// request
		Split split = null;

		splitClient.split(split);

	}

	@Test
	public void testSplitDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The split document cannot be null.");

		// request
		Split split = createSplit();
		split.setDocument(null);

		splitClient.split(split);

	}

	@Test
	public void testSplitDocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The split document cannot be null.");

		// request
		Split split = createSplit();
		split.getDocument().setDocData(null);

		splitClient.split(split);

	}

	@Test
	public void testSplitSplitActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The splitAction cannot be null.");

		// request
		Split split = createSplit();
		split.setSplitAction(null);

		splitClient.split(split);

	}

	@Test
	public void testSplitSplitActionSplitAfterPageNullThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The splitAfterPage of splitAction cannot be null.");

		// request
		Split split = createSplit();
		split.getSplitAction().setSplitAfterPage(null);

		splitClient.split(split);

	}

	@Test
	public void testSplitSplitActionSplitAfterPageEmptyThrowsIllegalArgumentException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage(
				"The splitAfterPage of splitAction cannot be zero. The first page of a PDF corresponds to page number one.");

		// request
		Split split = createSplit();
		split.getSplitAction().setSplitAfterPage(0);

		splitClient.split(split);

	}

	@Test
	public void testSplitNoNullResponse() {

		// request
		Split split = createSplit();
		SplitRes res = splitClient.split(split);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocuments());
		assertNotNull(res.getDocuments().get(0));
		assertNotNull(res.getDocuments().get(1));
	}

	@Test
	public void testSplitNoEmptyResponse() {

		// request
		Split split = createSplit();
		SplitRes res = splitClient.split(split);

		// validation
		assertFalse(res.getDocuments().isEmpty());
	}

	@Test
	public void testSplitDocLength() {

		// request
		Split split = createSplit();
		SplitRes res = splitClient.split(split);

		List<Document> documents = res.getDocuments();

		int originalLength = testFiles.pdfLengthLong();
		int fileLength1 = documents.get(0).getDocData().length;
		int fileLength2 = documents.get(1).getDocData().length;

		// validation
		assertTrue(check.belowNotZero(fileLength1, originalLength));
		assertTrue(check.belowNotZero(fileLength2, originalLength));

	}

	@Test
	public void testSplitByPageNrNoNullResponse() {

		// request
		File file = testFiles.getPdfFileLong();

		List<byte[]> res = splitClient.splitByPageNr(pageNr, file);

		// validation
		assertNotNull(res);
	}

	@Test
	public void testSplitByPageNrDocLength() {

		// request
		File file = testFiles.getPdfFileLong();

		List<byte[]> res = splitClient.splitByPageNr(pageNr, file);

		int originalLength = testFiles.pdfLengthLong();
		int fileLength1 = res.get(0).length;
		int fileLength2 = res.get(1).length;

		// validation
		assertTrue(check.belowNotZero(fileLength1, originalLength));
		assertTrue(check.belowNotZero(fileLength2, originalLength));
	}
}
