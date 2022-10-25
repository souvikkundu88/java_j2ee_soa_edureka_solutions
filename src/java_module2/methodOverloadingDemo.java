package java_module2;

public class methodOverloadingDemo {

	public static void main(String[] args) {
		// method overloading demo program
		int x= 10, y = 20;
		double a = 12.45, b = 10.34;
		int output1 = sum(x, y);
		double output2 = sum(a, b);
		System.out.println(output1);
		System.out.println(output2);
		
	}
	
	static int sum(int s, int t) {
		return s + t;
	}
	
	static double sum(double s, double t) {
		return s + t;
	}

}


