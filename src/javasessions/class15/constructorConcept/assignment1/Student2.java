package javasessions.class15.constructorConcept.assignment1;

//Class and Objects
//Assignment 1:
public class Student2 {
	  public String name; 
	  public int age; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalStudents=0;
		
		 // q1: Create two Student objects and initialize their properties.
		Student2 studObj1=new Student2();
		studObj1.name="Ayesha";
		studObj1.age=25;
		++totalStudents;
		
		Student2 studObj2=new Student2();
		studObj2.name="Abu";
		studObj2.age=30;
		++totalStudents;
		
		// q2: Print the details of each student and the total number of students.
		System.out.println(studObj1.name+" "+studObj1.age);
		System.out.println(studObj2.name+" "+studObj2.age);
		System.out.println(totalStudents);
		
		// q3: Modify the age of one student and print the updated details.
		studObj2.age=35;
		System.out.println(studObj2.name+" "+studObj2.age);
		
	    // q4: Create another Student object and update the total number of students.
        Student2 studObj3 = new Student2();
        studObj3.name = "Emma";
        studObj3.age = 21;
        ++totalStudents;
        System.out.println(studObj3.name+" "+studObj3.age);
        System.out.println("Updated total student"+totalStudents);
        

	}

}
