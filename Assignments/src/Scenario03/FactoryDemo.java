package Scenario03;
//2) Create class called ‘FactoryDemo’ as abstract subclass of SmartPhone
//– Add the below abstract methods
//– void verifyFingerPrint()
//– void providePattern()
//– Add non abstract method void browse()
//– print ‘Factory Demo browsing’ inside browse() method definition
//– Add variable boolean isOriginalPiece and assign ‘false’ as value.
//– Add static variable int price and set value as 0.

public abstract class FactoryDemo extends SmartPhone {

	boolean isOriginalPiece=false;
	static int price=0;



	
abstract void verifyFingerPrint();
abstract void providePattern();

void browse() {
	
System.out.println("Factory Demo browsing");
}

}
