package vijayasanthi.learning.ifloops;


public class IPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPL ipl= new IPL();
		int mi = 200; 
		int gt = 201; 
		//ipl.play_qualifier(mi, gt);
		ipl.play_qualifier2(mi, gt);

	}
	
	
private void play_qualifier2(int mi, int gt) {
	// TODO Auto-generated method stub
	


if(mi > gt) {
	int csk=210;
	mi=300;
	
	if(csk>mi) {
		
		System.out.println("Dhoni gets Trophy");
	}else {
		
		System.out.println("MI gets Trophy");
	}
	
}else {
	int csk=210;
	gt=260;
	
	if(csk> gt) {
		
		System.out.println("Dhoni gets Trophy");
	}else {
		System.out.println("GT gets Trophy");
		
	}
}

}
void play_qualifier(int miScore, int gtScore) {
	if(miScore>gtScore)
		{
			System.out.println("MI enters finals");
		}
		else
		{
			System.out.println("GT enters finals");
		}

		}

}
