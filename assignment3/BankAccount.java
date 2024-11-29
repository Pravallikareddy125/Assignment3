package assignment3;

public class BankAccount {
	    String accountNumber;
	    String accountHolderName;
	    double balance;

	    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Account Balance: " + balance);
	    }
	}

	class SavingsAccount extends BankAccount {
	    double interestRate;

	    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
	        super(accountNumber, accountHolderName, initialBalance);
	        this.interestRate = interestRate;
	    }

	    public void applyInterest() {
	        double interest = balance * (interestRate / 100);
	        balance += interest;
	        System.out.println("Interest applied: " + interest);
	    }

	    public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount("79595", "pravas", 10500, 4);

	        System.out.println("Initial Account Balance:");
	        savingsAccount.checkBalance();

	        savingsAccount.deposit(6000);
	        savingsAccount.withdraw(4400);

	        System.out.println("\nBalance after transactions:");
	        savingsAccount.checkBalance();

	        savingsAccount.applyInterest();

	        System.out.println("\nBalance after interest:");
	        savingsAccount.checkBalance();
	    }
	}