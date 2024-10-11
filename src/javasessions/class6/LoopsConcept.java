package javasessions.class6;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 to 10
		//10 statements are required to print from 1 to 10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//if i am asked to write 1 to 1000, do we write 1000 print statements?
		
		//Suppose if there is a repetitive task in that case i use loops
		//Example:
		//1.To get the footer links, can be got using loops(repetitive task)
		//2.To click each country from the countries dropdown also can be done using loops(repetitive task)
		
		//Loops
		//1.while loop
		//In this loop if the condition is true then the statements within it are executed and will be executed till the condition is true
		//Once the condition fails it comes out of the loop
		
		//infinite loop
//		int i=1;
//		while(i<=10) { 
//			System.out.println(i);		
//		}
		
		int i=0;
		while(i<=9) { //condition
			System.out.println(i); //statements within the loops which will be executed	
			//i++;
			//++i;
			//i=i+1;
			i=i+2;//odd numbers
			//break;
		}
		
		//To print Hello 50 times
		int k=0;
		while(k<=50) {
			System.out.println("Hello");
			k++;
		}
		
		//To print 1 to 50 but on seeing 5 to break out of the loop
		int p=1;
		while(p<=50) {
			System.out.println(p);//1234
			p++;
			if(p==5) {
				System.out.println("bye");
				//p++;
				break;//break will break the whole loop
			}
		}
		
		//To print 10 to 1
		int t=10;
		while(t>=-1) {
			System.out.println(t);//10987654321
			//t--;
			//--t;
			t=t-1;//-2
		}
		
		//2.for loop
		//To print 1 to 10
		for(int d=1;d<=10;d++) {//These 3 statements should be there in the same line
			//1.d=1 is the initialization(it happens only once)
			//2.the condition(d<=10) is checked n only true enters the loop
			System.out.println(d);//3.Executes the statements within the loop
			//4.d value is incremented(d++)
			//5.The condition is checked goes to the 3rd step
			//the initialization, the condition and the incrementation has to be separated by ;
			
		}
		
		/*for(int d=1;d<=10;) {
			//The 4th step is optional incase of for loop, will result in infinite loop
			
			System.out.println(d);//3.Executes the statements within the loop
		}*/
		
		for(int d=1;d<=10;) {
			//The 4th step is optional incase of for loop, will result in infinite loop
			
			System.out.println(d);
			d++;//incrementation can be done here also
		}

		/*for(int d=1;;d++) {
			//The conditional step is optional incase of for loop, will result in infinite loop
			
			System.out.println(d);
		}*/
		
		//Interview Q:Can true|false be written in the condition part of the for loop?
		/*for(int d=1;false;d++) {
		//false cannot be written, results in unreachable code
		//if condition not provided takes true by default(infinite loop)
		//true can be also written resulting in an infinite loop  
		System.out.println(d);
		}*/
		
		//Interview Q:Can the for loop be written as below?
		//Ans:Yes
		//Colons before and after the condition are mandatory
		
		/*
		 * 
		int d=1;
		for(;d<=100;d++) {
			System.out.println(d);
		}
		
		or
		
		int d=1;
		for(;d<=100;) {
			System.out.println(d);
			d++;
		}
		or
		int d=1;
		for(;;) { // by default the condition is takin as true,resulting in an infinite loop
			System.out.println(d);
			d++;
		}
		*/
		
		//The for loop can be written with byte short char int long float n double 
		for(byte b=1;b<=10;b++) {
			System.out.println(b);
			break; //can be used using in the for loop
		}
		//or
		for(short s=1;s<=10;s++) {
			System.out.println(s);
		}
		//or
		for(long l=1;l<=10;l++) {
			System.out.println(l);
		}
		//or
		for(float f=1;f<=10;f++) {
			System.out.println(f);
		}
		//or
		//double
		//practical example:double in for loop can be used to generate build numbers  
		for(double d=1.0;d<=5.0;d++) {
			System.out.println(d);
		}
		//or
		//Program to print a-z using for loop
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
		System.out.println("=========================================");
		//Print the ascii table(a-z) using for loops
		//a=97
		//b=98
		//z=122
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch+" = "+(byte)ch);
		}
		
		//Print the ascii table(A-Z) using for loops
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch+" = "+(byte)ch);
		}
		
		//Print the ascii table(0-9) using for loops
		for(char ch='0';ch<='9';ch++) {
			System.out.println(ch+" = "+(byte)ch);
		}
		
		//when to use while loop?
		//when the number of iterations are not fixed, then use the while loop
		//Calendar handling: to select Dec 2025, in this we do not know the number of iterations to be performed
		//infinite scrolling on facebook, linkedin, swiggy, zomato
		//wait for element on the page, an element may come after 5s or 10s or 12s or 20s or 0s(its visibility varies)
		//wait for page loading
		//webtable with pagination:The element can be in the 1 page or 2nd page or 5th page for which the pagination has to be clicked
		//(dont know how many times the next button has to be clicked)
		//carousals:We will not know how many times the < or > have to be clicked to come to the USB product
		//(noon.com)
		
		
		//when to use the for loop?
		//when the number of iterations are fixed, then use the while loop
		//to handle the month dropdown(1 to 12,months are fixed)
		//to handle the country dropdown(countries are fixed)
		//Arrays, ArrayList: for loop
		//footer links(this will be fixed in a page)
		//dropdowns with fixed data
		//movie/flight tickets for a movie:120 seats(use while loop to fill all the tickets)
		
		//infinite loop incase of for n while loop
		//any code after the infinite loop will result in a dead code
//		for(;;) {
//			System.out.println("Welcome to hotel TAJ");
//		}
		
//		while(true) {
//			System.out.println("Welcome to hotel TAJ");
//		}
		
		
		//Can false be written in the while loop?
		//false can be written but the code within it become unreachable
//		while(false) {
//			System.out.println("Welcome to hotel TAJ");
//		}
		
		//Can a blank while loop be written?
		//Its mandatory to write a condition within the while, ow results in an error
//		while() {
//			
//		}
		
		//THe real world example of infinite loop will be a welcome to taj led screen which continuously keeps executing infinitely
		
//		byte h=1;
//		while(true) {
//			h++;
//			System.out.println(h);//After it prints the 127 then it starts narrowing the number which results in -ve numbers aswell which is printed
//		}
		
		for(int m=1;m<=10;) {//op=>234567891011
			m++;
			System.out.println(m);
		}
		
//		for(int m=1;true;) {
//			m++;
//			System.out.println(m);
//		}
		
		for(int m=0;m<10;) {
			m++;
			System.out.println(m);
		}
		
		//program to print 1 to 10 using infinite loop
		int n=1;
		while(true) {
			System.out.println(n);
			n++;
			if(n==11) {
				break;
			}
		}
		
	}
}
