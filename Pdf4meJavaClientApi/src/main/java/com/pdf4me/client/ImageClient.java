package com.pdf4me.client;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.CreateImages;
import model.CreateImagesRes;
import model.Document;
import model.ImageAction;
import model.PageSelection;
import model.ImageAction.ImageExtensionEnum;

public class ImageClient {

	private Pdf4meClient pdf4meClient;

	public ImageClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined createImages is carried out.
	 * @param createImages
	 * @return CreateImagesRes
	 */
	public CreateImagesRes createImages(CreateImages createImages) {

		// check validity of arguments
		checkCreateImagesObjectValidity(createImages);
		// execute
		CreateImagesRes res = (CreateImagesRes) pdf4meClient.customHttp.post(createImages, CreateImagesRes.class, "Image/CreateImages");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * A thumbnail of the specified page (pageNr) is created. The thumbnail's width and format can be defined through the function arguments.
	 * @param width
	 * @param pageNr
	 * @param imageFormat
	 * @param file
	 * @return thumbnail
	 */
	public byte[] createThumbnail(int width, String pageNr, ImageExtensionEnum imageFormat, byte[] file) {

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
		pageSelection.addPageNrsItem(Integer.parseInt(pageNr));
		imageAction.setImageExtension(imageFormat);
		imageAction.setPageSelection(pageSelection);
		createImages.setImageAction(imageAction);

		CreateImagesRes res = createImages(createImages);

		return res.getDocument().getPages().get(0).getThumbnail();
	}

	private void checkCreateImagesObjectValidity(CreateImages createImages) {

		// check provided arguments
		if(createImages == null) {
			throw new Pdf4meClientException("The createImages parameter cannot be null.");
		}else if(createImages.getDocument() == null || createImages.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The createImages document cannot be null.");
		}else if(createImages.getImageAction() == null) {
			throw new Pdf4meClientException("The ImageAction cannot be null.");
		}else if (createImages.getImageAction().getPageSelection() == null) {
			throw new Pdf4meClientException("The pageSelection of the imageAction cannot be null.");
		}
	}

}
