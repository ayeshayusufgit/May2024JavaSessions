package javasessions.class7;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The while loop first the condition is checked, if only true then the statement within it.
		//The do-while loop before checking the condition the statement within it it executed atleast once. 
		
		//Even if the condition is false the statement will be executed atleast once
		//1 to 10
//		int i=1;
//		do{
//			System.out.println(i);
//			i++;
//		}while(i<=10);
		
//		int i=1;
//		do{
//			i++;
//			System.out.println(i);
//			//break;//break can be written in the do/while
//		}while(i>=10);//the statement is executed atleast once after which the condition fails in the first iteration, o/p=>1
		//break; //cannot be written like this, either in a loop or in a switch-case

//		int i=1;
//		do{
//			i++;
//			System.out.println(i);//234567
//								  //Hello
//								   //891011
//			if(i==7) {
//				System.out.println("hello");//if-else can be used inside switch/case or loops 
//			}
//			//break;
//		}while(i<=10);
		
		
		int p=10;
		do {
			System.out.println(p);//109876543210
			p--;
		}while(p>=0);
		
		
//		int p=10;
//		do {
//			System.out.println(p);
//			p--;
//		}while(true);//The condition is always saitsfied resulting in an infinite loop 
		
		
		//usecases:
		//waiting for an element
		
		System.out.println(1%2);
		System.out.println(2%2);
		
		//printing all the even numbers between 1 to 100
		for(int k=1;k<=100;k++) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		
		//printing all the odd numbers between 1 to 100
		for(int k=1;k<=100;k++) {
					if(k%2==1) { //or if(k%2!=0) 
						System.out.println(k);
					}
				}
				
		//printing odd numbers from 1 to 10
		for(int k=1;k<=10;k=k+2) {
				System.out.println(k);
				}
		
		//printing even numbers from 1 to 10
		for(int e=0;e<=10;e=e+2) {
			System.out.println(e);
			}
		
		for(int e=1;e<=10;e++){
			e++;
			System.out.println(e);//246810
		}
		
		
		for(int e=1;e<=10;e++){
			System.out.println(e);//13579
			e++;
		}
	}
	
}