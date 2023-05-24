class School
{
	//fields/global variables initialised with dafult value by JVM

	private int salary;
boolean b; 
char c; 
byte by; 
short s; 
long l; 
float f; 
double d; 
String st;

public static void main(String[] args)
{


// School teacher = new School(); 
// teacher.teach();


School teacher = new School(); 
teacher.salary = 20000; 

School physics_teacher = new School(); 
physics_teacher.salary = 25000;



System.out.println("int "+teacher.salary);
System.out.println("boolean "+ teacher.b);
System.out.println("char "+teacher.c);
System.out.println("byte "+teacher.by);
System.out.println("short "+teacher.s);
System.out.println("long "+teacher.l);
System.out.println("float "+teacher.f);
System.out.println("double "+teacher.d);
System.out.println("String "+teacher.st);


System.out.println(teacher.salary);
teacher.recruit();

}

void teach(){

System.out.println("Teaching ");
}

private void recruit(){
System.out.println("recruiting ");

}

}
