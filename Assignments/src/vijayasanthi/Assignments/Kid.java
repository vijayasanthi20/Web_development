package vijayasanthi.Assignments;
//Kid: 
//1. Create a class called 'Kid'. 
//2. Declare Field as below in it. 
//  1. String name = "Suman"; 
//3. Define main method as 'public static void main(String[] args)
//4. Inside main method, create an instance called 'kid' for Kid class. 
//5. Have below methods in it. 
//  1. public void work()
//  2. public void study()
//6. Have print statements as you wish in the above two methods' definition. 
//7. Call study() method from main method. 
//8. Inside study() method, call work() method. 
//9. Print name and super.name inside work() method.


public class Kid extends Mother{
	String name = "Suman"; 

	public static void main(String[] args) {
		Kid kid = new Kid();
		
		kid.study();
	}

	
	public void work() {
		System.out.println(super.name);
		System.out.println(" kid "+name+" is working"  );
	
		
	}
	
	public void study() {
		System.out.println(" kid "+name+" is studying"  );
		
		work();
		
		
	}
}
