package com.pdf4me.client;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pdf4me.helper.Pdf4meBackendException;
import com.pdf4me.helper.Pdf4meClientException;
import com.pdf4me.helper.ResponseChecker;
import com.pdf4me.helper.Tuple;

import model.Optimize;
import model.OptimizeAction.ProfileEnum;
import model.OptimizeRes;

public class OptimizeClient {

	private Pdf4meClient pdf4meClient;

	public OptimizeClient(Pdf4meClient pdf4meClient) {
		this.pdf4meClient = pdf4meClient;
	}

	/**
	 * The predefined optimization is carried out.
	 * 
	 * @param optimize
	 *            optimization configuration
	 * @return OptimizeRes, contains optimized PDF
	 */
	public OptimizeRes optimize(Optimize optimize) {
		// check validity of arguments
		checkOptimizeObjectValidity(optimize);
		// execute
		OptimizeRes res = (OptimizeRes) pdf4meClient.customHttp.postUniversalObject(optimize, OptimizeRes.class,
				"Optimize/Optimize");
		// check response for errors
		if (res == null) {
			throw new Pdf4meBackendException("Server Error");
		} else {
			ResponseChecker.checkDocumentForErrors(res.getDocument());
		}
		return res;
	}

	/**
	 * The provided file will be optimized w.r.t the chosen profile. For instance if
	 * the profile 'max' has been selected, the resulting PDF will be optimized for
	 * maximal memory size reduction.
	 * 
	 * @param profile
	 *            optimization profile (e.g. 'max' for maximal compression)
	 * @param file
	 *            to be optimized
	 * @return bytes of resulting file, can be directly written to file on disk
	 */
	public byte[] optimizeByProfile(ProfileEnum profile, File file) {

		// prepare multipart parameters
		List<Tuple<String, String>> params = new ArrayList<Tuple<String, String>>();
		params.add(new Tuple("profile", profile.getValue()));

		List<Tuple<String, File>> uploadFiles = new ArrayList<Tuple<String, File>>();
		uploadFiles.add(new Tuple("file", file));

		return pdf4meClient.customHttp.postWrapper(params, uploadFiles, "/Optimize/OptimizeByProfile");
	}

	/**
	 * Checks whether the optimize object contains the essential information to be
	 * processed by the server.
	 * 
	 * @param optimize
	 *            object to be checked (validity)
	 */
	private void checkOptimizeObjectValidity(Optimize optimize) {

		// check provided arguments
		if (optimize == null) {
			throw new Pdf4meClientException("The optimize parameter cannot be null.");
		} else if (optimize.getDocument() == null || optimize.getDocument().getDocData() == null) {
			throw new Pdf4meClientException("The optimize document cannot be null.");
		} else if (optimize.getOptimizeAction() == null) {
			throw new Pdf4meClientException("The optimizeAction cannot be null.");
		} else if (optimize.getOptimizeAction().isUseProfile() == false) {
			throw new Pdf4meClientException("The useProfile parameter of optimizeAction has to be set to true.");
		} else if (optimize.getOptimizeAction().getProfile() == null) {
			throw new Pdf4meClientException("The profile parameter of optimizeAction cannot be null.");
		}
	}

}
