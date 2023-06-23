package vijayasanthi.learning.basics;

public class School {
	
	static String schooname="KKGHS";
	String name;

	int rollNo;

	public School(String name, int rollNum) {
//	initialise the object specific variables;	
		this.name=name;
		this.rollNo=rollNum;
		System.out.println(" how are you ");
		
		
	}

	public School(String fname, String lname, int rollNo) {
		this.name=fname+" "+lname;
	
		this.rollNo=rollNo;
		System.out.println(" how are you ");
	}

	public School() {
		System.out.println(" No arg/ zero args constructor ");
	}

	public static void main(String[] args) {
		School student1 = new School("Bharani", 100);
		 student1.participate();
	    School student2 = new School("Santhiya", 101);
	    School student3 = new School("viji", 102);
	    School student4 = new School("viji","santhi", 104);
	    School student5 = new School();
	    
//	    System.out.println(student1.name);
//	    System.out.println(student2.name);
//	    System.out.println(student3.name);
	    
	   
	    student3.write_exam();
	    student4.play();
		
		

	}

	private void play() {
		System.out.println(name);
		System.out.println(rollNo);
		
	}

	private void write_exam() {
		System.out.println(name);
		System.out.println(rollNo);
		
	}

	private void participate() {
		System.out.println(name);
		System.out.println(rollNo);
		
		
	}

}
