package javasessions.class26.stringManipulation;

//1.
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 ways of creating strings
		
		//using string literals
		String s1="hello selenium";//this type of string is called string literals
		
		//using new keyword
		String s2=new String("hello selenium");
		
		System.out.println(s1==s2);//false, == checks if its pointing to the same object(checks the object references)
		System.out.println(s1.equals(s2));//true, equals checks if the content of the 2 strings are the same
		
		//Inside the SCP there can be no duplicate strings, s3 is also pointing to same string object in the SCP
		String s3="hello selenium";
		
		System.out.println(s1==s3);//true
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s2==s3);//false
		//s2 is pointing to the Heap Object and s3 is pointing to the SCP Object
		
		String s4="hello Selenium";
		
		String str=new String("testing");
		String st="testing";
		String st1="Testing";
		
		//String is the most common type of datatype so if there are thousands of strings then there will be a duplication of all those string
		//resulting is the wastage of memory, so SCP is done for memory optimization
		
		//To create string using the new keyword is a bad way, as its resulting in the creation of String in the heap and an entry will be added in the SCP
		//literals is the best way to creating the string
		
		//new keyword will result in the necessary creation of 2 objects 1 in the scp the other in the heap memory
		//this not a preferred way of creating string
		
		
//		String t1="hello";
//		System.out.println(t1.concat("automation"));
//		System.out.println(t1);
		
		String t1="hello";
		//t1=t1.concat("automation");
		t1.concat("automation");
		System.out.println(t1);//hello
		
		String t2="helloautomation";
		System.out.println(t1.equals(t2));
		
		//String literals are applicable for garbage collection in the SCP but of least priority(only if the memory is full)
		String t3=new String("cypress");//2--Heap+SCP
		
		//After jdk 1.7 the SCP is part of the Heap Memory, before that it wasn't
		
		
		
		int i=10;
		int p=10;
		int k=10;
		
		
		
		
		
		
		
	}

}
