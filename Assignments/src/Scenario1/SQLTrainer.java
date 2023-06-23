package Scenario1;
//2) Create a sub class “SQLTrainer” under “Trainer”.
//– Have main method in it.
//– Create instance ram for this class
//– Handle with proper super class constructor
//– Access parent class instance variables
//– Call parent class instance method training()
//– Access salary using getter method in parent class

public class SQLTrainer extends Trainer {

	
	public SQLTrainer(String dept, String inst) {
		super(dept,inst);
	}

	public static void main(String[] args) {
		SQLTrainer ram=new SQLTrainer("SQL", "payilagam");
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		
		ram.training();
		
	}

}
