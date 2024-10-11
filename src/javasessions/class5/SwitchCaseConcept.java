package javasessions.class5;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The same logic can be written in a better way using switch case

		//String browser1 = "chrome";
		//String browser1 = "edge";
		//String browser1 = "opera";
		String browser1 = "firefox";
		
		switch (browser1) {
		//incase of switch/case it wont goto each n every case, it will directly goto the  matching case
		
		// The String or char or int values are to be supplied for case
		case "chrome":
			System.out.println("Launching chrome"); 	//this case will directly be executed matching the key "browser" equal to "chrome" 
			break;		//this will break out of the switch/case

		case "firefox":
			System.out.println("Launching firefox");	//this case will directly be executed matching the key "browser" equal to "edge" 
			break; //this will break out of the switch/case

		case "edge":
			System.out.println("Launching edge");	//this case will directly be executed matching the key "browser" equal to "edge" 
			break; //this will break out of the switch/case

		case "ie":
			System.out.println("Launching ie");
			break;

		default:
			System.out.println("plz pass the right browser:"+browser1); //this case will directly be executed when the key "browser" equal to "opera"
			break;
		}
		
		String browser2="chrome";
		switch (browser2) {
		//incase of switch/case it wont goto each n every case, it will directly goto the matching case
		//wo the break keyword in each case the matching case n the subsequent case will be executed  
	
		case "chrome":
			System.out.println("Launching chrome"); 	//this case will directly be executed matching the key "browser" equal to "chrome"
														//and the subsequent cases after that

		case "firefox":
			System.out.println("Launching firefox");	//this case will directly be executed matching the key "browser" equal to "edge" 
														//and the subsequent cases after that

		case "edge":
			System.out.println("Launching edge");	//this case will directly be executed matching the key "browser" equal to "edge" 
													//and the subsequent cases after that

		case "ie":
			System.out.println("Launching ie"); //this case will directly be executed matching the key "browser" equal to "edge" 
												//and the subsequent cases after that

		default:
			System.out.println("plz pass the right browser:"+browser2); 
			//this case will directly be executed when the key "browser" equal to "opera"
			//the key should be such that it doesn't match the existing cases	
		}
	}
}
