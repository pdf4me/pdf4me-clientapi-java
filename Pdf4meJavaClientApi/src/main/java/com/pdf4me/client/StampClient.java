package com.pdf4me.client;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.Document;
import model.Stamp;
import model.StampAction;
import model.StampRes;
import model.Text;
import model.StampAction.AlignXEnum;
import model.StampAction.AlignYEnum;

public class StampClient {

	private Pdf4meClient pdf4meClient;

	public StampClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined stamp is carried out.
	 * @param stamp
	 * @return StampRes
	 */
	public StampRes stamp(Stamp stamp) {

		// check validity of arguments
		checkStampObjectValidity(stamp);
		// execute
		StampRes res = (StampRes) pdf4meClient.customHttp.post(stamp, StampRes.class, "Stamp/Stamp");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * Stamps the specified pages with the provided text. The stamp's location is defined through the coordinates alignX and alignY.
	 * @param text, custom text on stamp
	 * @param pages to be stamped: ["all", "first", "last"] or a list of comma separated page numbers e.g. "1,4" if the first and fourth page need to be stamped
	 * @param alignX: ["LEFT", "CENTER", "RIGHT"]
	 * @param alignY: ["TOP", "MIDDLE", "BOTTOM"]
	 * @param file
	 * @return
	 */
	public byte[] textStamp(String text, String pages, AlignXEnum alignX, AlignYEnum alignY, byte[] file) {

		// setup stamp object
		Stamp stamp = new Stamp();

		// document
		Document document = new Document();
		document.setDocData(file);
		stamp.setDocument(document);

		// action
		StampAction stampAction = new StampAction();
		Text textObj = new Text();
		textObj.setValue(text);
		stampAction.setText(textObj);
		stampAction.setAlpha(1.0);
		stampAction.setPageSequence(pages);
		stampAction.setAlignX(alignX);
		stampAction.setAlignY(alignY);
		stamp.setStampAction(stampAction);

		StampRes res = stamp(stamp);

		return res.getDocument().getDocData();

	}

	public void checkStampObjectValidity(Stamp stamp){

		// check provided arguments
		if(stamp == null) {
			throw new Pdf4meClientException("The stamp parameter cannot be null.");
		}else if(stamp.getDocument() == null || stamp.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The stamp document cannot be null.");
		}else if(stamp.getStampAction() == null) {
			throw new Pdf4meClientException("The stampAction cannot be null.");
		}else if(stamp.getStampAction().getAlpha() == null) {
			throw new Pdf4meClientException("The alpha parameter of stampAction cannot be null.");
		}
	}

}
