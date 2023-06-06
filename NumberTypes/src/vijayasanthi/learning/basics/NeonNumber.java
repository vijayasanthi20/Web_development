package vijayasanthi.learning.basics;

public class NeonNumber {

	public static void main(String[] args) {
		int num=6;
		NeonNumber neon=new NeonNumber();
		int result=neon.findNeonNumber(num);
	if(result==num) {
			
			System.out.println("the given number "+num+"  is Neon number");
		}else {
			System.out.println("the given number "+num+"  is not an Neon number");
		}
		

	}

	private int findNeonNumber(int num) {
		
	//	findSquareRoot(num);
		int sqrt=num*num;
		System.out.println("sqrt is "+sqrt);
		int total=0;
		
		//separate into digits
		
	while(sqrt>0) {
			
			int mod=sqrt%10;
			System.out.println("mod is "+mod);
			total=total+mod;
			sqrt=sqrt/10;
		
		}
		
		return total;
		
	}

}
