package Scenario4;

/*
 * 
 * Expected Understanding: Abstraction, Inheritance, Dynamic Binding, Polymorphism (Overriding), Constructor Overloading
1) Create an abstract class called ‘India’
– Have below abstract methods
– void speakLanguage()
– void eat()
– void dress()
– Have static variable String capital = “New Delhi”
– Have below Constructor
public India(String primeMinister)
{
System.out.println(“our Prime Minister is” + primeMinister);
}
2) Create an abstract class called ‘SouthIndia’
– Make this class as sub class of ‘India’
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Wheat cultivation’ inside this method
– void livingStyle()
– Print ‘Average development’ inside this method
3) Create a class called ‘TamilNadu’ with main method as sub class of ‘South India’.
– Add unimplemented methods
– Provide your own definitions wherever necessary.
– Have static variable String capital = “Chennai”
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Sugar cane cultivation’ inside this method
– void livingStyle()
– Print ‘Above Average development’ inside this method
– Using class name “India” – access variable ‘capital’ and print the value
– Using class name “TamilNadu” – access variable ‘capital’ and print the value.
– Create instance for “SouthIndia” as below
SouthIndia si = new TamilNadu()
– Observe which methods and variables can be accessed using ‘si’ and note down.
 */
public abstract class India {
	
	static  String capital = "New Delhi";	
	
	public India(String primeMinister)
	{
	System.out.println("our Prime Minister is" + primeMinister);
	}
	
 public India() {
	 System.out.println("calling from  india");	
	
	}
	abstract  void speakLanguage();
	abstract  void eat();
	 abstract void dress();
	 
	 

}
