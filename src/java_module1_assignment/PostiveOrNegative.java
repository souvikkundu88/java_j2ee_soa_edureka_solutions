package java_module1_assignment;

import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check if the number is positive or negative
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Enter a number to check if it's zero or positive or negative: ");
		float userInput = scanUser.nextFloat();
		if(userInput > 0) {
			System.out.println(userInput + " is a positive number");
		} else if(userInput < 0) {
			System.out.println(userInput + " is a negative number");
		} else {
			System.out.println("not positive, not negative");
		}
		scanUser.close();
	}

}
