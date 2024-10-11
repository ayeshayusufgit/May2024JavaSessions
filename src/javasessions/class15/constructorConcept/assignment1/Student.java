package javasessions.class15.constructorConcept.assignment1;

//Class and Objects
//Assignment 1:
public class Student {
	  public String name; 
	  public int age; 
	  public static int totalNoOfStudents=0;
	  
	  
	  public Student(String name,int age) {
		  this.name=name;
		  this.age=age;
		  ++totalNoOfStudents;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studObj1=new Student("Ayesha",40); 
		
		System.out.println(studObj1.name+" "+studObj1.age);
		System.out.println("Total No Of Students:"+totalNoOfStudents);
		studObj1.name="Ibu";
		System.out.println(studObj1.name+" "+studObj1.age);
		
		Student studObj2=new Student("Naveen",45);
		System.out.println(studObj2.name+" "+studObj2.age);
		System.out.println("Total No Of Students:"+totalNoOfStudents);
	}

}
