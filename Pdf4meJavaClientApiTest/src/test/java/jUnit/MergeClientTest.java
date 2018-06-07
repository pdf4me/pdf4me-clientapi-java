package jUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.MergeClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.Document;
import model.Merge;
import model.MergeAction;
import model.MergeRes;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class MergeClientTest {

	private static Check check = new Check();
	private static TestFiles testFiles = new TestFiles();

	private static Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private static MergeClient mergeClient = new MergeClient(pdf4meTestSetup.getPdf4meClient());

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	public Merge createMerge() {

		// setup merge object
		Merge merge = new Merge();

		// files
		byte[] file1 = testFiles.getPdfBytes();
		byte[] file2 = testFiles.getPdfBytesLong();

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

		return merge;
	}

	@Test
	public void testMergeThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge parameter cannot be null.");

		// request
		Merge merge = null;
		mergeClient.merge(merge);

	}

	@Test()
	public void testMergeDocumentsThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents cannot be null.");

		// request
		Merge merge = createMerge();
		merge.setDocuments(null);

		mergeClient.merge(merge);

	}

	@Test()
	public void testMergeDocumentsNumberThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents must contain at least two documents.");

		// request
		Merge merge = createMerge();
		List<Document> documents = new ArrayList<Document>();
		documents.add(new Document());
		merge.setDocuments(documents);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeDocument1ThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents must contain at least two documents.");

		// request
		Merge merge = createMerge();
		List<Document> documents = new ArrayList<Document>();
		merge.setDocuments(documents);

		MergeAction mergeAction = new MergeAction();
		merge.setMergeAction(mergeAction);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeDocument2ThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents must contain at least two documents.");

		// request
		Merge merge = new Merge();
		List<Document> documents = new ArrayList<Document>();
		Document doc1 = new Document();
		doc1.setDocData(testFiles.getPdfBytes());
		documents.add(doc1);
		merge.setDocuments(documents);

		MergeAction mergeAction = new MergeAction();
		merge.setMergeAction(mergeAction);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents cannot be null nor can the document.docData.");

		// request
		Merge merge = new Merge();
		List<Document> documents = new ArrayList<Document>();
		Document doc1 = new Document();
		doc1.setDocData(testFiles.getPdfBytes());
		documents.add(doc1);
		documents.add(null);
		merge.setDocuments(documents);

		MergeAction mergeAction = new MergeAction();
		merge.setMergeAction(mergeAction);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeDocumentData1ThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents cannot be null nor can the document.docData.");

		// request
		Merge merge = createMerge();
		merge.getDocuments().get(0).setDocData(null);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeDocumentData2ThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The merge documents cannot be null nor can the document.docData.");

		// request
		Merge merge = createMerge();
		merge.getDocuments().get(1).setDocData(null);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeMergeActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The mergeAction cannot be null.");

		// request
		Merge merge = createMerge();
		merge.setMergeAction(null);

		mergeClient.merge(merge);

	}

	@Test
	public void testMergeNoNullResponse() {

		// request
		Merge merge = createMerge();
		MergeRes res = mergeClient.merge(merge);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());
	}

	@Test
	public void testMergeDocLength() {

		// request
		Merge merge = createMerge();
		MergeRes res = mergeClient.merge(merge);

		int mergeLength = res.getDocument().getDocData().length;
		int originals = testFiles.pdfLength() + testFiles.pdfLengthLong();
		int shorterDoc = Math.min(testFiles.pdfLength(), testFiles.pdfLengthLong());

		// validation
		assertTrue(check.belowNotZero(mergeLength, originals));
		assertTrue(check.above(mergeLength, shorterDoc));
	}

	@Test
	public void testMerge2PdfsNoNullResponse() {

		// request
		File file1 = testFiles.getPdfFile();
		File file2 = testFiles.getPdfFileLong();

		byte[] res = mergeClient.merge2Pdfs(file1, file2);

		// validation
		assertNotNull(res);
	}

	@Test
	public void testMerge2PdfsDocLength() {

		// request
		File file1 = testFiles.getPdfFile();
		File file2 = testFiles.getPdfFileLong();

		byte[] res = mergeClient.merge2Pdfs(file1, file2);

		int mergeLength = res.length;
		int originals = testFiles.pdfLength() + testFiles.pdfLengthLong();
		int shorterDoc = Math.min(testFiles.pdfLength(), testFiles.pdfLengthLong());

		// validation
		assertTrue(check.belowNotZero(mergeLength, originals));
		assertTrue(check.above(mergeLength, shorterDoc));
	}

}
