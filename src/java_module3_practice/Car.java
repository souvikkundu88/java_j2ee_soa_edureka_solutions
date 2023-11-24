package java_module3_practice;
import java.util.Scanner;

class Car {
	/*
	public Car() {
		System.out.println("base class");
	}
	*/
	void display() {
		System.out.println("generic cars");
	}
}

class Mercedes extends Car {
	@Override
	void display() {
		System.out.println("This is a Mercedes car.");
	}
}

class BMW extends Car {
	@Override
	void display() {
		System.out.println("This is a BMW car");
	}
}

class PolymorphismExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of car:");
		String carType = scanner.next();
		Car car; // reference of base class
		if (carType.equalsIgnoreCase("Merc")) {
            car = new Mercedes(); // Creating object of Mercedes
        } else if (carType.equalsIgnoreCase("Bmw")) {
            car = new BMW(); // Creating object of BMW
        } else {
            car = new Car(); // Default Car object
        }

        car.display(); // Calls the display() method based on the object created (runtime polymorphism)
    }
}