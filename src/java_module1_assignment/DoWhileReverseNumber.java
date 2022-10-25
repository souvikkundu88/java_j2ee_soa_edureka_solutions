package java_module1_assignment;

public class DoWhileReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse a number using Do While Loop
		int num = 1234, reversed = 0;
		do {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		} while (num != 0);
		System.out.println("Reversed Number: " + reversed);
	}
}
