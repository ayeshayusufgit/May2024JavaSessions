package javasessions.class19.WebDriverArch;

public class SafariDriver implements WebDriver{

	//These methods have to be implemented in the class implementing the WebDriver Interface 
	
	//Safari launches the url according to the SaFari Browser
	
	//Chrome is using a different engine to interact with the browser, so is Firefox and Safari
	//Every driver has a different way of performing the functionality
	
	
	
	public SafariDriver() {
		System.out.println("Launch Safari....");
	}
	
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Entering Url:"+url);
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element:"+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering value: "+value+" into the field: "+element);
	}

	@Override
	public void close() {
		System.out.println("Closing Browser");
	}
}
