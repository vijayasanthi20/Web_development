package vijayasanthi.learning;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loop loop=new Loop();
		loop.printGivenNumbers();
		
	}

	private void printGivenNumbers() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		for(int n=1;n<=num;n++) {
			
			if(n%10==0 ) {
				
				continue;
			}else if(n>100) {
				
				break;
			}
			System.out.println("number is "+n);
	
		}
	}

}
