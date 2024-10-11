package javasessions.class5;

public class SwitchCaseConcept2 {

	public static void main(String[] args) {

		// cross browser logic
		String browser = "opera";

		switch (browser) {
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
		
		
		int marks=100;
		switch(marks) {
//		case marks<90: 	//there should be no condition in the case....this is a limitation 	
//						break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
		
		//byte key=10;
		//the key can be of type byte but the byte range should match(-128 to 127)
		short key=10;
		//the key can be of type short but the range should match
		//long key = 10;
		//the key cannot be of type long
		//only byte,short or int datatype are allowed for the key in switch/case 
		//char datatype for the key is allowed for the key in switch/case
		//long,float,double datatypes aren't allowed for the key in switch/case
		
		switch(key) {
		case 1: 
			break;
		 default :
			 break;
		}
		
		char ch='a';
		//char,String datatypes  are allowed for the key in switch/case
		//characters are coming from the integer family as it internally uses ascii values thus allowed
		//String as keys are also allowed
		
		//Program to print vowels n consonants
		switch(ch) {
		case 'a': System.out.println("a is a vowel");
			break;
		case 'e': System.out.println("e is a vowel");
			break;	
		case 'i': System.out.println("i is a vowel");
			break;	
		case 'o':System.out.println("o is a vowel");
			break;
		case 'u':System.out.println("u is a vowel");
			break;		
		default : System.out.println(ch+": is a consonant");
			 break;
		}
	}
}
