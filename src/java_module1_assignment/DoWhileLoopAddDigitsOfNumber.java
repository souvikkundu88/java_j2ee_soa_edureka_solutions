package java_module1_assignment;

import java.util.Scanner;

public class DoWhileLoopAddDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add digits of a number using Do While Loop
		Scanner scanUser = new Scanner(System.in);
        System.out.println("Please enter a number to calculate sum of digits");
        int number = scanUser.nextInt();
        int sum = 0;
        int input = number;
        do {
        	int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        } while (input != 0);
        System.out.printf("Sum of digits of number %d is %d", number, sum);
        scanUser.close();
	}
}
