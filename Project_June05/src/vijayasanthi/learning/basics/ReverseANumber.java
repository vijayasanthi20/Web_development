package vijayasanthi.learning.basics;

public class ReverseANumber {

	public static void main(String[] args) {
		
		ReverseANumber rn= new ReverseANumber();
		rn.reverse_a_number(103);
	}

	
	private void reverse_a_number(int no) {
	    // TODO Auto-generated method stub
	     
	    int reverse = 0; 
	    while(no>0)
	    {
	      int rem = no%10; //2
	      reverse = (reverse*10) + rem; //4
	      no = no/10; //2
	    }
	    System.out.println(reverse);
	    
	  }


}
