package javasessions.class19.interfaceConcept;

public class FortisHospital extends Medical implements IndianMedical,USMedical,UKMedical{
	//class	constant needs to be made static n final
	static final int MIN_FEE=50;
	
	//The business logic has to be implemented by the FortisHospital class
	
	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH--pediaServices");
		
	}

	@Override
	public void dermaServices() {
		System.out.println("FH--dermaServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH--physioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH--dentalServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH--cardioServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH--orthoServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH--neuroServices");
	}
	
	//Individual 
	public void medicalTraining() {
		System.out.println("FH--Medical Training");
	}
	
	//Individual
	public void pathologyServices() {
		System.out.println("FH--Pathology Services");
		medicalInsurance();
		
	}
	
	//Common method across US,UK and India
	public void emergencyServices() {
		System.out.println("FH--Emergency Services");
	}
	
	//Method Hiding-individual static methods can be there in the interface,class etc
	public static void billing() {
			System.out.println("FH--Billing");
		}
	
	@Override
	public void medicalInsurance() {
		System.out.println("FH--medicalInsurance");
	}
	
	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH--covidVaccination");
	}
	
	//Medical
	@Override
	public void medicalRnD() {
		System.out.println("FH--Medical RnD");
	}
}
