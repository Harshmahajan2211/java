package problem_4;

public class Account_main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("SA123", "John Doe", 1000, 5);
        System.out.println("Savings Account Details:");
        savings.displayAccountDetails();
        savings.deposit(500);
        savings.withdraw(200);
        savings.calculateInterest();
        savings.displayAccountDetails();

        System.out.println("\n--------------------------\n");

        // Create a CurrentAccount object
        CurrentAccount current = new CurrentAccount("CA123", "Jane Smith", 500, 200);
        System.out.println("Current Account Details:");
        current.displayAccountDetails();
        current.deposit(300);
        current.withdraw(600);  // Withdraw within overdraft limit
        current.manageFunds(1000, 700); // Deposit and withdraw in one operation
        current.displayAccountDetails();
    }

}
