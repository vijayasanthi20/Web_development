package vijayasanthi.learning.basics;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCM lcm= new LCM();
		lcm.find_lcm(5, 9);
	}
	
	private void find_lcm(int no1,int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2?no1:no2; //why?
		int temp = big; 
		System.out.println(big);
while(true)	// why ?  wheneever we donot know the condition will end
{
	
	System.out.println("big is "+ big);
		if(big%no1 ==0 && big%no2==0)//why?
		{
			System.out.println("LCM is "+ big);
			break;//why?
		}
		big = big + temp; // why?
		System.out.println("big plus temp is "+ big);
	}
		
}

}
