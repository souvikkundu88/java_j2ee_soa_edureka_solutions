package java_module3_assignment_solution;
import java.util.Scanner;

abstract class Account {
	// common properties
	protected int accountNumber;
	protected String name;
	protected double amount;
	
	// parameterized constructor
	public Account(int accountNumber, String name, double amount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
	}
	
	// abstract methods for deposit and withdraw
	public abstract void deposit(double depositAmount);
	public abstract void withdraw(double withdrawAmount);
}

/*********************/

class SBAccount extends Account { // subclass - child class - savings bank account extends parent class Account
	private final double interestRate = 0.04;
	private final double minimumBalance = 1000; // define minimum balance for savings account
	
	// constructor
	public SBAccount(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);
	}
	
	@Override
	// deposit
	public void deposit(double depositAmount) {
		amount += depositAmount;
		System.out.println("Amount deposited successfully. Current balance: " + amount);
	}
	
	@Override
	// withdraw
	public void withdraw(double withdrawAmount) {
		if((amount - withdrawAmount) <= minimumBalance) {
			amount -= withdrawAmount;
			System.out.println("Amount withdrawn successfully. Current balance: " + amount);
		} else {
			System.out.println("Insufficient balance, withdrawl not possible.");
		}
	}
}

class CurrentAccount extends Account { // subclass - child class Current Acount extends parent class Account
	private final double minimumBalance = 5000;
	
	// constructor
	public CurrentAccount(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);
	}
	
	@Override
	// deposit
	public void deposit(double depositAmount) {
		amount += depositAmount;
	}
	
	@Override
	// withdraw
	public void withdraw(double withdrawAmount) {
		if((amount - withdrawAmount) <= minimumBalance) {
			amount -= withdrawAmount;
			System.out.println("Witdrawl was successful. Current balance: " + amount);
		} else {
			System.out.println("Insufficient balance. Withdrawl not possible.");
		}
	}
}

// main
public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Type (1 for Savings Account, 2 for Current Account): ");
		int accountType = scanner.nextInt();
		
		if(accountType == 1) {
			System.out.println("Enter account number, name, and initial amount for savings account: ");
			int accountNumber = scanner.nextInt();
			String name = scanner.next();
			double amount = scanner.nextDouble();
			
			Account sbAccount = new SBAccount(accountNumber, name, amount);
			sbAccount.deposit(2000);
			sbAccount.withdraw(100);
			
		} else if(accountType == 2) {
			System.out.println("Enter account number, name, and initial amount for savings account: ");
			int accountNumber = scanner.nextInt();
			String name = scanner.next();
			double amount = scanner.nextDouble();
			
			Account currentAccount = new CurrentAccount(accountNumber, name, amount);
			currentAccount.deposit(6000);
			currentAccount.withdraw(200);
		} else {
			System.out.println("Invalid account type");
		}
		scanner.close();
	}
}