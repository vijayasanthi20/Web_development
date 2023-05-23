class Area
{

public static void main(String[] args)
{
Area square = new Area(); 
Area rectangle = new Area(); 

int result=square.calculate(5);
System.out.println(result);

rectangle.calculate(5,6);

}

//method overloading

void calculate(int len, int br)
{
System.out.println(len*br);
}


int calculate(int a)
{
return a*a; 
}

}