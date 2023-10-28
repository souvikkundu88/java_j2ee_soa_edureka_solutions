package practice_java;
import java.util.Scanner;

public class sumOfDigits {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        System.out.println("Enter a number with at most 4 digits: ");
        number = myObj.nextInt(); // Taking input in variable number
        if (number < 0 || number > 9999) {
            System.out.print("Number out of range\n");
        } else {
            while (number > 0 && number < 9999) {
            sum += number % 10;
            number = number / 10;
          }
          System.out.println("Sum of digits is: " + sum);
        }
        myObj.close();
	}
}
