package javasessions.class15.constructorConcept;

//Program 8
public class Student {

	String name;
	int age;
	
	//There is a hidden constructor that will be added by the jvm at runtime
	//Called the default constructor,using which Java will be able to create the object of the class
	
	//As soon as a parameterized constructor is added then the hidden default constructor wont be added by the JVM
	//Thus objects wo any values can be created,resulting in an Error
	
	
	public Student(String name) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student();

	}

}
