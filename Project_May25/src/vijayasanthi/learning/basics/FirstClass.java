/**
 * 
 */
package vijayasanthi.learning.basics;

/**
 * @author viji
 *
 */
public class FirstClass {
	

public static void main(String[] args) {
	FirstClass fc=new  FirstClass();
	fc.buy();
	
}
// non static method will be accessed via instances variable 
private void buy() {
	
	System.out.println("Hi");
	
}

}
