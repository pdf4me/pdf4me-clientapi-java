package com.pdf4me.client;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;

import model.Document;
import model.Optimize;
import model.OptimizeAction;
import model.OptimizeRes;
import model.OptimizeAction.ProfileEnum;

public class OptimizeClient {

	private Pdf4meClient pdf4meClient;

	public OptimizeClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined optimization is carried out.
	 * @param optimize
	 * @return OptimizeRes
	 */
	public OptimizeRes optimize(Optimize optimize) {
		// check validity of arguments
		checkOptimizeObjectValidity(optimize);
		// execute
		OptimizeRes res = (OptimizeRes) pdf4meClient.customHttp.post(optimize, OptimizeRes.class, "Optimize/Optimize");
		// check response for errors
		if(res == null) {
			throw new Pdf4meBackendException("Server Error");
		}else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The PDF is optimized w.r.t the chosen optimization profile.
	 * @param profile: [DEFAULT, PRINT, WEB, MAX]
	 * @param file
	 * @return optimized PDF
	 */
	public byte[] optimizeByProfile(ProfileEnum profile, byte[] file) {

		// setup optimize object
		Optimize optimize = new Optimize();

		// document
		Document document = new Document();
		document.setDocData(file);
		optimize.setDocument(document);

		// action
		OptimizeAction optimizeAction = new OptimizeAction();
		optimizeAction.useProfile(true);
		optimizeAction.profile(profile);
		optimize.setOptimizeAction(optimizeAction);

		OptimizeRes res = optimize(optimize);

		return res.getDocument().getDocData();
	}

	private void checkOptimizeObjectValidity(Optimize optimize) {

		// check provided arguments
		if(optimize == null) {
			throw new Pdf4meClientException("The optimize parameter cannot be null.");
		}else if(optimize.getDocument() == null || optimize.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The optimize document cannot be null.");
		}else if(optimize.getOptimizeAction() == null) {
			throw new Pdf4meClientException("The optimizeAction cannot be null.");
		}else if(optimize.getOptimizeAction().isUseProfile() == false) {
			throw new Pdf4meClientException("The useProfile parameter of optimizeAction has to be set to true.");
		}else if( optimize.getOptimizeAction().getProfile() == null) {
			throw new Pdf4meClientException("The profile parameter of optimizeAction cannot be null.");
		}
	}

}
