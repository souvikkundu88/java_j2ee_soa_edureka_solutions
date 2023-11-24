package java_module3_practice;
import java.util.Scanner;

class Car { // create parent class or base class Car
	void display() {
		System.out.println("Parent class / Base class = Car");
	}
}	

class Mercedes extends Car { // creating child class or subclass from parent / base class Car
	@Override
	void display() {
		System.out.println("Mercedes");
	}
}

class BMW extends Car { // creating child class / subclass from parent / base class Car
	@Override
	void display() {
		System.out.println("BMW");
	}
}

class PolymorphismExample {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter car name: ");
		String carType = userInput.next();
		Car car;
		if(carType.equalsIgnoreCase("Mercedes")) {
			car = new Mercedes();
		} else if(carType.equalsIgnoreCase("BMW")) {
			car = new BMW();
		} else {
			car = new Car();
		}
		
		car.display();
		userInput.close();
	}
	
}
