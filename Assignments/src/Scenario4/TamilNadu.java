package Scenario4;

public class TamilNadu extends SouthIndia{
	
	 static  String capital = "Chennai";

	public TamilNadu(String primeMinister) {
		super(primeMinister);
		
	}
	

	

	public TamilNadu() {
		System.out.println("calling from tamil nadu");
	}




	public static void main(String[] args) {
		SouthIndia si = new TamilNadu();
		si.cultivate();
		si.dress();
		si.eat();
		si.livingStyle();
		si.speakLanguage();
		//System.out.println(si.capital);
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		
		
		
	}
	

	@Override
	void speakLanguage() {
		System.out.println("Tamil");
		
	}

	@Override
	void eat() {
		System.out.println("RIce");
		
		
	}

	@Override
	void dress() {
		System.out.println("Saree");
		
	}
	
	
	void cultivate() {
	System.out.println("Rice and Sugar cane cultivation");
	}
	void livingStyle() {
		
		System.out.println("Above Average development");
	}
	

	
	
	

}
