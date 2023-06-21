package Trichy;

import Namakkal.Harish_Parents;


public class Harish extends Harish_Parents{
	final int doorNo = 15; 
	
	static boolean indian = true;
	int income=30000;
	
	public static void main(String[] args) {
		Harish harish=new Harish();
		harish.give_invitation();
		harish.chooseBride();
		System.out.println("income is "+harish.income);

		
	System.out.println(harish.doorNo); 
			System.out.println(Harish.indian);
		
		
	}


//method overriding
protected void chooseBride()

{
	System.out.println("income is "+super.income);
  System.out.println("My Life My Bride ");
}

}
