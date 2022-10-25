package java_module1_assignment;
import java.util.Scanner;

public class ForLoopTenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to generate 10 Fibonacci numbers using For Loop
		Scanner userScan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int userInput = userScan.nextInt();
		int t1 = 0;
		int t2 = 1;
		for (int i = 1; i <= userInput; i++) {
			System.out.print(t1+ " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		userScan.close();
	}
}
