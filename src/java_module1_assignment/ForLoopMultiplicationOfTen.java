package java_module1_assignment;

import java.util.Scanner;

public class ForLoopMultiplicationOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to generate tables of 10 using For Loop
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Type number 10 to see its multiplication table: ");
		int userInput = scanUser.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d \n", userInput, i, userInput * i);
		}
		scanUser.close();
	}
}
