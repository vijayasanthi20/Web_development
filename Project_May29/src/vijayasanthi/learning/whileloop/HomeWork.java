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
		System.out.println(" ");
		hw.homework2();
		System.out.println(" ");
		hw.homework3();
		System.out.println(" ");
		hw.homework4();
		System.out.println(" ");
		hw.homework5();
		System.out.println(" ");
		hw.homework6();
		System.out.println(" ");
		hw.homework7();

	}


	private void homework7() {
		int num=1;
	
		while(num<=5) {
		System.out.print(num+"*"+(num+1)+"*"+(num+2)+" ");
		num=num+1;
	
		}
		
		
	}


	private void homework6() {
		int num=1;
		
		while(num<=5) {
		System.out.print(num+"*"+(num+1)+" ");
		num=num+1;
		
		}

		
		
	}


	private void homework5() {
		int num=1;
		int inc=2;
		while(num<=15) {
		System.out.print(num+" ");
		num=num+inc;
		inc=inc+1;
		}

	}


	private void homework4() {
//		int num=3;
//		while(num<=15) {
//		System.out.print(num+" ");
//		num=num+3;
//		}
		int num=1;
		while(num<=5) {
			System.out.print(num*3+" ");
			num=num+1;
			}
				
			
	}


	private void homework3() {
//		int num=2;
//		while(num<=10) {
//		System.out.print(num+" ");
//		num=num+2;
//		}
		
		int num=1;
		while(num<=5) {
		System.out.print(num*2+" ");
		num=num+1;
		}
	
	}


	private void homework1() {
		// TODO Auto-generated method stub
		
		int day=1;
		while(day<=5) {
			System.out.print(day+" ");
		
			day=day+1;
		
			
		}

		
	}
	
	private void homework2() {
     int num=1;
		
		while(num <=9) {
		System.out.print(num+" ");
		num=num+2;
		
	}
	

	}

}
