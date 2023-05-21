class Honda
{

//Global varibles

// static variable declaration
static int dealer_id = 1234;  
static String owner_name = "Kumar"; //common across all objects 
	// non static variable declaration
int price;  //non static variables can only be accesses via objects and unique value to each obejcts
int cc; 
float discount; 


public static void main(String[] args)
{


Honda shine     =  new Honda(); //new allocates memory
Honda activa    =  new Honda(); 
Honda unicorn   =  new Honda();


shine.price = 65000; 
activa.price = 80000; 
unicorn.price = 125000;
shine.discount=5.0f;
activa.discount=1.0f;
System.out.println(shine.price);

System.out.println(Honda.owner_name);
System.out.println(unicorn.owner_name);
System.out.println(owner_name);

activa.buy();
shine.buy(150000);
activa.buy(125000);//method calling statement
offer();
Honda.offer();
shine.offer();
activa.offer();


}

void buy(){
System.out.println("Buying Honda bike");

}

//buy- method name
void buy(int amount){//method signature

int disc=5; // method local variable , scope of variable is till where it has scope? from line 52 to 55 it has scope
System.out.println("Buying Honda bike for Rs :"+amount); //method definition 
//System.out.println(amount);

}

static void offer(){ // common for all objects becouse its static

	System.out.println("10% discount");
}


}