package java_module1_assignment;
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check given number is even or odd
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Please enter a number to check whether it's odd or even: ");
		int userInput = scanUser.nextInt();
		if(userInput%2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}
		scanUser.close();
	}

}
