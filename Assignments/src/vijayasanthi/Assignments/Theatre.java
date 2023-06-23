package vijayasanthi.Assignments;
public class Theatre {

	public static void main(String[] args) {
		
		
		Theatre raja = new Theatre();
		
		int balance=raja.bookTicket(200);
		System.out.println("After booking ticket " + balance);

	}

	private int bookTicket(int amount) {
		
		int ticket_price=120;
		
		int remaining_amount=(amount-ticket_price);
		
		return remaining_amount;
	}

}
