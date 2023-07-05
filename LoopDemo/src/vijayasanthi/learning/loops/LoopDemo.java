package vijayasanthi.learning.loops;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDemo loopdemo = new LoopDemo();
		//loopdemo.pattern1();
	//	loopdemo.pattern2();
		//loopdemo.printI();
		///loopdemo.printT();
		//loopdemo.printNine();
		//loopdemo.print_C();
		//loopdemo.print_O();
		loopdemo.print_D();
		
	}
	private void print_D() {
		for(int row = 1; row<=9; row++)
	       { //row=2 1<=9
	        if(row==1 || row==9)
	        {
	        
	        	
	            for(int col = 1; col<=10; col++)
	            {
	            	
	            	if(col==9) {
	            		System.out.print(" "); 
	            	}else {
	                System.out.print("* "); 
	            	}
	            }
	        }
	        else
	        {
	            System.out.print("  *"); 
	            for(int space=1;space<=15; space++)
	            {
	              System.out.print(" ");
	            }
	            System.out.print("*");
	        }
	        System.out.println(); 
	      }
		
	}
	
	

	private void print_o() {
		for(int row = 1; row<=9; row++)
	       { //row=2 1<=9
	        if(row==1 || row==9)
	        {
	        
	        	
	            for(int col = 1; col<=9; col++)
	            {
	            	
	            	if(col==1 || col==9) {
	            		System.out.print("  "); 
	            	}else {
	                System.out.print("* "); 
	            	}
	            }
	        }
	        else
	        {
	            System.out.print("*"); 
	            for(int space=1;space<=15; space++)
	            {
	              System.out.print(" ");
	            }
	            System.out.print("*");
	        }
	        System.out.println(); 
	      }
		
	}


	private void print_O() {
		for(int row = 1; row<=9; row++)
	       { //row=2 1<=9
	        if(row==1 || row==9)
	        {
	            for(int col = 1; col<=9; col++)
	            {
	                System.out.print("* "); 
	            }
	        }
	        else
	        {
	            System.out.print("*"); 
	            for(int space=1;space<=15; space++)
	            {
	              System.out.print(" ");
	            }
	            System.out.print("*");
	        }
	        System.out.println(); 
	      }
	    
}


		private void print_C() {
		    // TODO Auto-generated method stub
		    for(int row = 1; row<=9; row++)
		       {
		        if(row==1 || row==9)
		        {
		            for(int col = 1; col<=9; col++)
		            {
		            	if(col==1 || col==9) {
		            		System.out.print("  "); 
		            	}else {
		                System.out.print("* "); 
		            	}
		            }
		        }
		        else
		        {
		            System.out.print("* "); 
		        }
		        System.out.println(); 
		      }
		    
		  }


	private void printNine() {

for(int row = 1; row<=9; row++)
   {
    for(int col = 1; col<=9; col++)
    {
        System.out.print("* "); 
    }
    System.out.println(); 
   }
		
	}

	private void printT() {
		for(int star=1; star<=7; star++)
	    {
	    System.out.print("* "); 
	    }
	    System.out.println(); 
	    for(int star=1; star<=6; star++)
	    {
	      for(int space=1; space<=6; space++)
	      {
	        System.out.print(" ");
	      }
	    System.out.println("* ");
	    }
//	    for(int star=1; star<=7; star++)
//	    {
//	    System.out.print("* "); 
//	    
//	    }
		
	}

	private void printI() {
		for(int star=1; star<=7; star++)
	    {
	    System.out.print("* "); 
	    }
	    System.out.println(); 
	    for(int star=1; star<=6; star++)
	    {
	      for(int space=1; space<=6; space++)
	      {
	        System.out.print(" ");
	      }
	    System.out.println("* ");
	    }
	    for(int star=1; star<=7; star++)
	    {
	    System.out.print("* "); 
	    }
		
	}

	private void pattern1() {
	    // TODO Auto-generated method stub
	    for(int row = 1; row<=3;row++)
	      {
	      for(int col=1; col<=7; col++)
	      {
	        System.out.print("* ");
	      }
	      System.out.println();
	      }    
	  }

		private void pattern2() {
		    // TODO Auto-generated method stub
		    for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		    System.out.println();
		    for(int star=1; star<=6; star++)
		    {
		      System.out.println("* ");
		    }
		    for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		  }
		
	
	
	  

}
