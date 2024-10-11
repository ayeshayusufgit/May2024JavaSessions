package javasessions.class8;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.int array
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i);//The array name shouldn't be written(gives the hashcode of memory address)
		//[I@4c203ea1
		
		System.out.println(Arrays.toString(i));
		
		//index based loop:this loop is faster than foreach loop 
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		//for each loop
		for(int e:i) {
			System.out.println(e);
		}
		
		//2.double array:
		double d[] = new double[3];//0-2
		d[0]=12.33;
		d[1]=23.44;
		d[2]=100.41;
		System.out.println(d);
		
		for(double e:d) {
			System.out.println(e);
		}
		System.out.println("==============");
		
		//3.char array:
		char ch[]=new char[4];//the segments need to be explicitly mentioned 
		ch[0]='a';
		ch[1]='A';
		ch[2]='0';
		ch[3]='$';
		
		for(char e:ch) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(ch));
		System.out.println(ch);
		
		//4.String array
		String emp[]=new String[3];
		emp[0]="Tom";
		emp[1]="Amit";
		emp[2]="Lisa";
		
		for(String e:emp) {
			System.out.println(e);
			if(e.equals("Amit")) {
				System.out.println("Emp is admin");
				break;
			}
		}
		
		//empdata= name(String),age(int),gender(char),salary(double),isPerm(boolean)
		
		//Object Array:
		
		Object data[]=new Object [5];//range:0-4
		//Object is the parent or super class of all the classes in java
		//Any kind of data can be stored in array of type Object
		
		data[0]="Tom";
		data[1]=30;//
		data[2]='m';
		data[3]=35.55;
		data[4]=true;
		//currently the above are primitve datatypes
		//when its stored in an object array it becomes non primitive type, thus equals is used
		//for non primitive datatype there is no specific size
		
		
		System.out.println(Arrays.toString(data));
		for(Object e:data) {
			System.out.println(e);
			if(e.equals("Tom")) { // condition using object class
				System.out.println("user name is valid");
			}
			if(e.equals(30)) {
				System.out.println("age is less than 30");
			}
		}
		
		for(int k=0;k<=data.length-1;k++) {
			System.out.println(data[k]);
		}
		
		int p[]=new int[4];
		p[0]=10;
		p[1]=20;
		p[2]=30;
		p[3]=40;
		
		for(int k=p.length-1;k>=0;k--) {
			System.out.println(p[k]);
		}
		System.out.println("---------------------------");
		
		//for-each loop doesnt support increment or decrement
		//reverse array using for-each loop 
		int count=p.length-1;
		for(int e:p) {
			//System.out.println(e);
			System.out.println(p[count]);
			count--;
		}
		System.out.println("---------------------------");
		int count1=p.length-1;
		for(int e:p) {
			e=count1;
			//p[0]=2000; updating the array using for-each loop
			System.out.println(p[e]);
			count1--;
		}
		
		
		//use case of static array with examples
		//1.flight booking seats(the flight seats wont change)
		//2.movie tickets(the seats in the cinema hall wont change)
		//3.dropdown size:month[12]
		//4.233 countries are fixed
		//5.To store the entire footer information
		//static array is used for static data
		
		//use case for dynamic arrays with examples
		//1.To show the data of restaurants in an area
		//2.To show results of mac in the amazon site(the results vary depending on products) 
		
		
		//default values
		//byte/short/long/int:0
		//double/float:0.0
		//char: space
		//String:null(all the non primitive datatypes the default value is null)  
		
		String naveen[]=new String[4];
		System.out.println(Arrays.toString(naveen));
		
		//on the basis of ur testcases u get the inputs so those are passed in ur functions, Scanner class usage is discouraged
		
		String env="qa";
		
		switch(env) {
		case "qa":
				System.out.println("QA");
				//break;
		case "dev":
				System.out.println("DEV");
				//break;
		case "uat":
			    System.out.println("UAT");
			    //break;
			
			} //default case is optional it may or maynot be written	
		}		
}
