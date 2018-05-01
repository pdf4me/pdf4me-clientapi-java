package test;

import com.pdf4me.client.Pdf4meClient;

public class Pdf4meTestSetup {
	
	private Pdf4meClient pdf4meClient;
	
	public Pdf4meTestSetup(){
		pdf4meClient = new Pdf4meClient();
	}
	
	public Pdf4meClient getPdf4meClient() {
		return pdf4meClient;
	}
	
}
