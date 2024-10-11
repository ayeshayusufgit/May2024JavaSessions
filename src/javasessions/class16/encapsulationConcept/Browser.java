package javasessions.class16.encapsulationConcept;

//3.
public class Browser {
	
	//The user was given access to the methods which wasnt even required, the only thing a user knows is to launch the browser
	//by clicking on the launch browser icon
	/*public void launchBrowser() {
		System.out.println("Launching browser");
	}
	
	public void checkRAMSize() {
		System.out.println("check RAM size");
	}

	public void checkBrowserUpdates() {
		System.out.println("check Browser Updates");
	}
	
	
	public void verifyStorage() {
		System.out.println("verify Storage");
	}
	
	public void checkBrowserPolicy() {
		System.out.println("check Browser Policy");
	}*/

	//Here only making the launch browser public to the user and the others private 
	public void launchBrowser() {
		//When the browser is launched internally checkRAMSize, checkBrowserUpdates and checkBrowserPolicy is done
		//which the user is not aware of
		
		System.out.println("Launching browser!!");
		checkRAMSize();
		verifyStorage();
		checkBrowserUpdates();
		checkBrowserPolicy();
		System.out.println("Chrome is launched!!");
	}
	
	private void checkRAMSize() {
		System.out.println("check RAM size");
	}

	private void checkBrowserUpdates() {
		System.out.println("check Browser Updates");
	}
	
	private void verifyStorage() {
		System.out.println("verify Storage");
	}
	
	private void checkBrowserPolicy() {
		System.out.println("check Browser Policy");
	}
}
