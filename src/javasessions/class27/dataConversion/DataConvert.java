package javasessions.class27.dataConversion;

import java.util.Arrays;

public class DataConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		System.out.println(x+20);//10020
		
		int i=Integer.parseInt(x);//String value of 100 will be converted into integer
		System.out.println(i+20);//20 will get added to 100 making it 120
		
		//This is the integer range min to max
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		String y="100A";
		//int j=Integer.parseInt(y);//String is converted into integer
		//Since there is an A in the value it will  result in an Exception:NumberformatException
		//proper parsing can be done only if there is a pure number but the above number is an alphanumeric one
		//"A" has to be removed from the string
		
		int j=Integer.parseInt(y.replace("A", ""));
		System.out.println(j+20);
		
//		String p="a";
//		int q=Integer.parseInt(p);//NFE
		
		//Actual Usecase of Wrapper class
//		String totalPrice="1000";
//		int price=Integer.parseInt(totalPrice);
//		System.out.println(price-100);
		
		//String to double
		String s="100.33";
		System.out.println(s+20);
		//Double d=Double.parseDouble(s);//100.33
		//or
		double d=Double.parseDouble(s);//100.33
		System.out.println(d+20);
		
		//int to String:
		int t=100;
		System.out.println(t+20);//10020
		String e=String.valueOf(t);//"100" , whenever any write is to be performed on a webpage its using string
		System.out.println(e+20);
		
		//double to String
		double marks=200.33;
		String m1=String.valueOf(marks);
		System.out.println(m1+20);//200.33
		
		//character to String
		char ch='A';
		String cs=String.valueOf(ch);
		System.out.println(cs+20);
		
		//String to boolean
		//String tr="true";
		//String tr="naveen";
		//String tr="false";
		String tr="FALSE";
		//"FALSE" or "false" or "False" string will be converted to the boolean false on converting it using Boolean.parseBoolean(tr)
		//the same will be applicable for "true" or "TRUE" or "True"
		
		boolean flag=Boolean.parseBoolean(tr);
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		//boolean to String
		boolean gr=true;
		String yr=String.valueOf(gr);//"true"
		System.out.println(yr+20);
		
		//char array to String
		char[] cd= {'s','e','l','e','n','i','u','m'};
		String td=String.valueOf(cd);//the characters can be combined to give string
		System.out.println(td);
		
		//This is not applicable for the String array
//		String ar[]= {"Java","Ruby","Python"};
//		String arr=String.valueOf(ar);
//		System.out.println(arr);
		
		Integer v=100;
		Integer v2=100;
		
		if(v==v2) {
			System.out.println("hi");
		}
		
		if(v.equals(v2)) {
				System.out.println("hello");
		}
		
		System.out.println(v+20);
		int v1=v.intValue();
		System.out.println(v1);
		
		//primitive data comparison ==
		//non primitive data comparison .equals
		
		//escaping "
		String rest="I love \"java\" code";//I love "java" code
		System.out.println(rest);
		
		String xpath="//input[@name=\"naveen\"]";
		System.out.println(xpath);
		
		//String data="Vibha:Srivastava:9899999:Pune:India";
		//String data="Vibha.Srivastava.9899999.Pune.India";
		//String data="Vibha|Srivastava|9899999|Pune|India";
		//String data="Vibha||Srivastava||9899999||Pune||India";
		String data="Vibha&Srivastava&9899999&Pune&India";
		String info[]=data.split("\\&");//different o/ps using the above special characters
		//There are some special characters like . | || which is treated in a different way by compilers, we have to explicitly tell the compiler 
		//to not use the predefined version but use it as a normal character by escaping it using \\ with the character
		
		System.out.println(Arrays.toString(info));
		
		//int is a primitve datatype, on top of the primitive datatype an Integer wrapper class is given, the Integer related methods can be 
		//accessed with the wrapper class
		
		
		//same for the other datatypes
		//boolean --> Boolean
		//int --> Integer
		//double --> Double
		
		//String is a predefined class for this we don't have any wrapper class
		
		//Integer u=new Integer(100);
		Integer u=10;
		System.out.println(u.byteValue());//=>10
		
		Integer u1=1000;
		System.out.println(u1.byteValue());//=> byte equivalent of 1000 ie -24
		
		Integer u2=100;//4 bytes
		
		int uu=100;//4 bytes
		
		Integer.parseInt();
		Double.parseDouble();
		
		//Ranges
		Integer.MIN_VALUE;
		Integer.MAX_VALUE;
		
		
		//All the wrapper classes are final so it cant be extended
		//Including the String class
		
		String s1="testing";
		String s2="Testing";
		System.out.println(s1.compareTo(s2));
		
		//int l=053;//a number starting with 0 is called octal number:base 8
		//System.out.println(l);//the octal number is converted to decimal
		//053=(0x8^2)+(5x8^1)+(3x8^0)=43
		//System.out.println(l);
		
		int l=07;//a number starting with 0 is called octal number:base 8
		System.out.println(l);//the octal number is converted to decimal
		//07=(0x8^1)+(7x8^0)=7
		System.out.println(l);
		
		//int l=058; //this number is not allowed as octal numbers should be between 0 to 7
		
		//byte l1=0777;//this is an octal number, the decimal equivalent is 511 but the byte range is -128 to 127 so it can't by stored in a byte, so should be stored in int datatype
		int l1=0777;//this is correct
		
		//int l2=077777777777;//this is an octal number, the decimal equivalent is 8589934591 but it can't be accommodated in the int range, so should be stored in long datatype  
		long l2=077777777777L;//explicitly mention a L with the number to indicate thats its a long number
		
		
		
		
		
	}

}
