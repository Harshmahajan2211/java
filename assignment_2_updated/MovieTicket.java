package assignment_2_updated;

public class MovieTicket {
    String movieName;
    String viewerName;
    int numTickets;
    double pricePerTicket;

    // Constructor
    public MovieTicket(String movieName, String viewerName, int numTickets, double pricePerTicket) {
        this.movieName = movieName;
        this.viewerName = viewerName;
        this.numTickets = numTickets;
        this.pricePerTicket = pricePerTicket;
    }

    // Method to display ticket details
    public void printTicket() {
        System.out.println("----- Movie Ticket -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Viewer Name: " + viewerName);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("Price per Ticket: $" + pricePerTicket);
    }

    // Method to calculate total amount
    public double totalAmount() {
        return numTickets * pricePerTicket;
    }

}
