package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules{

	public static void main(String[] args) {
		
		CommonManInChennai cm=new CommonManInChennai();
		cm.goByBicycle();
		cm.goByDieselVehicle();
		
	}
	@Override
	public void goByDieselVehicle() {
		System.out.println("goByDieselVehicle chennai");
		
	}

	@Override
	public void goByBicycle() {
		System.out.println("goByBicycle chennai");
		
	}

}
