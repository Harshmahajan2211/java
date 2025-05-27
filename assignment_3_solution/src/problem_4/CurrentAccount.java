package problem_4;

public class CurrentAccount extends Account{
	double overdraftlimit;

    public CurrentAccount(String accountnumber, String accountholdername, double balance, double overdraftlimit) {
        super(accountnumber, accountholdername, balance);
        this.overdraftlimit = overdraftlimit;
    }

    // Method to withdraw funds with overdraft limit support
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftlimit) >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrew: " + amount);
            // Set the new balance after withdrawal
            setBalance(newBalance);
        } else {
            System.out.println("Insufficient funds or overdraft limit exceeded.");
        }
    }

    // Method to manage funds (deposit and withdraw from the overdraft limit)
    public void manageFunds(double depositAmount, double withdrawAmount) {
        deposit(depositAmount);  // Deposit the funds
        withdraw(withdrawAmount);  // Withdraw the specified amount
    }

    // Getter method for overdraft limit
    public double getOverdraftLimit() {
        return overdraftlimit;
    }

    // Setter method for balance (since balance is private in the base class)
    private void setBalance(double balance) {
        // You can implement any additional logic here (e.g., validation)
        super.deposit(balance - getBalance()); // Directly update balance using deposit method
    }
}
