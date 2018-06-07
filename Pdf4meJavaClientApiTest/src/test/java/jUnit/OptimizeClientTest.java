package jUnit;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.OptimizeClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.Document;
import model.Optimize;
import model.OptimizeAction;
import model.OptimizeAction.ProfileEnum;
import model.OptimizeRes;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class OptimizeClientTest {

	private static Check check = new Check();
	private static TestFiles testFiles = new TestFiles();

	private static Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private static OptimizeClient optimizeClient = new OptimizeClient(pdf4meTestSetup.getPdf4meClient());

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	public Optimize createOptimize() {

		Optimize optimize = new Optimize();

		// document
		Document document = new Document();
		byte[] data = testFiles.getPdfBytes();
		document.setDocData(data);
		optimize.setDocument(document);

		// action
		OptimizeAction optimizeAction = new OptimizeAction();
		optimizeAction.useProfile(true);
		optimizeAction.profile(ProfileEnum.DEFAULT);
		optimize.setOptimizeAction(optimizeAction);

		return optimize;
	}

	@Test
	public void testOptimizeThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The optimize parameter cannot be null.");

		// request
		Optimize optimize = null;

		optimizeClient.optimize(optimize);
	}

	@Test
	public void testOptimizeDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The optimize document cannot be null.");

		// request
		Optimize optimize = createOptimize();
		optimize.setDocument(null);

		optimizeClient.optimize(optimize);
	}

	@Test
	public void testOptimizeDocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The optimize document cannot be null.");

		// request
		Optimize optimize = createOptimize();
		optimize.getDocument().setDocData(null);

		optimizeClient.optimize(optimize);
	}

	@Test
	public void testOptimizeOptimizeActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The optimizeAction cannot be null.");

		// request
		Optimize optimize = createOptimize();
		optimize.setOptimizeAction(null);

		optimizeClient.optimize(optimize);
	}

	@Test
	public void testOptimizeOptimizeActionUseProfileThrowsIllegalArgumentExceptio() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The useProfile parameter of optimizeAction has to be set to true.");

		// request
		Optimize optimize = createOptimize();
		optimize.getOptimizeAction().useProfile(false);

		optimizeClient.optimize(optimize);
	}

	@Test
	public void testOptimizeOptimizeActionProfileThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
		thrown.expectMessage("The profile parameter of optimizeAction cannot be null.");

		// request
		Optimize optimize = createOptimize();
		optimize.getOptimizeAction().setProfile(null);

		optimizeClient.optimize(optimize);
	}

	@Test
	public void testOptimizeNullResponse() {

		// request
		Optimize optimize = createOptimize();
		OptimizeRes res = optimizeClient.optimize(optimize);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());
	}

	@Test
	public void testOptimizeDocLength() {

		// request
		Optimize optimize = createOptimize();
		OptimizeRes res = optimizeClient.optimize(optimize);

		int optimizedPdf = res.getDocument().getDocData().length;
		int originalPdf = testFiles.pdfLength();

		// validation
		assert (check.belowNotZero(optimizedPdf, originalPdf));
	}

	@Test
	public void testOptimizeByProfileNoNullResponse() {

		// request
		File file = testFiles.getPdfFile();
		byte[] optimizedFile = optimizeClient.optimizeByProfile(ProfileEnum.MAX, file);

		// validation
		assertNotNull(optimizedFile);

	}

	@Test
	public void testOptimizeByProfileDocLength() {

		// request
		File file = testFiles.getPdfFile();
		byte[] optimizedFile = optimizeClient.optimizeByProfile(ProfileEnum.MAX, file);

		// validation
		assert (check.belowNotZero(optimizedFile.length, testFiles.pdfLength()));

	}
}
