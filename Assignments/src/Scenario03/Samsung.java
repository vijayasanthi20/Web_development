package Scenario03;

public class Samsung extends FactoryDemo {
	
//	3) Create class called ‘Samsung’ with main method as sub class of FactoryDemo.
//	– Add unimplemented methods
//	– Add static variable int price and set value as 5000.
//	– Create instance for Samsung class called sam
//	– Access browse() method using sam instance.
//	– Access price variable using sam instance.
//	– Observe which method is called and note down.
	
	static int price =5000;

	public static void main(String[] args) {
		
		Samsung sam=new Samsung();
		sam.browse();
		System.out.println(Samsung.price);
		

	}

@Override
void verifyFingerPrint() {
	// TODO Auto-generated method stub
	
}

@Override
void providePattern() {
	// TODO Auto-generated method stub
	
}

@Override
int call(int seconds) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
void sendMessage() {
	// TODO Auto-generated method stub
	
}

@Override
void receiveCall() {
	// TODO Auto-generated method stub
	
}

//observation

//all parent method is getting called,and methods getting implemented
// ex. browse() from FactoryDemo, verifyFingerPrint, providePattern abstracts from parent class

}
