/*
		 *1. Write a program to accept 5 employee IDs and the corresponding names and their salaries
          from the user and store them in three arrays. Pass these arrays to a function display() as
          arguments.
          
          Display in this following format
          *************************************************
          ID				Name				Salary
          *************************************************
          11				Sk					10000
          22				Rk					15000
          33				Yk					20000
          44				Ik					30000
          55				Ak					40000
          *************************************************
*/
package java_module2_assignment_solution;
import java.util.Scanner;

public class EmployeeRecord {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// declaring arrays
		String searchName = "";
		int[] employeeIDs = new int[5];
		String[] employeeNames = new String[5];
		double[] employeeSalaries = new double[5];
        for(int i=0; i<5; i++) {
			// input ID
			System.out.println("Enter Employee ID: ");
			employeeIDs[i] = sc.nextInt();
			sc.nextLine();
			
			// input name
			System.out.println("Enter Employee Name: ");
			employeeNames[i] = sc.nextLine();
			
			// input salary
			System.out.println("Enter EmployeeSalary: ");
			employeeSalaries[i] = sc.nextDouble();
			sc.nextLine();
        }
            
		display(employeeIDs, employeeNames, employeeSalaries);
		displayEmployeeNameAndID(employeeIDs, employeeNames);
		employeeSearch(searchName, employeeIDs, employeeNames, employeeSalaries);
	}
	
	// pass the arrays to a display employee salary chart
	static void display(int[] employeeIDs, String[] employeeNames, double[] employeeSalaries) {
		System.out.println("*******************************************");
		System.out.println("ID \t\t Name \t\t Salary");
		System.out.println("*******************************************");
		for(int i=0; i<5; i++) {
			System.out.println(employeeIDs[i] + "\t\t" + employeeNames[i] + "\t\t" + employeeSalaries[i]);
		}
		System.out.println("*******************************************");
	}
	
	// pass the arrays to display employee ids and employee names
	static void displayEmployeeNameAndID(int[] employeeIDs, String[] employeeNames) {
		System.out.println("********************************");
		System.out.println("ID \t\t Name");
		System.out.println("********************************");
		for(int i=0; i<5; i++) {
			System.out.println(employeeIDs[i] + "\t\t" + employeeNames[i]);
		}
		System.out.println("********************************");
	}
	
	// search employee name and display his or her name, corresponding ID, and salary
	static void employeeSearch(String searchName, int[] employeeIDs, String[] employeeNames, double[] employeeSalaries) { 
		
		// search employee record
		System.out.println("Search employee name & record: ");
		searchName = sc.nextLine();
		
		System.out.println("*******************************************");
		System.out.println("ID \t\t Name \t\t Salary");
		System.out.println("*******************************************");
		for(int i=0; i < employeeNames.length; i++) {
			if(searchName.equalsIgnoreCase(employeeNames[i])) { // search employee record & only display if it exists
				System.out.println(employeeIDs[i] + "\t\t" + employeeNames[i] + "\t\t" + employeeSalaries[i]);
			} 
		}
		System.out.println("*******************************************");
		sc.close();
   }
}

