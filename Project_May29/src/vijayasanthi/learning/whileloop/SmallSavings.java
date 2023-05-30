package vijayasanthi.learning.whileloop;

public class SmallSavings {
	static int totaldays=10;
	static int pocketMoney=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int day=1;
	
		SmallSavings sm =  new SmallSavings();
		
		
		sm.daughterPlan(pocketMoney,totaldays);

		sm.fatherPlan(day,totaldays);
		sm.fatherPlan1(day,totaldays);
		sm.ministerPlan(day,totaldays);
		
	
	}
	
	private void ministerPlan(int day, int totaldays2) {
		double total=0.0;
		double paddycount =1.0;
	while(day <=10) {
		total=total+paddycount;
		System.out.println("day "+day+" count of paddy "+paddycount);
		paddycount=(paddycount*2);
		
		day=day+1;
		
	}
	System.out.println("total count of paddy is  "+total);
	}

	// using while loop

	private void fatherPlan1(int day, int totaldays2) {
		
			int savings =0;
			while(day <=totaldays2){

				savings=savings+day;
				day=day+1;

				}
			System.out.println("Daughter savings  as per father plan0: "+savings);
			
		
	}
// using for loop
	private void fatherPlan(int day, int days) {
		
		int savings =0;
		for( day=1;day<=days;day++) {

			savings=savings+day;
		
			}
			System.out.println("Daughter savings as per father plan1: "+savings);
		
	}
		
	

	private  void daughterPlan(int pocketMoney, int days) {
		// TODO Auto-generated method stub
		 int day=1;
		int savings =0;
		while(day <=days){

			savings=savings+pocketMoney;
			day=day+1;

			}
		System.out.println("Daughter savings  as per her plan: "+savings);
		
	}

}
