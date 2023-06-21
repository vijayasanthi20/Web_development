package Trichy;

public class Bharani implements Govt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bharani bb = new Bharani(); 
	    bb.follow_traffic_rules();
	    System.out.println(Bharani.no_helmet_fine);
	    bb.play();
	 //   no_helmet_fine=100;
	    
	    //reference type of interface
	    Govt trafficPolice = new Bharani(); // Dynamic binding
		trafficPolice.follow_traffic_rules();
		trafficPolice.play();
		

	}

	@Override
	public void follow_traffic_rules() {
		// TODO Auto-generated method stub
		System.out.println("Two Wheeler Rules");
	}
	
	public void play()
	{
		System.out.println("Playing Badminton");
	}

}
