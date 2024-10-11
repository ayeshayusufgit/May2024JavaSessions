package javasessions.class25.stringManipulation;

import java.util.Arrays;

public class StringManipulation {

	//Strings are non primitve data types just like classes
	//String is a set of characters within double quotes
	//Internally a string is considered as a character array
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hi this is my java code and i am so happy";
		
		System.out.println(str.length());//length()->gives the length of the string
		int len=str.length();
		
		System.out.println("Li="+0);//0
		System.out.println("Hi="+(str.length()-1));//40
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));//StringIndexOutOfBound Exception
		//System.out.println(str.charAt(-1));//StringIndexOutOfBound Exception:There is no concept of -ve indexing
		
		System.out.println(str.indexOf('h'));//indexOf('h')->gives the first occurrence of 'h'
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of 'i'
		
		
		int p2=str.indexOf('i', str.indexOf('i')+1);//2nd occurrence of 'i'
		System.out.println(p2);
		
		int p3=str.indexOf('i',p2+1);//3rd occurrence of 'i'
		System.out.println(p3);
		
		System.out.println(str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1));//combining p2 + p3
		
		
		int p4=str.indexOf('i', p3+1);
		System.out.println(p4);//4th occurrence of 'i'
		
		System.out.println(str.indexOf("java"));//to find the index of a string
		System.out.println(str.indexOf("python"));//returns -1 if the string is not found
		
		//1st case
		//String mesg="welcome admin";
		
//		if(mesg.indexOf("admin")>=0) {
//			System.out.println("admin is present--PASS");
//		}else {
//			System.out.println("admin is not present--FAIL");
//		}
		
		
		//we know the "admin" text is in the 8th position("admin" position is fixed in the string)
		String mesg="welcomeadmin";
		
		if(mesg.indexOf("admin")==8) {
			System.out.println("admin is present--PASS");
		}else {
			System.out.println("admin is not present--FAIL");
		}
		
		String mesg1="welcome Naveen"; //contains just checks if it contains but index checks the right index ie 8
		
		if(mesg1.indexOf("Naveen")==8) {
			//System.out.println("admin is present--PASS");
			System.out.println("Naveen is present--PASS");
		}else {
			//System.out.println("admin is not present--FAIL");
			System.out.println("Naveen is not present--FAIL");
		}
		
		
		//https://naveenautomationlabs.com/opencart/index.php/?route=account/login
		String m1="By creating an account you will be able to shop faster, "
				+ "be up to date on an order's status, "	
				+ "and keep track of the orders you have previously made.";
		
		if(m1.indexOf("shop faster")>=0) {
			System.out.println("Pass");
		}
		
		String t1="		hello world		";
		System.out.println(t1.trim());//to remove spaces from the corner
		
		//Lowercase n Uppercase
		
		String l1="hello java world";
		System.out.println(l1.toUpperCase());
		System.out.println(l1.toLowerCase());
		
		//replace
		String dob="01-01-1990";	//01/01/1990
		System.out.println(dob.replace("-", "/"));//all the hyphens will be replaced with /
		
		String t2="		hello world		";
		System.out.println(t2.replace(" ", ""));
		
		//contains
		String test="I love Java coding";
		System.out.println(test.contains("Java"));//true if string is present
		System.out.println(test.contains("java"));//false if string not present
		
		if(test.contains("Java")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//equals
		String r1="Hello Selenium";
		//String r2="Hello Selenium";
		//String r2="Hello selenium";
		String r2="Hello selenium ";
		
		System.out.println(r1.equals(r2));//false
		System.out.println(r1.equalsIgnoreCase(r2));//true
		System.out.println(r1.equalsIgnoreCase(r2.trim()));
		
		//split:
		String lang="JAVA_PYTHON_RUBY_JAVASCRIPT";
		String[] langArray=lang.split("_");
		System.out.println(langArray[0]);
		System.out.println(langArray.length);
		System.out.println(Arrays.toString(langArray));
		
		String pop="xXHelloXxXSeleniumxXTestingXxXGoogleX";
		String[] popArray=pop.split("xX");//0-4
		System.out.println(popArray[0].length());
		System.out.println(popArray[0]);
		System.out.println(popArray[1]);
		System.out.println(popArray[2]);
		System.out.println(popArray[3]);
		System.out.println(popArray[4]);
		//System.out.println(popArray[5]);//AIOBE
		System.out.println(Arrays.toString(popArray));
		System.out.println("naveen;automation;labs".split(";")[0]);
		
		String otp="your otp number is 12345";
		String[] otpArray=otp.split(" ");
		System.out.println(otpArray[otpArray.length-1]);
		
		String d[]=new String[2];
		d[0]="test";
		d[1]="pop";
		//System.out.println(d[3]);
		
		
		String name="MonikaXKumari";
		System.out.println(name.split("X")[0]);
		
		String u="java_python";
		String[] uArray=u.split(";");
		System.out.println(Arrays.toString(uArray));
		
		
		
		
		
		
	}
}