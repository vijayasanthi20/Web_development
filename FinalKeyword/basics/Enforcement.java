package vijayasanthi.learning.basics;

public  class Enforcement extends Government {

	public static void main(String[] args) {
		Enforcement en =new Enforcement();
		en.raid();
		en.collect_documents();
		
	}
//annotations
	@Override // metadata for jvm understanding
	
	public void raid() {
		// TODO Auto-generated method stub
		System.out.println("Cooperate Raid");
	}

	@Override
	public void collect_documents() {
		// TODO Auto-generated method stub
		System.out.println("Give necessary documents");

	}

}
