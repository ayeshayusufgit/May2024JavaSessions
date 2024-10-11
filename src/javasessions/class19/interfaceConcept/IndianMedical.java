package javasessions.class19.interfaceConcept;

public interface IndianMedical {
	
	//If Fortis has to open a hospital in India then it should have these 3 services
	
	public void cardioServices();
	public void orthoServices();
	public void neuroServices();
	
	//Common method for all the countries
	public void emergencyServices();
	

}
