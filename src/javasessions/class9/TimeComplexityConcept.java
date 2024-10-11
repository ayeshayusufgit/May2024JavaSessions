package javasessions.class9;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TC:Big Oh() --- Big O()
		//How much time a code takes to execute?
		//The time complexity is for all languages
		//How much time does as algorithm take?
		
		//1 person writes code for the amazon search and takes 50 secs
		//The other person writes the same code ie for amazon search and takes 1 sec
		//The output is the same but both take different time to execute
		//which code is better?the one which takes a shorter amount of time
		//the code has to be optimized(devs have to write optimized code)
		//optimization can be checked based on time complexity
		//This term is used for the code written in all languages
		
		//Time complexity of the below code Big O(n)
		
		//1.
		//On running it once or 100 times or 1000 times the time taken will be the same
		int i=1;
		System.out.println(i);
		//O(1)-constant/fixed time, if it takes 0.5 seconds to print the o/p on the console, it'll continue taking that much
		
		//2.
		for(int p=1;p<=10;p++) {
			System.out.println(p);
		}
		//1+n+n+n=>3n+1=>Linear Equation(n+c)
		//3n=>n=>O(n)	
		//So by increasing the data the time will also increase
		
		//3.
		int k=1;
		while(k<=10) {
			System.out.println(k);
			k++;
		}
		//1+n+n+n=>1+3n(Linear Equation)=>3n=>O(n)
		
		//Interview Q:How to calculate the Time Complexity of nested loops
		//n*n=>O(n^2)
		for(int m=0;m<=5;m++) {
			for(int n=0;n<=5;n++) {
				System.out.println(m+""+n+" ");
			}
			System.out.println();
			System.out.println("Hi");
		}
		
		//(1+n+n+n+n)(1+n+n+n)=>(1+4n)(1+3n)=>1+3n+4n+12n*2=>1+7n+12n*2=>quadratic equation
		//7n+12n*2(The 1 is negligible so can be removed)
		//n(7+12n)(The 7 is negligible so can be removed)
		//12n^2(The factor 12 can be removed)
		//n^2=>O(n^2)[Is the time complexity)
		
		
		//4.n*n*n=>n^3
		for(int m=0;m<=5;m++) {
			for(int n=0;n<=5;n++) {
				for(int v=0;v<=5;v++) {
				System.out.println(m+""+n+v+" ");
				}
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n)(1+n+n+n)
		//(1+3n)(1+2n)(1+3n)
		//(1+3n)^2*(1+2n)
		//(1+6n+9n^2)(1+2n)
		//1+2n+6n+12n^2+9n^2+18n^3(removing the constant 1)
		//8n+21n^2+18n^3=>cubic equation
		//n(8+21n+18n^2)(removing the constant)
		//n(21n+18n^2)=>21n^2+18n^3
		//3n*n(7+6n)(removing the constant)
		//3n*n(6n)=>18n*n*n(removing the factor 18)
		//n^3=>O(n^3)[Is the time complexity]
		
		//Linear Search-requires 1 for loop so Time Complexity is O(n)
		
		//log n:
		//n=32
		//n/2=16
		//n/4=4
		//n/8=2
		//tc = n/k
		//log T = log(n/k);
		//log T = log n - log k;
		//log T=1-log k
		//log T= log k
		
		
		//Time complexity of code to return the value of the ith index
		int a[]= {5,4,6,7};
		int index=2;
		System.out.println(a[index]);
		//Time Complexity=O(1);
		
		
		//Time complexity to iterate the values of the array
		
		for(int m=0;m<a.length;m++) {
			System.out.println(a[m]);
		}
		//O(n)=1+n+n+n=1+3n=O(n)
		
		//Time complexity to read values from the excel sheet
		//m*n
		int[][] excel=new int[5][4];
		for(int m=0;m<a.length;m++) {
			for(int n=0;n<a.length;n++) {
				System.out.println(excel[m][n]);
			}
		}
		//Time complexity=O(n^2) 
		
		//Time complexity of Linear Search is O(n)
		
		
	}
}
