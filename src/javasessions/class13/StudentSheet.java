package javasessions.class13;

public class StudentSheet {

	// WAF:getStudentMarks(String name)
	// return: marks(int)
	// 0 to 100
	public int getStudentMarks(String name) {
		System.out.println("Student Name:" + name);
		switch (name.toLowerCase().trim()) {
		case "priya":
			return 90;
			//The return an break cannot be together
			//break;
			
		case "ravi":
			return 10;
		
		case "shikha":
			return 100;	

		default:System.out.println("Pls pass the write name:"+name);
			return -1;
		}
	}

	public static void main(String[] args) {
		StudentSheet sh=new StudentSheet();
		int m=sh.getStudentMarks("priya");
		System.out.println(m);
		
		if(m>0) {
			System.out.println("Print Marksheet");
		}
	}
}
