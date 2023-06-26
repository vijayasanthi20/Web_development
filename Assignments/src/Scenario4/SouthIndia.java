package Scenario4;

public abstract class SouthIndia extends India {

	public SouthIndia(String primeMinister) {
		super(primeMinister);
		
	}
	
	public SouthIndia() {
		
		System.out.println("calling from south india");	
	}
	
	void cultivate() {
	System.out.println("Rice and Wheat cultivation");
	}
	void livingStyle() {
		
		System.out.println("Average development");
	}

	
	
	

}
