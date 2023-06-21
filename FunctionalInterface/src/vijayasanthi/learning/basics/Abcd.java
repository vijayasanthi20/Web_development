package vijayasanthi.learning.basics;

@FunctionalInterface
public interface Abcd {
	
//feature of java 8 static method and  method body is available

		  public static void test()
		  {
		    System.out.println("hi");
		  }
		  /// abstract
		  
		  abstract void display();
		  
		   default void add(int no1, int no2)
		  {
			  System.out.println(no1+no2);
		  }
		  
		  //only one deafult method will be there
//		  public default void subract(int no1, int no2)
//		  {
//			  System.out.println(no1-no2);
//		  }
		
		

}
