package javasessions.class19.interfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh=new FortisHospital();
		fh.physioServices();
		fh.entServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.orthoServices();
		fh.neuroServices();
		fh.pediaServices();
		
		fh.medicalTraining();
		fh.pathologyServices();
		
		fh.emergencyServices();
		fh.medicalInsurance();
		
		USMedical.billing();//static methods can be called by the interface name
		//FortisHospital.billing();
		//the static method cannot be called using the name of the class implementing it
		
		//if an identical,individual static method is there in the class, then the method can be called using the classname.methodName()
		FortisHospital.billing();
		
		System.out.println(USMedical.MIN_FEE);
		//USMedical.MIN_FEE=100;
		//the interface variables cannot be assigned hence proved that they are final in nature
		System.out.println(FortisHospital.MIN_FEE);
		
		fh.covidVaccination();
		fh.medicalNews();//the method getting overridden in the FortisHospital class
		fh.medicalRnD();//the Medical class method being picked up
		
		//Objects cannot be created in java of an interface
		//USMedical us=new USMedical();
		
		//Topcasting:
		//child class object can be referred by the parent interface reference variable
		
		USMedical us=new FortisHospital();
		us.oncologyServices();
		us.physioServices();
		us.dentalServices();
		us.emergencyServices();
		us.covidVaccination();
		
		//Downcasting:this is not allow incase of interfaces
		//Parent Interface object referred by reference of FortisHospital
		//FortisHospital f1=new USMedical();
		//the compiler wont allow the creation of an object of an interface
		
	}
}
