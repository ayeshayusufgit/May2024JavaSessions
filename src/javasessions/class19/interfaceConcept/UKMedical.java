package javasessions.class19.interfaceConcept;

public interface UKMedical {
	
	//IF Fortis has to open a hospital in UK then it should have these 3 services
	
	public void entServices();
	
	public void pediaServices();
	
	public void dermaServices();
	
	//Common method for all the countries
	public void emergencyServices();

	
}
