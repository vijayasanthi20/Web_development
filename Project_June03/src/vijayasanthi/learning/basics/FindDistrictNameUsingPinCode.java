package vijayasanthi.learning.basics;

public class FindDistrictNameUsingPinCode {

	public static void main(String[] args) {
		
		
	FindDistrictNameUsingPinCode pincode= new FindDistrictNameUsingPinCode();
	pincode.findDistrict(605107);

	}

	private void findDistrict(int pincode) {
		// 605 ---pondicherry
		
		int div = 1000;
		while(div>=1000)
		{
			int code=pincode/div;
	System.out.println( "District of   "+code+" is "+"pducherry");  // ==> 1
	if(code==605) {
		
		System.out.println(code+ " ");  // ==>
	}
	pincode = pincode%div; //no = 234
		div = div/10; 
		}
		
	}

}
