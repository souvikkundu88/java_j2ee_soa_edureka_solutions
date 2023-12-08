package java_module3_assignment_solution;
import java.util.Scanner;

abstract class Account {
	// common properties
	protected int accountNumber;
	protected String name;
	protected double amount;
	
	// parameterized constructor
	Account(int accountNumber, String name, double amount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
	}
	
	// abstract methods for deposit and withdraw
	public abstract void deposit(double depositAmount);
	public abstract void withdraw(double withdrawAmount);
}

/*********************/


