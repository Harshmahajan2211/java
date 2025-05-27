package problem_4;

public class SavingsAccount extends Account{
	double interestrate;
	
	
    public SavingsAccount(String accountnumber, String accountholdername, double balance, double interestRate) {
        super(accountnumber, accountholdername, balance);
        this.interestrate = interestrate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestrate / 100;
        System.out.println("Interest earned: " + interest);
        deposit(interest); // Add interest to the balance
    }

    // Override withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrew: " + amount);
            // Set the new balance after withdrawal
            setBalance(newBalance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestrate;
    }

    // Setter method for balance (since balance is private in the base class)
    private void setBalance(double balance) {
        // You can implement any additional logic here (e.g., validation)
        super.deposit(balance - getBalance()); // Directly update balance using deposit method
    }
}
