package vijayasanthi.learning.basics;

public class Minister extends Government {

	public static void main(String[] args) {
		Government officials = new Minister();
		officials.raid();
		officials.collect_documents();
		officials.pay_salary();
		Minister min = new Minister();
		min.announce_schemes();
		

	}

	@Override
	public void raid() {
		
		System.out.println("cocoperate raid");
		super.pay_salary();
		
	}

	@Override
	public void collect_documents() {
		System.out.println("give  doc");
		
	}
	
	void announce_schemes() {
		
		System.out.println(" announce_schemes ");
	}

}
