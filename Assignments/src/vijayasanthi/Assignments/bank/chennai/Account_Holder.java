package vijayasanthi.Assignments.bank.chennai;

public class Account_Holder {

	public static void main(String[] args) {
		
		SBI account_holder=new SBI();
		account_holder.create_account();
		account_holder.get_loan(10000);
		account_holder.empId=100;
		account_holder.empName="Deepan";
		
		System.out.println(account_holder.empId);
		System.out.println(account_holder.empName);
		System.out.println(SBI.branch_name);
		

	}

}
