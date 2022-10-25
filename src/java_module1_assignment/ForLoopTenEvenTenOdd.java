package java_module1_assignment;
import java.util.Scanner;

public class ForLoopTenEvenTenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to print 10 even numbers and 10 odd numbers using For Loop
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Enter a number");
		int userInput = scanUser.nextInt();
		for(int i = 1; i < userInput; i++) {
			if(i%2 == 0) {
				System.out.println(i + " is even number");
			} else {
				System.out.println(i + " is odd number");
			}
			scanUser.close();
		}
	}
}
