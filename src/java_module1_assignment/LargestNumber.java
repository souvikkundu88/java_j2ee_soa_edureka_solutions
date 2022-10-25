package java_module1_assignment;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find largest of two numbers
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Enter a number1: ");
		int userInput1 = scanUser.nextInt();
		System.out.println("Enter a number2: ");
		int userInput2 = scanUser.nextInt();
		if(userInput1 > userInput2) {
			System.out.println("Number1 " + userInput1 + " is larger than userInput2 " + userInput2);
		} else {
			System.out.println("Number2 " + userInput2 + " is larger than userInput1 " + userInput1);
		}
		scanUser.close();
	}
}
