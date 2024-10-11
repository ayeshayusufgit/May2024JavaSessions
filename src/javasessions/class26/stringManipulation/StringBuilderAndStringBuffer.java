package javasessions.class26.stringManipulation;

//2.
public class StringBuilderAndStringBuffer {
	//StringBuilder and StringBuffer is used to create mutable strings
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		//Started from jdk 1.4
		StringBuilder sb1=new StringBuilder("selenium");
		//StringBuilder t1="hello"; String literals is not allowed, so will not goto the SCP
		//mutable
		
		
		//append wont create a new entry in the SCP, it will be appended to the same Object
		
		sb1.append("automation");
		System.out.println(sb1);
		//if lots of string manipulations are done then its better to use StringBuilder as new string are not created if strings are manipulated	
		
	
		
		//started from jdk 1.0
		//StringBuffer:1.0: is thread-safe
		//StringBuffer t1="hello"; String literals is not allowed, so will not goto the SCP
		//mutable
		
		StringBuffer sb2=new StringBuffer("selenium");
		sb2.append("automation");
		System.out.println(sb2);
		
		
		System.out.println("================================================");
		//StringBuilder sb3=new StringBuilder("selenium");
		String str="selenium";
		StringBuilder sb3=new StringBuilder(str);//the string can be used like this also
		System.out.println(sb3.reverse());//the string "selenium" will be reversed
		
		
		
		
		
		
		
		
		
		
	}

}
