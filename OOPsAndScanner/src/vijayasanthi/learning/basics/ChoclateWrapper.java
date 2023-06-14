package vijayasanthi.learning.basics;

import java.util.Scanner;

public class ChoclateWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChoclateWrapper cw=new ChoclateWrapper();
		cw.findNumberOfChoc();
	}

	private void findNumberOfChoc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  no.of chocolates");
		int num=sc.nextInt();
		
		int actual_chocolate=num;
		
		
		int rem_wrapper=15;
		int rem=0;
		int total=0;
		while(num>=3) {
			
			rem_wrapper=num/3;
			System.out.println("chocolates from wrapper "+rem_wrapper);
			
			if(num % 3==0) {
				rem=0;
				
			}else {
				rem=num % 3;
			}
			System.out.println("remaining chocolates to get wrapper "+rem);
			num=rem_wrapper+rem;
			System.out.println("total no.of remaining chocolates  "+num);
			System.out.println("---------------");
			total=total+rem_wrapper;
			
		}
		
		System.out.println("total is "+(total+actual_chocolate));
	}

}
