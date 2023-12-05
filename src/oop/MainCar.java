package oop;

class BaseCar {
	// instance variables
	private int model;
	private String manufacturer;
	
	// default constructor of BaseCar
	public BaseCar(int model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}
	
	// print car model and manufacturer
	public void printDetails() {
		System.out.println("Model of " + getClass().getSimpleName() + " is " + model); // print model
		System.out.println("Manufacturer of " + getClass().getSimpleName() + " is " + manufacturer); // print manufacturer
	}
}

// interface for type of sedan
interface IsSedan {
	int bootSpace = 456;
	void bootSpace(); 
}

// child class / sub-class extends & implements
class Elantra extends BaseCar implements IsSedan {
	private String variant;
	
	public Elantra (int model, String variant) {
		super(model, "Hyundai");
		this.variant = variant;
	}
	
	@Override
	public void bootSpace() {
		System.out.println("bootspace of Elantra: " + IsSedan.bootSpace + " liters");
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("The variant of Elantra is " + variant);
	}
}

// main class of the car
public class MainCar {

	public static void main(String[] args) {
		Elantra sport = new Elantra(2019, "Sport");
		Elantra eco = new Elantra(2018, "Eco");
		
		sport.printDetails();
		sport.bootSpace();
		System.out.println("");
		eco.printDetails();
	}
}
