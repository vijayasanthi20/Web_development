package Scenario03;
//
//Expected Understanding: Abstraction, Inheritance, return keyword, Method Arguments, Constructor
//1) Create an abstract class named ‘SmartPhone’
//– Add the below abstract methods
//– int call(int seconds)
//– void sendMessage()
//– void receiveCall()
//– Add non abstract method void browse()
//– print ‘SmartPhone browsing’ inside browse() method definition
//– Have constructor as below.
//public SmartPhone()
//{
//System.out.println(“Smartphone under development”);
//}
public abstract class SmartPhone {

	public SmartPhone() {
		
	
		System.out.println("Smartphone under development");

	}
	
	abstract int call(int seconds);
	
	abstract void sendMessage();

	abstract void receiveCall();
	//non abstract method should have body in abstract class
	void browse() {
		System.out.println("SmartPhone browsing");
		
	}
}
