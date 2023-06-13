package vijayasanthi.learning.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerDemo sd= new ScannerDemo();
		sd.getnums();
		sd.getNames();
		sd.getName();
		sd.findNum();

	}
	private void findNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me any no. "); 
		int no = sc.nextInt();
		while(no>=1)
		{
			System.out.println(no); 
			no--; 
		}
		
	}
	private void getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me your name "); 
		String name = sc.nextLine(); 
		System.out.println("Welcome to IT World "+ name);
		
	}
	private void getNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me your name "); 
		String name = sc.next(); 
		System.out.println("Welcome to IT World "+ name);
		
	}
	private void getnums() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1. ");
		int no1 = sc.nextInt();
		System.out.println("Enter no2. ");
		int no2 = sc.nextInt(); 
		System.out.println("Result is ");
		System.out.println(no1*no2);
		
	}
	
}
