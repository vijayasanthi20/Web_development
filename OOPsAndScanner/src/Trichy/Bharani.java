package Trichy;

public class Bharani implements Govt , FranceGovt {

	public static void main(String[] args) {
		Bharani bb=new Bharani();
		bb.play();
		
		Govt govt= new Bharani();
		govt.follow_traffic_rules();
		
		Govt govt1= new Bharani();
		govt1.go_by_flght();
		bb.keepVisa();

	}

	@Override
	public void follow_traffic_rules() {
		System.out.println("  follow traffic rules ");
		
	}

	@Override
	public void go_by_flght() {
		System.out.println("  check travel doc  details");
		
	}

	

	public void play() {
		System.out.println("  play ");
		
	}

	@Override
	public void keepVisa() {
		System.out.println("  keep  bharani visa ");
		
	}

	

}
