package javasessions.class7;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=10;
//		i=20;
//		i=30;
//		System.out.println(i);//the latest value of i will be 30
		//i variable can store only 1 value, it will keep getting replaced with the next
		
		//Array
		//Similar type of data in a collection or datastructure
		//all byte,short int value or all float,double values or all char values or all String values
		
		//There are 2 types of arrays:
		//static array:The size of the array is always fixed
		//dynamic array:dynamic size, size is not fixed(ArrayList)
		
		//2 major limitation of Array
		//1.size is fixed(static array):to overcome this, we use the ArrayList(Dynamic Array) 
		//2.can store only similar datatypes:to overcome this, we can use Object array but this is still a static array
		
		//In the array the lowest index Li=0
		//			   the length of the array is:Hi+1
		//			   the Hi of the array is:length-1
		//			   AIOBException is thrown if an element is tried to access  before 0(Li) ie -1
		//		       AIOBException is thrown if an element is tried to access  after the highest index(Hi)
		
		//2 ways of declaration in Arrays:
		//1.using new keyword
		int i[]=new int[4];//4 equal segments will be created in the memory of type int
		//There is no limit to the maximum size of the array
		
		System.out.println(i[0]);//Before the values are filled the first index is accessed
		//o/p=>0(Gives the default value of the int type ie 0
		System.out.println(i[1]);//o/p=>0
		System.out.println(i[2]);//o/p=>0
		System.out.println(i[3]);//o/p=>0
		
		//Now the values are filled in the segments of the array
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);//10
		System.out.println(i[1]);//20
		System.out.println(i[2]);//30
		System.out.println(i[3]);//40
		
		//System.out.println(i[-1]);//java has no concept of -ve index, ArrayIndexOutOfBoundException(AIOB) will be thrown and the program is terminated
		//System.out.println(i[4]);//ArrayIndexOutOfBoundException(AIOB) will be thrown and the program is terminated
		
		
		System.out.println("Li="+0);
		int len=i.length;//4, the length is an inbuilt variable in java
		System.out.println("Length:"+len);
		System.out.println("Hi="+(len-1));
		
		//To print all the values of the array:using for loop:
		//range:0-3
//		for(int k=0;k<=3;k++) { //3 is a hardcode value, a formula can be written instead
//			System.out.println(i[k]); //10 20 30 40
//		}
		
//		for(int k=0;k<=i.length-1;k++) {
//		System.out.println(i[k]); //10 20 30 40
//	}		
		
//		for(int k=0;k<i.length;k++) {
//			System.out.println(i[k]); //10 20 30 40
//		}
		
		//WO for loop, to print the values of the array
		System.out.println(Arrays.toString(i));//toString() is a method in the Arrays class, this is print the values of the array
		
		//int p[]=new int[3];//To create an array for 3 segment and the range is from 0 to 2
		
		//p[1]=100;
//		System.out.println(p[1]);
//		System.out.println(p[0]);//will have default value of int which is 0 as no value is assigned 
//		System.out.println(p[2]);//will have default value of int which is 0 as no value is assigned

		
		int p[]=new int[4];//4 segments will be continuously allocated
		//p[4]=50;//AIOBE is the RuntimeException that comes while assigning the value
		p[3]=50;
		System.out.println(p[3]);
		System.out.println(p.length);
		
		
		//int p1[]=new int[-4];//RuntimeException: NegativeArraySize is not allowed results in a NASE
							//Compiler wont be able to catch such issues
		int p2[]=new int[4];
		p2[0]=100;
		p2[1]='a';//internally the ascii of 'a' is stored in the segment which is int an value 97  
		System.out.println(p2[1]);
		
		//2.Another way of declaring arrays is using Array literals
		//in this way of declaring we need to know the values(data) in the array in advance
		int num[]= {10,20,30,50,12,34};//6->0 to 5
		System.out.println(num.length);
		System.out.println(num[0]);
		//System.out.println(num[6]);//o/p=>AIOB
		System.out.println(Arrays.toString(num));
		num[0]=400;//The num[0] element 10 gets replaced with 400, here we r loosing the data(the previous value is lost)
		System.out.println(Arrays.toString(num));
		
		
		//In this way of declaring, we are not aware of the full data
		int pop[]=new int[10];
		
		String browser[]= {"chrome","firefox","edge"};//range:0-2,Array literal, writing the values directly
		
		System.out.println(browser.length);
		//browser[3]="ie";//the highest index is 2, but we are trying to add a value in the 3rd index
		//which results in an Exception:ArrayIndexOutOfBoundException
		//Thus proving its a static array
		
		
		
		for(String e:browser) {
			System.out.println(e);
		}
		
		//new keyword is not only creating objects but also dynamice memory allocation(in arrays)
		
		
		
	}

}
