package vijayasanthi.Assignments;

public class Branch extends Branch_Plan{
	
	public static void main(String[] args) {
		Branch branch=new Branch();
		branch.check_accounts(1000);
		int tax=branch.pay_tax(2000);
		System.out.println("tax paid "+tax);
		branch.do_interview();
		}

	@Override
	public void receive_Customers() {
		System.out.println("receive_Customers");
		
	}

//	@Override
//	public void receive_Customers() {
//		
//		System.out.println("receive_Customers");
//		
//	}

	

}
