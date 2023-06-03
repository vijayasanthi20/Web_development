package vijayasanthi.learning.whileloop;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisors di=new Divisors();
		//di.count_divisors(100);
		int no=49;
		
		int count=di.count_divisors(no);
		di.find_prime_number(count,no);
		di.find_greatest_divisor(no);
		di.find_smallest_divisor( no);
		di.find_smallest_divisor1(no);
		

	}
	
	private void find_prime_number(int count, int no) {
		if(count==0) {
			System.out.println(no+" is  prime number");	
		}else{
			System.out.println(no+" is  not a prime number");		
		}
		
	}

	private int count_divisors(int no) {
		int div = 2; 
		int count = 0; 
		while(div<=no/2)
		{
			if(no%div==0)
			{
				//System.out.println(div);
				count = count + 1; 
			}
		div = div + 1; 
		}
		System.out.println("Count of divisors "+count);	
		return count; 
	}
	
	private void find_greatest_divisor(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int greatest = -1; 
		while(div<=no/2)
		{
			if(no%div==0)
			{
				greatest = div; 
			}
			div = div+1; 
		}
		System.out.println("Greatest Divisor is "+ greatest);
		
	}
	
	private void find_smallest_divisor(int no) {
		// TODO Auto-generated method stub
		int smallest=-1;
		int div = 2; 
		//int greatest = -1; 
		while(div<=no/2)
		{
			if(no%div==0)
			{
				smallest = div; 
				break;
			}
			div = div+1; 
		}
		System.out.println("smallest Divisor is "+ smallest);
	}
	
	
	private void find_smallest_divisor1(int no) {
		// TODO Auto-generated method stub
		int smallest=-1;
		int div = 2; 
		//int greatest = -1; 
		while(div<=no/2)
		{
			if(no%div==0)
			{
				smallest = div; 
				break;
			}
			div = div+1; 
		}
		System.out.println("smallest Divisor is "+ smallest);
	}
	
	
}
