package java_module1_assignment;
import java.util.Scanner;

public class ForLoopAddDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add digits of a number using For Loop
		long n, sum;
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = scanUser.nextLong();
		for (sum = 0; n != 0; n /= 10) {
			sum += n % 10;
		}
		System.out.println("Sum of digits " + sum);
		scanUser.close();
	}
}
