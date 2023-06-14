package vijayasanthi.learning.basics;

import java.util.Scanner;

public class getCharacter {

	public static void main(String[] args) {
		getCharacter gc =new getCharacter();
		gc.getChar();

	}

	private void getChar() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character ");
		String mychar=sc.next();
	char a=mychar.charAt(0);
	
		System.out.println(a);
		int d=a;
		System.out.println(d);
		sc.close();
	}


}
