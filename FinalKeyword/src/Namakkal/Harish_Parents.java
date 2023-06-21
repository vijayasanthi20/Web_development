package Namakkal;

public final class Harish_Parents {
	int doorNo =100;
	private int age = 20;
	protected int income=40000;
	public static void main(String[] args) {
		
Harish_Parents harish_Parents=new Harish_Parents();
			System.out.println("Door no is "+harish_Parents.doorNo);
			harish_Parents.hobby();
			harish_Parents.give_invitation();
			harish_Parents.chooseBride();
	}
	
	void hobby()
	{
	System.out.println("Going to ARRS Theatre"); 
	}

	
	private void personal_details()
	{
	System.out.println("Personal details"); 
	}
	
	protected void give_invitation()
	  {
	    System.out.println("harish marriage");
	  }

	//Method Overriding: 
	 
	  
	  protected final void chooseBride()
	  {
	    System.out.println("Status Education ");
	  }
}
