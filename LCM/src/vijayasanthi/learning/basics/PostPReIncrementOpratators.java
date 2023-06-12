package vijayasanthi.learning.basics;

public class PostPReIncrementOpratators {

	public static void main(String[] args) {
	
			int no = 10; 
			int a1=0;
			  System.out.println(no++);
			  System.out.println(no);

		
			  System.out.println(++no);//post increment
			  System.out.println(no);

	
			  System.out.println(no++ + no++);
			          //  10  + 11
			  System.out.println(no);//12
			  System.out.println(no++ + ++no);
			          // 12   + 14
			  int no1=10,no2=20;
			System.out.println(no1 + no1++ + --no1 + no1++ + ++no1);
			System.out.println(no1 + no1++ + --no1 + no1++ + ++no1 +
			           no2 + no2++ + --no2 + no2++ + ++no2);

		
			int  a = 10, b = 20, c = 30;
			System.out.println(a++ + b++ + c++ - --a + --b + --c);
			
		
				 no1 = 10;
				 no2 = 20; 
				    while(no1>=1 || no2>=1)
				    {
				      System.out.println(no1);
				      no1--;
				      no2--;
				    }

				
				for( no1=10, no2=20; no1<=10 && no2<=20 ;no1--, no2--)
				    {
				      
				    }

			

				for( no=1; no<=5; no++)
				{
				  System.out.println(no);
				}
				System.out.println(no);

		
				for( no=1; no<=5; no++)
				{
				  System.out.println(no);
				}
				System.out.println(no);

				
				for(;;)
				{
				  System.out.println("Hi");
				}

//			int a2=0;
//				
//				    while(a1++<5) {
//				      System.out.print(a1+" ");
//				    }

//				
//				 int a3=1;
//				    while(a2<5) {
//				      System.out.println(++a2);
//				    }
//
//				
//				
//				    while(a1<5) {
//				      System.out.println(a1++);
//				    }

	
				


	}

}
