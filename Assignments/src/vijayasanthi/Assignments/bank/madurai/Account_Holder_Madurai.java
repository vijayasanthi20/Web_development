package vijayasanthi.Assignments.bank.madurai;

import vijayasanthi.Assignments.bank.chennai.SBI;

public class Account_Holder_Madurai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//errors when methods are deafult
		
	//	the method create_account() from the type SBI is not visible
		SBI account_holder_madurai=new SBI();
		account_holder_madurai.create_account();
		account_holder_madurai.get_loan(10000);
		account_holder_madurai.empId=100;
		account_holder_madurai.empName="Deepan";
		
		System.out.println(account_holder_madurai.empId);
		System.out.println(account_holder_madurai.empName);
		System.out.println(SBI.branch_name);
		
	}

}
