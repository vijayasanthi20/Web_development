package vijayasanthi.learning.basics;

public class PrintNumbers {

	public static void main(String[] args) {
		//1 2 3 4 5 12 24 36 48 60 


		int no = 1; 
		while(no<=60)
		{
		System.out.print(no+" "); 
		if(no==5)
		    {
		    no = 12; 
		    continue; 
		    }
		if(no<=5)
		    {
		    no=no+1; 
		    }
		else
		    {
		    no = no+12; 
		}

		}
		
	}

}
