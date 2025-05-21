package assignment_2_updated;

public class movie_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieTicket ticket = new MovieTicket("Inception", "John Doe", 3, 12.5);

        // Print ticket
        ticket.printTicket();

        // Show total bill
        double total = ticket.totalAmount();
        System.out.println("Total Amount: $" + total);

	}

}
