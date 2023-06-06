package vijayasanthi.learning.basics;

public class ArmstrongNumbers {

	public static void main(String[] args) {
	
	//for 3 digit number , sum of the cubic of the digits will be same
		int no=145;
		ArmstrongNumbers an=new ArmstrongNumbers();
		int result=an.findArmstrongNumber(no);
		if(result==no) {
			
			System.out.println("the given number "+no+"  is Armstrong number");
		}else {
			System.out.println("the given number "+no+"  is not an Armstrong number");
		}
	}

	private int findArmstrongNumber(int no) {
		
		int div=10;
		double total=0;
		double count=findcount(no);
		
		while(no>0) {
			
			double mod=no%div;
			System.out.println("mod is "+mod+" count is "+count);
			total=total+Math.pow(mod, count);
			no=no/10;
		
		}
		System.out.println("total is "+total);
		return (int)total;
		
		
	}
	private int findcount(int num){
		int div=10;
		int count=0;
		
		while(num>0) {
			
			int mod=num%div;
			System.out.println(mod);
			num=num/10;
			count+=1;
			//System.out.println(no);
			
		}
		System.out.println("count is "+count);
		return count;
	}

}
