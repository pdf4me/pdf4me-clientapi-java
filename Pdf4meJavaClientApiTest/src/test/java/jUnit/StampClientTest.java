package jUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.StampClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.Document;
import model.Stamp;
import model.StampAction;
import model.StampRes;
import model.Text;
import model.StampAction.AlignXEnum;
import model.StampAction.AlignYEnum;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class StampClientTest {

	private Check check = new Check();
	private TestFiles testFiles = new TestFiles();
	
	private Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private StampClient stampClient = new StampClient(pdf4meTestSetup.getPdf4meClient());
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();

	String pages = "all";

	public Stamp createStamp() {

		// setup extract object
		Stamp stamp = new Stamp();

		// document
		Document document = new Document();
		byte[] file = testFiles.getPdfBytesLong();
		document.setDocData(file);
		stamp.setDocument(document);

		// action
		StampAction stampAction = new StampAction();
		Text textObj = new Text();
		textObj.setValue("EXAMPLE TEXT");
		stampAction.setAlpha(1.0);
		stampAction.setText(textObj);
		stampAction.setPageSequence(pages);
		stampAction.setAlignX(AlignXEnum.CENTER);
		stampAction.setAlignY(AlignYEnum.MIDDLE);
		stamp.setStampAction(stampAction);

		return stamp;
	}

	@Test
	public void testStampThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The stamp parameter cannot be null.");
        
		// request
		Stamp stamp = null;
		StampRes res = stampClient.stamp(stamp);
	}

	@Test
	public void testStampDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The stamp document cannot be null.");
        
		// request
		Stamp stamp = createStamp();
		stamp.setDocument(null);

		StampRes res = stampClient.stamp(stamp);
	}

	@Test
	public void testStampDocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The stamp document cannot be null.");
        
		// request
		Stamp stamp = createStamp();
		stamp.getDocument().setDocData(null);

		StampRes res = stampClient.stamp(stamp);
	}

	@Test
	public void testStampStampActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The stampAction cannot be null.");
        
		// request
		Stamp stamp = createStamp();
		stamp.setStampAction(null);

		StampRes res = stampClient.stamp(stamp);
	}

	@Test
	public void testStampStampActionAlphaThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The alpha parameter of stampAction cannot be null.");
        
		// request
		Stamp stamp = createStamp();
		stamp.getStampAction().setAlpha(null);

		StampRes res = stampClient.stamp(stamp);

	}

	@Test
	public void testStampNoNullResponse() {

		// request
		Stamp stamp = createStamp();
		StampRes res = stampClient.stamp(stamp);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getDocData());
	}
	
	@Test
	public void testStampDocLength() {

		// request
		Stamp stamp = createStamp();
		StampRes res = stampClient.stamp(stamp);

		Document document = res.getDocument();

		int stampedLength = document.getDocData().length;

		// validation
		assertTrue(check.notZero(stampedLength));

	}

	@Test
	public void testTextStampNoNullResponse() {

		// request
		String text = "EXAMPLE STAMP";
		String pages = "all";
		AlignXEnum alignX = AlignXEnum.CENTER;
		AlignYEnum alignY = AlignYEnum.MIDDLE;
		byte[] file = testFiles.getPdfBytesLong();

		byte[] res = stampClient.textStamp(text, pages, alignX, alignY, file);

		// validation
		assertNotNull(res);
	}

	@Test
	public void testTextStampDocLength() {

		// request
		String text = "EXAMPLE STAMP";
		String pages = "all";
		AlignXEnum alignX = AlignXEnum.CENTER;
		AlignYEnum alignY = AlignYEnum.MIDDLE;
		byte[] file = testFiles.getPdfBytesLong();

		byte[] res = stampClient.textStamp(text, pages, alignX, alignY, file);

		int stampedLength = res.length;

		// validation
		assertTrue(check.notZero(stampedLength));
	}

}
