package javasessions.class14;

//2nd Program
public class MainMethodOverloading {

	//Can the main method be overloaded?
	//The main method can be overloaded in java, there can be n overloaded methods of the main
	//but the execution of a program starts only when the jvm calls the psvm(String[] args){}
	
	//JVM always searches for the signature of psv main(String[] args) to execute a program
	
	//**Interview Question:
	//Why is main always static in nature? 
	//JVM doesnt have to create the object of this class to call it, thats why its static
	
	//Why the main is always void in nature?
	//Because in the main we never write the business logic thats why its void
	public static void main(String[] a) {
		//JVM will be calling the main so it will supply the array of Strings to it
		//which can be written as follows: public static void main(String[] a){}
		//instead of args as its also an array of strings
		
		System.out.println(a.length);
		//if its value > 0 then JVM is supplying the values ow if 0 then its not
		//JVM is supplying a blank array to the main
		
		// TODO Auto-generated method stub
		System.out.println("Hello");
		MainMethodOverloading.main(10);
		
		
		payment("naveen@okhdfc", "upi");
		
	}
	
	//This method will be called from the main if 2 String arrays are passed the the main(String []arg1,String []arg2)
	public static void main(String arg1[],String arg2[]) {
		System.out.println("Naveen");
	}
	
	public static void main(int a) {
		System.out.println("Hi:"+a);
		MainMethodOverloading.main(a, 30);
	}
	
	public static void main(int a,int b) {
		System.out.println("Bye:"+(a+b));
	}
	
	//Write a program in which 2 payments are taken both are strings
	//(one takes the upi and the other the paypal id)
	/*public void payment(String  upi) {
		
	}
	
	public void payment(String payPaLId) {
		
	}*/
	//duplicate method with the same datatype as parameter cannot be created for method overloading
	//one single method which takes in the id and checks if its an aadhaar or PAN and accordingly a check
	//is made if its aadhaar or PAN card and the business logic is write around it.(method 1)
	//or
	//An extra identifier can be passed in the method which is payment type
	//depending on that the if conditions can be written(method 2)
	
	
	//a common variable has to be taken which takes care of UPI or PAYPAL Id
	//method 1
	public void payment(String upiOrPayPalId) {
		if(upiOrPayPalId.contains("upi")) {
			//use gpay
		}else {
			//or pay using paypal
			System.out.println("PayPal");
		}
	}
	
		//method 2
		public static void payment(String upiOrPayPalId,String paymentType ) {
			if(paymentType.equals("upi")) {
				//use gpay
			}else if(paymentType.equals("paypal")){
				//or pay using paypal
				System.out.println("PayPal");
			}
		}
	
	
	
	
}
