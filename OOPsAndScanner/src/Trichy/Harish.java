package Trichy;

import Namakkal.Harish_Parents;

public class Harish extends Harish_Parents{

	public static void main(String[] args) {
		Harish harish=new Harish();
		harish.give_invitation();
		harish.chooseBride();
	}


//method overriding
protected void chooseBride()

{
	  
  System.out.println("My Life My Bride ");
}

}
