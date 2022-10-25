package java_module1_assignment;
import java.util.Scanner;

public class DoWhileLoopFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find factorial of a number using Do While Loop
		Scanner userScan = new Scanner(System.in);
		System.out.println("Enter the number 1 to get 10 even & odd numbers: ");
		int userInput = userScan.nextInt();
		int i = 1;
		long facto = 1;
		do {
			facto = facto*i;
			i++;
		} while (i <= userInput);
		System.out.println("Factorial of " + userInput + " is " + facto);
		userScan.close();
	}
}
