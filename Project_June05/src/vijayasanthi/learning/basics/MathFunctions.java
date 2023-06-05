package vijayasanthi.learning.basics;

public class MathFunctions {

	public static void main(String[] args) {
		MathFunctions mf=new MathFunctions();
		mf.learn_Math_functions();
		mf.find_sqrt(81);
		mf.learn_Math_functions();
		mf.find_floor(64.5);
		mf.find_ceil(64.3);
		mf.find_max(10,20);
		mf.find_min(10,20);
		mf.find_abs(-10);
		int result=mf.find_power(5,4);
		System.out.println("power of no is :"+result);
		double sign=mf.find_sign(-0);
		System.out.println("signum of no is :"+sign);
		mf.find_roundoff(99.3);
		mf.find_round(99.7);
	}

	private void find_roundoff(double d) {
		// TODO Auto-generated method stub
		
	}

	private void find_round(double d) {
		// TODO Auto-generated method stub
		double d1 = d - (int)d; 
		//System.out.println(d1);
		if(d1<0.5)
		{
			System.out.println("round off "+(int)d);
		}
		else
		{
			System.out.println("round off "+((int)d+1));
		}
	}
	private double find_sign(int no) {
	    // TODO Auto-generated method stub
	    if(no>0)
	      return 1.0;
	    else if(no<0)
	      return -1.0;
	    else
	      return 0.0;
	    
	  }
	
		private int find_power(int a, int b) {
			
			int p=1;
			while(b>0){
				
				p=p*a;
				b=b-1;
			}
		
		return p;
	}


		private void find_abs(int no) {
		
			if(no >0) {
				System.out.println("abs of no is :"+no);
			}else {
				System.out.println("abs of no is :"+no*-1);
			}
		
	}


		private void find_floor(double no) {
		
				// TODO Auto-generated method stub
				System.out.println("no is :"+no);
				int no2 = (int)no; //Type Casting: 
				//Converting from one data
				System.out.println("floor no is :"+no2);
		
	}


		private void find_ceil(double no) {
			// TODO Auto-generated method stub
			System.out.println(no); //64.0
			int no2 = (int)no; //64; 
			if(no2 == no) //no2 = 64, no = 64.0
			{
				System.out.println(no2);
				//System.out.println("Hi");
			}
			else
			{
				System.out.println("round off is "+((double)no2+1));
				//System.out.println("Hello");
			}
			
		
		}
		
		private void find_min(int no1, int no2) {
			// TODO Auto-generated method stub
			if(no1<no2)
				System.out.println(no1);
			else
				System.out.println(no2);
			
		}

		private void find_max(int no1, int no2) {
			// TODO Auto-generated method stub
			if(no1>no2)
				System.out.println(no1);
			else
				System.out.println(no2);
			
		}
	

	private void learn_Math_functions() {
		int no = -125; 
		System.out.println(no);
		no = Math.abs(no);
		System.out.println(no);
		
		double d = 1.23456789;
		d = Math.ceil(d);
		System.out.println(d);
		d = Math.floor(1.23456789);
		System.out.println(d);
		
		d = Math.pow(10, 2); //Method Calling
		System.out.println(Math.pow(10, 2));		
		System.out.println(Math.sqrt(64));
		
	}

	private void find_sqrt(int no) {
		
		int div=2;
		while(div<=no/2) {
		if(no/div==div) {
			
			System.out.println("sqrt of no "+no+ " is "+div);
			break;
		}
		div=div+1;
		}
		
		
	}
}
