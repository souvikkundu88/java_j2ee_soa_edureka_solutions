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

class SBAccount extends Account { // subclass - child class - savings bank account
	private final double interestRate = 0.04;
	private final double minimumBalance = 1000; // define min balance for savings account
	
	// constructor
	public SBAccount(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);
	}
	
	@Override
	public void deposit(double depositAmount) {
		amount += depositAmount;
		System.out.println("Amount deposited successfully. Current balance: " + amount);
	}
	
	@Override
	public void withdraw(double withdrawAmount) {
		if((amount - withdrawAmount) <= minimumBalance) {
			amount -= withdrawAmount;
			System.out.println("Amount withdrawn successfully. Current balance: " + amount);
		} else {
			System.out.println("Insufficient balance, withdrawl not possible.");
		}
	}
}


