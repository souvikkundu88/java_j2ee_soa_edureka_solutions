package java_module1_assignment;

import java.util.Scanner;

public class DoWhileLoopTenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to generate 10 Fibonacci numbers using Do While Loop
		Scanner userScan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int userInput = userScan.nextInt();
		int t1 = 0;
		int t2 = 1;
		int i = 1;
		do {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			i++;
		} while (i <= userInput);
		  userScan.close();
	}
}
