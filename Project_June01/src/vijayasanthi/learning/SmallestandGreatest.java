package vijayasanthi.learning;

public class SmallestandGreatest {
	
	public static void main(String[]args) {
		SmallestandGreatest sg= new SmallestandGreatest();
	
	sg.findsmallestandgreatest(100);
	}

	private void findsmallestandgreatest(int i) {
		
		int div=2;
		int smallest=-1;
		int greatest=-1;
		boolean smallestFound=false;
		
		while(div<=i/2) {
			
			if(i%div==0) {
				System.out.println("divisors are "+div);
			if(smallestFound==false) {
				
				System.out.println("smallest no is "+div);
				smallest=div;
				smallestFound=true;
				
			}
		
		
			}
			
			greatest=div;
			div=div+1;	
		}
	
		
		System.out.println("greatest no is "+greatest);
		
	}

}
