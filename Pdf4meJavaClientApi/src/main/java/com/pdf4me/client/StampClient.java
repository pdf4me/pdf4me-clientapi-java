package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.Stamp;
import model.StampAction.AlignXEnum;
import model.StampAction.AlignYEnum;
import model.StampRes;

public class StampClient {

	private Pdf4meClient pdf4meClient;

	public StampClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined stamp is carried out.
	 * 
	 * @param stamp
	 *            stamp configuration
	 * @return StampRes, contains the stamped PDF
	 */
	public StampRes stamp(Stamp stamp) {

		// check validity of arguments
		checkStampObjectValidity(stamp);
		// execute
		StampRes res = (StampRes) pdf4meClient.customHttp.postUniversalObject(stamp, StampRes.class, "Stamp/Stamp");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * Places a custom text stamp on the pages of your choice. The position of the
	 * stamp is specified by alignX and alignY.
	 * 
	 * @param text,
	 *            custom text on stamp
	 * @param pages
	 *            pages to be stamped
	 * @param alignX:
	 *            horizontal position
	 * @param alignY:
	 *            vertical position
	 * @param file
	 *            to be stamped
	 * @return bytes of resulting file, can be directly written to file on disk
	 */
	public byte[] textStamp(String text, String pages, AlignXEnum alignX, AlignYEnum alignY, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("text", text));
		params.add(new Tuple("pages", pages));
		params.add(new Tuple("alignX", alignX.getValue()));
		params.add(new Tuple("alignY", alignY.getValue()));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Stamp/TextStamp");

	}

	/**
	 * Checks whether the stamp object contains the essential information to be
	 * processed by the server.
	 * 
	 * @param stamp
	 *            object to be checked (validity)
	 */
	private void checkStampObjectValidity(Stamp stamp) {

		// check provided arguments
		if (stamp == null) {
			throw new Pdf4meClientException("The stamp parameter cannot be null.");
		} else if (stamp.getDocument() == null || stamp.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The stamp document cannot be null.");
		} else if (stamp.getStampAction() == null) {
			throw new Pdf4meClientException("The stampAction cannot be null.");
		} else if (stamp.getStampAction().getAlpha() == null) {
			throw new Pdf4meClientException("The alpha parameter of stampAction cannot be null.");
		} else if (stamp.getStampAction().getText() == null && stamp.getStampAction().getImage() == null) {
			throw new Pdf4meClientException("The image and text parameter of stampAction cannot both be null.");
		}
	}

}
