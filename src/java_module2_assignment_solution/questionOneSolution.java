/*
		 *1. Write a program to accept 5 employee IDs and the corresponding names and their salaries
          from the user and store them in three arrays. Pass these arrays to a function display() as
          arguments.
          
          Disply in this following format
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
		String[] employeeNames = new String[5];
		int[] employeeIDs = new int[5];
		int[] employeeSalaries = new int[5];
		employeeInformation(employeeIDs, employeeNames, employeeSalaries);
	}
	// accept employee information from the user
	static void employeeInformation(int[] employeeIDs, String[] employeeNames, int[] employeeSalaries) {
		int i;
		for(i=0; i<5; i++)
			System.out.println("Enter Employee ID: ");
			employeeIDs[i] = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			employeeNames[i] = sc.nextLine();
			System.out.println("Enter EmployeeSalary: ");
			employeeSalaries[i] = sc.next
	}

}
