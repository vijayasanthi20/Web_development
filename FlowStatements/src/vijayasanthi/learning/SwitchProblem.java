package vijayasanthi.learning;



import java.util.Scanner;

public class SwitchProblem {

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter a number");
	int input=sc.nextInt();
	
	switch(input) {

	case 1:
		System.out.println("1");
	case 2: 
		System.out.println("2");
	
	
		
	default:
		System.out.println("3");
}

}
}