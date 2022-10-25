package java_module1_assignment;
import java.util.Scanner;

public class WhileLoopTenEvenTenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to print 10 even numbers and 10 odd numbers using While Loop
		Scanner userScan = new Scanner(System.in);
		System.out.println("Enter the number Twenty to get 10 even & odd numbers: ");
		int userInput = userScan.nextInt();
		while(userInput > 0) {
			if(userInput%2 == 0) {
				System.out.println(userInput + " is even number");
				userInput--;
			} else {
				System.out.println(userInput + " is odd number");
				userInput--;
			}
			userScan.close();
		}
	}
}
