package vijayasanthi.learning.whileloop;

public class AdditonMultiplicationOfFirst5Numbers {

	public static void main(String[] args) {

		AdditonMultiplicationOfFirst5Numbers ad=new AdditonMultiplicationOfFirst5Numbers();
		ad.addition();
		ad.multiplication();

	}
	
	
	private void multiplication() {
		//factorial of 1st 5 number
		int num=1;
		int total=1;
		while(num<=5) {
			total=total*num;
			System.out.println("num is :"+num);
			num=num+1;
			
			
			
		}
		
		System.out.println("total is :"+total);
		
	}


	private void addition() {

		int num=1;
		int total=0;
		while(num<=5) {
			total=total+num;
			System.out.println("num is :"+num);
			num=num+1;
			
			
			
		}
		
		System.out.println("total is :"+total);
		
	}


	

}
