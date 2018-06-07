package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.CreateImages;
import model.CreateImagesRes;
import model.ImageAction.ImageExtensionEnum;

public class ImageClient {

	private Pdf4meClient pdf4meClient;

	public ImageClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined image creation is carried out.
	 * 
	 * @param createImages
	 *            image creation configuration
	 * @return CreateImagesRes, contains images
	 */
	public CreateImagesRes createImages(CreateImages createImages) {

		// check validity of arguments
		checkCreateImagesObjectValidity(createImages);
		// execute
		CreateImagesRes res = (CreateImagesRes) pdf4meClient.customHttp.postUniversalObject(createImages,
				CreateImagesRes.class, "Image/CreateImages");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * Produces a thumbnail of the page referenced by the pageNr. Be aware of the
	 * one-indexing of the page numbers.
	 * 
	 * @param width
	 *            size of the produced thumbnail
	 * @param pageNr
	 *            number of the page which should be captured by the thumbnail
	 * @param imageFormat
	 *            picture format of thumbnail, e.g. 'jpg'
	 * @param file
	 *            to capture thumbnails from
	 * @return bytes of produced thumbnail, can be directly written to image file on
	 *         disk
	 */
	public byte[] createThumbnail(int width, String pageNr, ImageExtensionEnum imageFormat, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("width", Integer.toString(width)));
		params.add(new Tuple("pageNr", pageNr));
		params.add(new Tuple("imageFormat", imageFormat.getValue()));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Image/CreateThumbnail");
	}

	/**
	 * Checks whether the create_images object contains the essential information to
	 * be processed by the server.
	 * 
	 * @param createImages
	 *            object to be checked (validity)
	 */
	private void checkCreateImagesObjectValidity(CreateImages createImages) {

		// check provided arguments
		if (createImages == null) {
			throw new Pdf4meClientException("The createImages parameter cannot be null.");
		} else if (createImages.getDocument() == null || createImages.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The createImages document cannot be null.");
		} else if (createImages.getImageAction() == null) {
			throw new Pdf4meClientException("The ImageAction cannot be null.");
		} else if (createImages.getImageAction().getPageSelection() == null) {
			throw new Pdf4meClientException("The pageSelection of the imageAction cannot be null.");
		}
	}
}
