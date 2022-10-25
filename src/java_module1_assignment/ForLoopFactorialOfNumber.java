package java_module1_assignment;
import java.util.Scanner;

public class ForLoopFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find factorial of a number using For Loop
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Type a number here to find out its factorial value");
		int userInput = scanUser.nextInt();
		long facto = 1;
		for(int i = userInput; i > 0; i--) {
			facto = facto * i;
		}
		System.out.println("Factorial of " + userInput + " is " + facto);
		scanUser.close();
	}
}
