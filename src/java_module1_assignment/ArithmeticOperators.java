package java_module1_assignment;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write program to perform all the arithmetic operations
		int a = 100, b = 80;
		int sum = a + b;
		System.out.println("The sum of a & b is " + sum);
		a = 100;
		b = 80;
		float quotient = a / b;
		System.out.println("The quotient of a & b is " + quotient);
		a = 100;
		b = 80;
		int remainder = a % b;
		System.out.println("The remainder of a & b is " + remainder);
		a = 100;
		b = 80;
		int multiply = a * b;
		System.out.println("The multiplication of a & b is " + multiply);
		a = 100;
		System.out.println("value of a before post-increment " + a);
		a++;
		System.out.println("The value of a after post-increment is " + a++);
		b = 80;
		System.out.println("value of b before post-increment " + b);
		b--;
		System.out.println("The value of b after post-decrement is " + b);
		a = 100;
		int PreIncrement = ++a;
		System.out.println("The pre-increment of a is " + PreIncrement);
		b = 80;
		int PreDecrement = --b;
		System.out.println("The pre-decrement of b is " + PreDecrement);
	}
}
