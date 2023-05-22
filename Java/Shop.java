class Shop{

	static String shopName="DeepViji";
	int price;
	int discount;

public static void main(String[] args)
{

Shop prod1=new Shop();
Shop prod2=new Shop();
Shop prod3=new Shop();



prod1.price = 100; 
prod1.discount = 20; 
prod2.price = 200; 
prod2.discount = 10;
//prod2.sell();

int actual_price = prod2.sell(); //Method Calling Statement
System.out.println("Actual price is "+ actual_price);

prod2.bill();
prod1.sell();
Shop.clean();


}

int sell(){

//System.out.println(this.price);
//System.out.println(this.discount);

int discount=30;
// System.out.println(price);// getting output
// System.out.println(discount);
// System.out.println(this.discount);
System.out.println(this.price-this.discount);

return this.price-this.discount;



}

static void clean()
{
System.out.println("cleaning");
//System.out.println(this.discount);
}

void bill(){


}

}
