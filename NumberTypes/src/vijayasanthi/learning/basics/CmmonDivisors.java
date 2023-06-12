package vijayasanthi.learning.basics;

public class CmmonDivisors {

	public static void main(String[] args) {
		
		CmmonDivisors cd=new CmmonDivisors();
		cd.find_common_divisors(100,1000);
		
	}

	private void find_common_divisors(int no1, int no2) {

		int div=2;
		
//		int small=0;
//		if(no1>no2) {
//			small=no2;
//		}else {
//			
//			small=no1;
//		}
		//the above code can be replaced with ternary opertaor
		int small=(no1<no2)?no1:no2;
		
		while(div<=small) {
	//	while(div<=no1 && div<=no2) {
			
			if(no1%div==0 && no2%div==0) {
				
				int commonDiv=div;
				System.out.println(commonDiv);
			}
			div=div+1;
		}
	}

}
