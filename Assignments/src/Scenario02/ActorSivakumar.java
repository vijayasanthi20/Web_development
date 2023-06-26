package Scenario02;

//2) Create class named as ActorSivakumar with main method
//– implement interface ‘Actor’ to this class.
//– Give your own definitions for methods from interface
//– Have static variable String address.
//– Assign value to address as “Coimbatore”.
//– Have instance method ‘speaking()’ with void return data type.
//– Create instance for ActorSivakumar as below
//ActorSivakumar as = new ActorSivakumar(65, “Audi Car”)
//– Handle with proper Constructor
//– Access all the methods from ActorSivakumar class
//– Access variable address and print the value
//– Create another instance of interface ‘Actor’ using dynamic binding approach
//Actor ac = new Sivakumar();
//– Handle with proper Constructor
//– Access methods in ActorSivakumar class.
//– Access variable address using ‘ac’ intance and print the value
//– Observe and note down the difference between two instances

public class ActorSivakumar implements Actor {
	//static  String address="Coimbatore";

	public ActorSivakumar(int age, String carType) {
		
		
	}

	public ActorSivakumar() {
		
	}

	public static void main(String[] args) {
		
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
		System.out.println(ActorSivakumar.address);
		as.act();
		as.dance();
		as.sing();
		
		as.speaking();
		
		Actor ac = new ActorSivakumar();
		ac.act();
		ac.dance();
		ac.sing();
	//	ac.speaking();
		System.out.println(Actor.address);

	}

	@Override
	public void act() {
		System.out.println(" act");
		
	}

	@Override
	public void dance() {
		System.out.println(" dance");
		
	}

	@Override
	public void sing() {
		System.out.println(" sing");
		
	}
	
	void speaking() {
		System.out.println(" Speaking");
		
	}
	
	//Differences are
	//instance as  - can able to access all method of the interface and its own method and variables
	//- static variable with same name  can be overrided in implementaion class
//   -implementaion must implement all method of is interface
	//instance ac ( dynamic binding -  it cannot invoke method of implementaion class
	//can able to access all method of the interface 
	//its own variables values are accessible, cannot be overrided
}
