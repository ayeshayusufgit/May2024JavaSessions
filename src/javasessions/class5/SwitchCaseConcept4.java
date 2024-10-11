package javasessions.class5;

public class SwitchCaseConcept4 {

	public static void main(String[] args) {
		
		// cross browser logic
		//nested switch case can be used in java
		//1 switch will have multiple cases
		//only using cases within a case is not allowed
		
		String browser = "chrome";
		String version="121";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launching chrome");
			int i=1;
			System.out.println(++i);//any logic can be written in a case
			
			switch(version){
				case "121":
						System.out.println("Launch chrome 121 version");
						break;
						
				case "122":
						System.out.println("Launch chrome 122 version");
						break;
						
				case "123":
					System.out.println("Launch chrome 122 version");
					break;
				default: System.out.println("Pls pass the right browser version numbers");	
			}
			break;

		case "firefox":
			System.out.println("Launching firefox");
			break;

		case "edge":
			System.out.println("Launching edge");
			break;

		case "ie":
			System.out.println("Launching ie");
			break;

		default:
			System.out.println("plz pass the right browser:" + browser);
			break;

		case "opera":
			System.out.println("Launch opera");
			break;
		}
		//real time usecases of switch/case:
		//1.cross browser logic
		//2.cross OS logic
		//3.month, having 12 cases each corresponding for a month and performing specific operation on different month cases
		//4.cross users/RBAC-permissions,different ui for different role cases like admin,user,vendor,seller etc
		//like admin has a different ui from a ui etc
		//5.run testcases of different enviroments like:dev,qa,uat,stage,production
		//6.time zones(create different time zones EST,PST,IST in multiple cases)
		//7.Uber App:Maintain different cases for different cars(such that they have different pricing or rates)
		// cartypes: mini,sedan,suv,luxury etc
		//9.HR:user roles
		//10.localization: testing in En, Fr an define multiple cases wrt to that
		//11.Product category(different cases for diff category): Electronics,Fashion,Makeup etc

		//key of switch/case can be of datatypes byte,short,int,char,String
		//key of switch/case cannot be allowed of datatypes long,float,double
		//there is no usecase of using keys of datatype long,float and double
		
		
		
		
		
		
	}
}
