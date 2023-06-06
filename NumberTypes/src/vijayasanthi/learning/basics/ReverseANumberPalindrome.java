package vijayasanthi.learning.basics;

public class ReverseANumberPalindrome {

	public static void main(String[] args) {
		int no=1051;
		ReverseANumberPalindrome rn= new ReverseANumberPalindrome();
		int result=rn.reverse_a_number(no);
		 System.out.println(result);
			int resultsum=rn.sum_a_number(no);
			 System.out.println(resultsum);
			 //palindrome
			 if(no==result) {
				 System.out.println("NUm is palindrome");
				 
			 }else {
				 System.out.println("NUm is  not palindrome");
			 }
	}

	
	private int reverse_a_number(int no) {
	   
	     
	    int reverse = 0; 
	    while(no>0)
	    {
	      int rem = no%10; //2  
	      reverse = (reverse*10) + rem; //4
	      no = no/10; //2
	    }
	   
	    return reverse;
	    
	  }
	
	private int sum_a_number(int no) {
		   
	     
	    int sum = 0; 
	    while(no>0)
	    {
	      int rem = no%10; //2
	      sum = sum + rem; //4
	      no = no/10; //2
	    }
	   
	    return sum;
	    
	  }



}
