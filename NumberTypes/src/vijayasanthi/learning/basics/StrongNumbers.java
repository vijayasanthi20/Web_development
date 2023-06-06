package vijayasanthi.learning.basics;

public class StrongNumbers {

	public static void main(String[] args) {
	
		int num=145;
		StrongNumbers strong=new StrongNumbers();
		int result=strong.findStrongNumber(num);
	if(result==num) {
			
			System.out.println("the given number "+num+"  is Strong number");
		}else {
			System.out.println("the given number "+num+"  is not Strong number");
		}
		

	}

	private int findStrongNumber(int num) {
		
	
	int totalsum=0;
	
		//find sum of digits

	while(num>0) {
		int total=1;
		int div=1;
		int mod=num%10;
		System.out.println("reminder is "+mod);
		
		while(div<=mod) {
		
			total=total*div;
			System.out.println("num is :"+div);
			div=div+1;
		}	
		totalsum=totalsum+total;
		System.out.println("factorial is :"+total);
		num=num/10;
		
	}
	
	
	System.out.println("factorial is :"+totalsum);
		
	return totalsum;
	}
	

}
