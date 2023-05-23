class Shopping
{

public static void main(String[] args)
{
int amount = 1000; 
Shopping myself = new Shopping(); 
myself.purchase(amount);


}

void purchase(int cash){

System.out.println("came to shopping with amount::"+cash);
}

}