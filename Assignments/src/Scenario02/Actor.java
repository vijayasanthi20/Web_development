package Scenario02;
//Expected Understanding: Interface, Class, static variables, dynamic binding
//1) Create an interface called ‘Actor’
//– Have variables boolean makeUpRequired
//– Assign ‘true’ value for ‘makeUpRequired’
//– Have variable String address.
//– Assign value as “Chennai” to address.
//– Have void methods act(), dance(), sing()
public interface Actor {
	
	boolean makeUpRequired=true;
	String address="Chennai";
	
	void  act();
	
	void  dance();

	void sing();

}
