package vijayasanthi.learning.basics;

public class PerfectNumber {

	public static void main(String[] args) {
		int num=6;
		PerfectNumber pn=new PerfectNumber();
	int result=	pn.findPerfectNumber(num);
		if(result==num) {
			System.out.println(num+ " is perfect number ");
		}else {
			System.out.println(num+ " is not perfect number ");
		}
	
	}

	private int findPerfectNumber(int num) {
		//find divisors
		int div=1;
		int sum=0;
		while(div<=num/2) {
			
			if(num%div==0) {
			System.out.println(div);
			sum=sum+div;
			
			}
			
			div=div+1;
			
		}
		
		System.out.println("total is "+sum);
		return sum;
	}

}
