package vijayasanthi.learning.basics;

public class PrintNUmbersReverse {

	public static void main(String[] args) {
		PrintNUmbersReverse rn= new PrintNUmbersReverse();
		//rn.printInreverseOrder(1234);
		//rn.count_of_digits(751239);
		//rn.sum_of_digits(1234);
		//rn.sum_of_2digits(123456);
		rn.printStarightOrder(123456);
		

	}

	private void printStarightOrder(int no) {
	
			// TODO Auto-generated method stub
			int div = 100000;
			while(div>=1)
			{
		System.out.println(no/div+ " ");  // ==> 1
			no = no%div; //no = 234
			div = div/10; 
			}
		
		
	}

	private void sum_of_2digits(int cake) {
		while(cake>0)
	    {
	    System.out.println("reverse 2 digits "+cake%100);    
	    cake = cake/100;
	    }
	
		
	}

	private void sum_of_digits(int no) {
		int sum = 0; 
	//	int reminder=0;
		while(no>0)
		{
			//System.out.println(no%10);
		
			int reminder=no%10;
			sum = sum+reminder; 
			no = no/10; 
		}
		System.out.println("sum of no "+sum);
		
	}

	private void printInreverseOrder(int cake) {
	
		while(cake>0)
		    {
		    System.out.println(cake%10);    
		    cake = cake/10;
		    }
		
	}
	
	private void count_of_digits(int no) {
		// TODO Auto-generated method stub
		int count = 0; 
		while(no>0)
		{
			//System.out.println(no%10);
			no = no/10; 
			count = count +1; 
		}
		System.out.println("count of no.s "+count);
	}

}
