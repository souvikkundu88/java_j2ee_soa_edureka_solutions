/*
		 *1. Write a program to accept 5 employee IDs and the corresponding names and their salaries
          from the user and store them in three arrays. Pass these arrays to a function display() as
          arguments.
          
          Display in this following format
          *************************************************
          ID				Name				Salary
          *************************************************
          00				Sk					10000
          01				Rk					15000
          02				Yk					20000
          04				Ik					30000
          05				Ak					40000
          *************************************************
*/
package java_module2_assignment_solution;

import java.util.Scanner;

public class questionOneSolution {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// declaring arrays
		int[] employeeIDs = new int[5];
		String[] employeeNames = new String[5];
		int[] employeeSalaries = new int[5];
		employeeInformation(employeeIDs, employeeNames, employeeSalaries);
		displaySalaryChart(employeeIDs, employeeNames, employeeSalaries);
	}
	// accept employee information from the user
	static void employeeInformation(int[] employeeIDs, String[] employeeNames, int[] employeeSalaries) {
		int i;
		for(i=0; i<5; i++) {
			
			// input ID
			System.out.println("Enter Employee ID: ");
			employeeIDs[i] = sc.nextInt();
			
			// input name
			System.out.println("Enter Employee Name: ");
			employeeNames[i] = sc.nextLine();
			sc.nextLine();
			
			// input salary
			System.out.println("Enter EmployeeSalary: ");
			employeeSalaries[i] = sc.nextInt();
			sc.nextLine();
			
	 }
	 
	sc.close();
}
	
	// pass the arrays to a display function
	static void displaySalaryChart(int[] employeeIDs, String[] employeeNames, int[] employeeSalaries) {
		System.out.println("*************************************************");
		System.out.println("ID \t\t\t\t Name \t\t\t\t Salary");
		System.out.println("*************************************************");
		int j;
		for(j=0; j < 5; j++) {
			System.out.println(employeeIDs[j] + "\t\t\t\t" + employeeNames[j] + "\t\t\t\t" + employeeSalaries[j]);
		}
		System.out.println("*************************************************");
	}
	
}