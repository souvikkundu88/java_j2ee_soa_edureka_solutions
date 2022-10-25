package java_module1_assignment;

import java.util.Scanner;

public class WhileLoopFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userScan = new Scanner(System.in);
		System.out.println("Enter the number Twenty to get 10 even & odd numbers: ");
		int userInput = userScan.nextInt();
		int i = 1;
		long facto = 1;
		while (i <= userInput) {
			facto *= i;
			i++;
		}
		System.out.println("Factorial of " + userInput + " is " + facto);
		userScan.close();
	}
}
