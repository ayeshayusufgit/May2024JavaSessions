package javasessions.class5;

public class SwitchCaseConcept3 {

	public static void main(String[] args) {
		
		// cross browser logic
		
		//String browser = "Chrome";//this will goto the default case
		
		//String browser = "CHROME";//the key from the user cannot be controlled
		//As a user the above cases should be handled, its handled as below(using toLowerCase())
		
		//String browser = "CHROME ";//when the user passes the browser value with a space appended
		//since its unable to match the case the default one is executed.
		//This can be handled using .trim() using which the space from either side of the String will be removed
		
		//String browser = "		CHROME	";//This case also will be handled by .trim()
		
		//String browser = "		CHR		OME	";
		String browser = "		CHR		sandasdnaOME	";
		//Since this is an improper input from the user this doesnt need to be handled
		//As anyways the default case will be executed as none one the cases will be matched

		switch (browser.toLowerCase().trim()) {//=>chrome
		//whatever value the user is passing is converted into lowercase then it goes directly to the matching case
		case "chrome":
			System.out.println("Launching chrome");
			break;

		case "firefox":
			System.out.println("Launching firefox");
			break;

		case "edge":
			System.out.println("Launching edge");
			break;

		case "ie":
			System.out.println("Launching ie");
			break;

		default:
			System.out.println("plz pass the right browser:" + browser);
			break;

		case "opera":
			System.out.println("Launch opera");
			break;
		}		
	}
}
