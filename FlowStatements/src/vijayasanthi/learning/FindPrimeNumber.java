package vijayasanthi.learning;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FindPrimeNumber findPrimeNumber=new FindPrimeNumber();
	
		
	findPrimeNumber.isPrimeNUmber();
		
	
		

	}

	private void isPrimeNUmber() {
		boolean primeNumber=false;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		for(int n=2;n<num/2;n++) {
		if(num%n==0) {
			primeNumber=false;
			break;
			
		}else {
			primeNumber=true;
			
		}
			
		}
		if(primeNumber==true) {
			System.out.println( " Number is prime number");
		}else {
			System.out.println("Number is not a prime number");
		}
	}

}
