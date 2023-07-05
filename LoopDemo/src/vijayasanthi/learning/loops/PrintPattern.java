package vijayasanthi.learning.loops;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPattern pp=new PrintPattern();
		//pp.pattern_V();
			//pp.pattern_Y();
			pp.pattern_M();

	}
	
	
	private void pattern_M() {
		// TODO Auto-generated method stub
		for(int line = 1; line<=9;line++)
		{
		    for(int star = 1; star<=7; star++)
		    {
		    	if(line<=4)
		    	{
		    		if(star==line || star==8-line || star==1 || star==7)
		    		{
		    			System.out.print("* ");
		    		}
		    		else
		    		{
		    			  System.out.print("  "); 
		    		}
		    	}
		    	else
		    	{
		    		if(star==1 || star==7)
		    			System.out.print("* ");
		    		else
		    			System.out.print("  ");
		    	}
		    	
		  
		    }
		    System.out.println(); 
		} 
		
	}
	private void pattern_Y() {
		for(int line = 1; line<=9;line++)
		{
		    for(int star = 1; star<=7; star++)
		    {
		    	if(line<=4)
		    	{
		    		if(star==line || star==8-line)
		    		{
		    			System.out.print("* ");
		    		}
		    		else
		    		{
		    			  System.out.print("  "); 
		    		}
		    	}
		    	else
		    	{
			    	if(star==4)
			    		System.out.print("* ");
			    	else
			    		System.out.print("  ");
		    	}
		  
		    }
		    System.out.println(); 
		} 
		
	}

	private void pattern_V() {
		// TODO Auto-generated method stub
		for(int line = 1; line<=9;line++)
		{
		    for(int star = 1; star<=7; star++)
		    {
		    	if(line<=4)
		    	{
		    		if(star==line || star==8-line)
		    		{
		    			System.out.print("* ");
		    		}
		    		else
		    		{
		    			  System.out.print("  "); 
		    		}
		    	}
		    	
		    }
		    System.out.println(); 
		} 
	}

}
