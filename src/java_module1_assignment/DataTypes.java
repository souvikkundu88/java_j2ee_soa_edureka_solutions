package java_module1_assignment;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write programs to use all the data types
		byte b = 127; // 1 byte - 128 to 127
		short s = 250; // 2 bytes
		int i = 1000; // 4 bytes of memory
		long l = 23232; // 8 bytes
		
		float price = 34.56566F; // 4 bytes 6-7 decimal digits
		double price_double = 3445.454545; // 8 bytes 15 decimal points
		
		byte b1 = 125; // same local variable cannot be used
		int i2 = 126;
		int i1 = b1; // implicit type casting
		b1 = (byte)i2; // explicit type casting is used when larger data type is converted to smaller data type
		// (byte)i2 explicitly converts int i2 to byte data type
		char strLetter = 'A'; // single letter
		String strWord = "Hello World"; // a word or more than one word
		System.out.println(strWord + " " + strLetter);
		boolean isValid = false; // 1 byte, this is boolean 'true' or 'false' value
	}

}
