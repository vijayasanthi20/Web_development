package vijayasanthi.learning.ifloops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int month = 5; 
//		while(month==5)
//		{
//			System.out.println("Play");
//		}
		
		
		int day=1;
		int month=5;
		while(month==5) {
		System.out.println("play ::"+day);
		 day=day+1;

		if (day>31){
		month=month+1;
		}
		}
	}

}
