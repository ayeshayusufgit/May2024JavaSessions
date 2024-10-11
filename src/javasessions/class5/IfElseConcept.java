package javasessions.class5;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	==	 is a comparision operator which results in either true or false
		System.out.println(10==10);//true
		System.out.println(10==20);//false
		
//		int a=30;
//		int b=20; // when a>b is true then the if block will be executed
		int a=10;
		int b=20;//	when a>b is false then the else block will be executed
		
		
		//If(condition is true) then the code inside the if block will be executed
		//ow the else block will be executed
		
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			//else is not mandatory
			System.out.println("b is greater than a");
		}
		
		
		//if(condition can be true) as below then the if block will be executed
		if(true) {
			System.out.println("Hii");
		}
		
		//if(condition can be false) as below, it becomes a dead code as it can never be executed 
		if(false) {
			System.out.println("Hii");//dead code, java code will never be executed
		}
		
		//in this case the if condition is always true 
		if(true) {
			System.out.println("Hii");
		}else {
			//the else part is a dead code as this code will never get executed
			System.out.println("Bye");
		}
		
		//in this case the if condition is always false 
		if(false) {
			//the if part is a dead code as this code will never get executed 
			System.out.println("Hii");
		}else {
			System.out.println("Bye");
		}
		
		
		//depending on the flag(true|false) the if n else part will be executed, therefore there is no dead code  
		//the if else logic is dependent on the flag
		boolean flag=true;
		if(flag) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye!!");
		}
		
		boolean isHeadLess=true;
		if(isHeadLess) {
			System.out.println("run tc in headless mode");
		}
		else {
			System.out.println("run tc in normal mode");
		}
		
		
		if(10>5) { //Directly the value with condition is written(should represent a boolean)
			System.out.println("Naveen");
		}
		
		//if--if--else--if
		//nested if/else
		//int marks=90;
		
		//int marks=150;
		//int marks = 97;
		int marks = 100;
		
		if(marks<=100) {
				if(marks>=90) {
					System.out.println("Grade A");
					if(marks>=95) {
						System.out.println("100% scholarship");
						if(marks==100) {
							System.out.println("0% tuition fees");
						}else {
							System.out.println("10% tuition fees");
						}
					}
				}
		}else {
			System.out.println("INVALID MARKS");
		}
		
		
		//comparing primitive datatype ==
		//comparing non primitve datatype .equals()
		
		//if--elseif-elseif-else
//		String browser="chrome";
//		
//		if(browser.equals("chrome")) {//this condition will be satisfied the if code will be executed
//			System.out.println("Launching chrome"); // o/p=> Launching chrome
//		}
//		
//		if(browser.equals("firefox")) {//this condition will be checked but since the condition is false the if code wont be executed
//			System.out.println("Launching firefox");
//		}
//		
//		if(browser.equals("edge")){//this condition will be checked but since the condition is false the if code wont be executed
//			System.out.println("Launching edge");
//		}
//		
//		if(browser.equals("ie")){ //this condition will be checked but since the condition is false the if code wont be executed
//			System.out.println("Launching ie");
//		}else { //the else code will be executed
//				//the last else is associated with the last if
//			System.out.println("pls pass the right browser:"+browser); //o/p=>pls pass the right browser:chrome
//		}
//		
		//The above code has 2 major problems
		//1.Even if the first condition is satisfied all the conditions are bring checked unnecessarily
		//if there are many if conditions, like 100s of if conditions resulting in a performance issue
		//2.The last else is also getting executed unnecessarily even though its a chrome browser
		
		//if browser is ie in that case also all the conditions are going to be executed n then the final if will be executed
		//o/p=>Launching ie
		
		//The above code is not proper and should be fixed as below
		
		//String browser="chrome";
//		if(browser.equals("chrome")) {//this condition will be satisfied, the if code will be executed
//			System.out.println("Launching chrome"); // o/p=> Launching chrome
//		}
//		else if(browser.equals("firefox")) {//this condition will not be executed
//			System.out.println("Launching firefox");
//		}
//		else if(browser.equals("edge")){//this condition will not be executed
//			System.out.println("Launching edge");
//		}
//		else if(browser.equals("ie")){ //this condition will not be executed
//			System.out.println("Launching ie");
//		}else { //the else code  wont be executed
//			System.out.println("pls pass the right browser:"+browser);		
		
		
		//String browser="ie";
		//the first 4 conditions will be checked and then the if condition for "ie" code will be executed
		//o/p=> Launching ie
		//This code also has a performance issue
		//if there are 100 conditions then in the 100th condition results in true then 100 conditions they be executed thus resulting in a performance issue
		//if there are 100 conditions and if the first condition results in true then only 1 condition will be executed
		//if there are 100 conditions and if the 50th condition results in true then uselessly 49 conditions will be executed resulting again in perf issues
		
		String browser="opera";
		//in this case all the 4 conditions will be executed and then the else resulting in a perf issue
		if(browser.equals("chrome")) {//this condition will be executed but condition will be false, so the if body wont be executed
			System.out.println("Launching chrome");
			//break; this cannot be used in if-else-if can only be used in loops(while/for) 
		}
		else if(browser.equals("firefox")) {//this condition will  be executed but condition will be false, so the if body wont be executed
			System.out.println("Launching firefox");
		}
		else if(browser.equals("edge")){//this condition will be executed but condition will be false, so the if body wont be executed
			System.out.println("Launching edge");
		}
		else if(browser.equals("ie")){ //this condition will be executed but condition will be false, so the if body wont be executed
			System.out.println("Launching ie");
		}else { //since non of the conditions are met the else will be executed
			System.out.println("pls pass the right browser:"+browser);
		}
		//This is not the right way of writing the code, so a better approach wud be using switch case
		
		
		
		
		
	}
	
	
	
	

}
