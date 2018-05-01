package jUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.pdf4me.client.ImageClient;
import com.pdf4me.helper.Pdf4meClientException;

import model.CreateImages;
import model.CreateImagesRes;
import model.Document;
import model.ImageAction;
import model.PageSelection;
import model.ImageAction.ImageExtensionEnum;
import test.Check;
import test.Pdf4meTestSetup;
import test.TestFiles;

public class ImageClientTest {
	
	private Check check = new Check();
	private TestFiles testFiles = new TestFiles();
	
	private Pdf4meTestSetup pdf4meTestSetup = new Pdf4meTestSetup();
	private ImageClient imageClient = new ImageClient(pdf4meTestSetup.getPdf4meClient());
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();

	int width = 250;
	String imagePageNr = "1";
	ImageExtensionEnum imageFormat = ImageExtensionEnum.JPEG;

	public CreateImages createCreateImages() {

		byte[] file = testFiles.getPdfBytes();

		// setup createImages object
		CreateImages createImages = new CreateImages();

		// document
		Document document = new Document();
		document.setDocData(file);
		createImages.setDocument(document);

		// action
		ImageAction imageAction = new ImageAction();
		imageAction.setWidthPixel(width);
		PageSelection pageSelection = new PageSelection();
		pageSelection.addPageNrsItem(Integer.parseInt(imagePageNr));
		imageAction.setImageExtension(imageFormat);
		imageAction.setPageSelection(pageSelection);
		createImages.setImageAction(imageAction);

		return createImages;
	}

	@Test
	public void testCreateImagesThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The createImages parameter cannot be null.");
		
		// request
		CreateImages createImages = null;
		CreateImagesRes res = imageClient.createImages(createImages);
	}
	
	@Test
	public void testCreateImagesDocumentThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The createImages document cannot be null.");
        
		// request
		CreateImages createImages = createCreateImages();
		createImages.setDocument(null);
		
		CreateImagesRes res = imageClient.createImages(createImages);
	}
	
	@Test
	public void testCreateImagesDocumentDataThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The createImages document cannot be null.");
        
		// request
		CreateImages createImages = createCreateImages();
		createImages.getDocument().setDocData(null);
		
		CreateImagesRes res = imageClient.createImages(createImages);
	}
	
	@Test
	public void testCreateImagesImageActionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The ImageAction cannot be null.");
        
		// request
		CreateImages createImages = createCreateImages();
		createImages.setImageAction(null);
		
		CreateImagesRes res = imageClient.createImages(createImages);
	}
	
	@Test
	public void testCreateImagesImageActionPageSelectionThrowsNullPointerException() {
		thrown.expect(Pdf4meClientException.class);
        thrown.expectMessage("The pageSelection of the imageAction cannot be null.");
        
		// request
		CreateImages createImages = createCreateImages();
		createImages.getImageAction().setPageSelection(null);
		
		CreateImagesRes res = imageClient.createImages(createImages);
	}
	
	@Test
	public void testCreateImagesNoNullResponse() {

		// request
		CreateImages createImages = createCreateImages();
		CreateImagesRes res = imageClient.createImages(createImages);

		// validation
		assertNotNull(res);
		assertNotNull(res.getDocument());
		assertNotNull(res.getDocument().getPages());
		assertNotNull(res.getDocument().getPages().get(0));
		assertNotNull(res.getDocument().getPages().get(0).getThumbnail());

	}
	
	@Test
	public void testCreateImagesDocLength() {

		// request
		CreateImages createImages = createCreateImages();
		CreateImagesRes res = imageClient.createImages(createImages);

		// validation
		assertTrue(check.notZero(res.getDocument().getPages().get(0).getThumbnail().length));

	}

	@Test
	public void testCreateThumbnailNoNullResponse() {

		byte[] file = testFiles.getPdfBytes();

		// request
		byte[] res = imageClient.createThumbnail(width, imagePageNr, imageFormat, file);

		// validation
		assertNotNull(res);

	}
	
	@Test
	public void testCreateThumbnailDocLength() {

		byte[] file = testFiles.getPdfBytes();
		
		// request
		byte[] res = imageClient.createThumbnail(width, imagePageNr, imageFormat, file);

		// validation
		assertTrue(check.notZero(res.length));

	}

}
