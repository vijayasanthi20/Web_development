package vijayasanthi.learning.loops;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintStar pp =new PrintStar();
		//pp.printStar();
		//pp.printNumber();
		//pp.printNumber1();
		//pp.printNumber2();
		pp.printstars();
		

	}
	
	
	private void printstars() {
		for(int line=1 ; line <=10; line++){

			for(int col=1 ; col <=5; col++){

			if(col==5 ) {
			System.out.print("* "); 
			}else {
				System.out.print("  "); 
			}
			}
			System.out.println();
		}
		}
		
	


	private void printNumber2() {
		for(int limit = 7; limit>=1; limit-=2)
    {
        for(int no = 1; no<=limit; no++)
            System.out.print(no+" "); //1   2   3   4   5
        System.out.println(); 
    }
		
	}


	
	
	
	
	private void printNumber1() {
		for(int limit = 5; limit>=1; limit--)
		{
		    for(int no = 1; no<=limit; no++)
		        System.out.print(no+" "); //1   2   3   4   5
		    System.out.println(); 
		}
		
	}




	private void printNumber() {
		for(int val = 1; val<=5; val++)
		{
		for(int no = 1; no<=5; no++)
		    System.out.print(val +" "); //1 1   1   1   1 
		System.out.println(); 
		}
		
	}

	



	private void printStar() {
		for(int line=1; line<=5; line++)
		{
		    for(int star = 1; star<=5; star++)
		    {
		    System.out.print("* "); 
		    }
		    System.out.println(); 
		}
		
	}




	

}
