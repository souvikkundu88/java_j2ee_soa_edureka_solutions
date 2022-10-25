package java_module1_assignment;
import java.util.Scanner;

public class PositiveOrZeroOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check whether the given number is positive, zero or negative
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Enter a number to check if it's zero or positive or negative: ");
		int userInput = scanUser.nextInt();
		if(userInput > 0) {
			System.out.println(userInput + " is a positive number");
		} else if(userInput < 0){
			System.out.println(userInput + " is a negative number");
		} else {
			System.out.println("num is 0");
		}
		scanUser.close();
	}
}
