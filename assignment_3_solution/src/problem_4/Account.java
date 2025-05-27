package problem_4;

public class Account{
	String accountnumber;
	String accountholdername;
	double balance;
	
	public Account(String accountnumber, String accountholdername,double balance) {
		this.accountnumber=accountnumber;
		this.accountholdername=accountholdername;
		this.balance=balance;
		
	}
    public String getAccountNumber() {
        return accountnumber;
    }

    public String getAccountHolderName() {
        return accountholdername;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Account Holder: " + accountholdername);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit funds (common to all accounts)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Abstract method to withdraw funds (to be implemented by subclasses)
    public void withdraw(double amount) {
    	
    }
}


