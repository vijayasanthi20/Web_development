package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi  implements TrafficRulesDelhi,TrafficRules{
	
	public static void main(String[] args) {
		CommonManInDelhi cd= new CommonManInDelhi();
		cd.dontGoByDieselVehicle();
		cd.goByBicycle();
		cd.goByDieselVehicle();
		
		}

	@Override
	public void dontGoByDieselVehicle() {
		System.out.println("dontGoByDieselVehicle delhi");
		
	}

	@Override
	public void goByBicycle() {
		System.out.println("goByBicycle delhi");
		
	}

	@Override
	public void goByDieselVehicle() {
		
		System.out.println("goByDieselVehicle ");
	}

}
