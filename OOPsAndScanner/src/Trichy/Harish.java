package Trichy;

import Namakkal.Harish_Parents;


public class Harish extends Harish_Parents implements FranceGovt{
	final int doorNo = 15; 
	
	static boolean indian = true;
	int income=30000;
	
	public static void main(String[] args) {
		Harish harish=new Harish();
		harish.give_invitation();
		harish.chooseBride();
		System.out.println("income is "+harish.income);
		harish.keepVisa();

		
	System.out.println(harish.doorNo); 
			System.out.println(Harish.indian);
			Harish_Parents harishp=new Harish();
			harishp.chooseBride();
		
	}


//method overriding
public void chooseBride()

{
	System.out.println("income is "+super.income);
  System.out.println("My Life My Bride ");
}

protected void play()

{

  System.out.println("play");
}


@Override
public void keepVisa() {
	  System.out.println(" keep harish visa ");
}


}
