package vijayasanthi.learning.basics;

public class PrintNumbers1 {

	public static void main(String[] args) {
	//	1   3   5   7   9   2    4   6   8   10

		int no = 1; 
		while(no<=10)        //2<=9
		{
		    System.out.print(no+" "); //1
		    if(no==9)
		        {
		        no = 2; 
		        System.out.print(no+" ");   //2
		        }
		    no+=2; //4
		}
		
		
		
	//	1   3   5   7   9  2 4   6   8   10

		//int no = 1; 
		while(no<=10)        //2<=9
		{
		    System.out.print(no+" "); //1
		    if(no==9)
		        {
		        no = 0; 
		        }
		    no+=2; //2
		}
	}

}
