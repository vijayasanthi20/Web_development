package vijayasanthi.learning.basics;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping swap= new Swapping();
		//swap.swap_amount(10,20);
		swap.swap_without_3rd(123,234);
		swap.print_fibo();
		swap.print_fibo_without_third();
	}
	
	private void print_fibo() {
		// TODO Auto-generated method stub
		//0	1	1	2	3	5	8	13
		int a = 0, b = 1; 
		while(a<=63)
		{
		int c = a + b; 
		System.out.print(a+" ");
		a = b; 
		b = c; 
		}	
	}

	private void swap_without_3rd(int no1, int no2) {
		System.out.println("no1 , no2 "+ no1+" "+no2);
	
		no1=no1+no2;
		System.out.println("no1 "+ no1);
		no2=no1-no2;
		
		System.out.println("no2 "+ no2);
		no1=no1-no2;
		System.out.println("no1 , no2 "+ no1+" "+no2);
	}
	

	private void swap_amount(int old_coin, int new_coin) {
		System.out.println("New "+ new_coin);
		int box=old_coin;
		
		old_coin=new_coin;
		
		new_coin=box;
		System.out.println("Old "+ old_coin);
		System.out.println("New "+ new_coin);
		
		
	}
	
	private void print_fibo_without_third() {
	    // TODO Auto-generated method stub
	    int a = 0, b = 1; 
	    int count = 0; 
	    while(count<10)
	    {
	      System.out.println(a+" ");
	      a = b-a; 
	      b = a+b; 
	      count=count+1; 
	    }
	  }

}
