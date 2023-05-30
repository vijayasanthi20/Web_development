package vijayasanthi.learning.whileloop;
//1   2   3   4   5
//1   3   5   7   9
//2   4   6   8   10
//3   6   9   12  15
//1   3   6   10  15
//1*2 2*3 3*4 4*5 5*6
//1*2*3   2*3*4
public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork hw =new HomeWork();
		
		hw.homework1();
		hw.homework2();
		hw.homework3();
		hw.homework4();
		hw.homework5();
		hw.homework6();
		hw.homework7();

	}


	private void homework7() {
		int num1=1;
		int num2=2;
		int num3=3;
		while(num1<=5) {
		System.out.print(num1+"*"+num2+"*"+num3+" ");
		num1=num1+1;
		num2=num2+1;
		num3=num3+1;
		}
		System.out.println(" ");
		
	}


	private void homework6() {
		int num=1;
		int inc=2;
		while(num<=5) {
		System.out.print(num+"*"+inc+" ");
		num=num+1;
		inc=inc+1;
		}
		System.out.println(" ");
		
		
	}


	private void homework5() {
		int num=1;
		int inc=2;
		while(num<=15) {
		System.out.print(num+" ");
		num=num+inc;
		inc=inc+1;
		}
		System.out.println(" ");
		
	}


	private void homework4() {
		int num=3;
		while(num<=15) {
		System.out.print(num+" ");
		num=num+3;
		}
		System.out.println(" ");		
	}


	private void homework3() {
		int num=2;
		while(num<=10) {
		System.out.print(num+" ");
		num=num+2;
		}
		System.out.println(" ");
	}


	private void homework1() {
		// TODO Auto-generated method stub
		
		int day=1;
		while(day<=5) {
			System.out.print(day+" ");
		
			day=day+1;
		
			
		}
		System.out.println(" ");
		
	}
	
	private void homework2() {
     int num=1;
		
		while(num <=9) {
		System.out.print(num+" ");
		num=num+2;
		
	}
		System.out.println(" ");

	}

}
