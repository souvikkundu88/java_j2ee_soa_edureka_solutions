/*
Report Card (Java language)
main()
Scanner
  	input name from user
  	input number of subjects from user
marksEntry()
	enter marks obtained in each subject
printReportCard()
	print the report card in this following format
	-------------------------------------------
			    Report Card
	Name: xxxxxxx
	--------------------------------------------
	Subjects				   Marks
	Subject-1					xx
	Subject-2					xx
	Subject-3					xx
	Subject-n					xx
	--------------------------------------------
	Total: xx				   Average: xx
 
*/

package java_module2;

import java.util.Scanner;
import java.util.Arrays;

class studentReportCard {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter student name: "); // asking user to input student name
		String studentName = sc.nextLine();
		System.out.println("Enter number of subjects: "); // asking user to input total number of subjects
		int numberOfSubjects = sc.nextInt();
		int[] marks = new int[numberOfSubjects]; // total number of subjects assigned to array marks
		marksEntry(marks); // method for marksEntry()
		printReportCard(studentName, marks, numberOfSubjects); // method for printReportCard()
	}
	// collected student name, total number of subjects
	// now, I have to collect each marks in each subject and store it in array marks
	
	/* method definition for getting marks from the user and storing it in array marks */
	static void marksEntry(int[] marks) { // this method is for asking user input
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks for subject- " +(i+1) + ": "); // asking user to enter each marks
			marks[i] = sc.nextInt(); // storing each marks in array marks
		}
	}
	// collected each marks in each subject, stored it in array marks
	// now, calculate total marks, average, and print the report card
	
	/* method definition for total, average, and printing report card */
	static void printReportCard(String studentName, int[] marks, int numberOfSubjects) { // method: print report card
		System.out.println("\n-----------------------------------------------------");
		System.out.println("\t\tReport Card");
		System.out.println("Name: " + studentName);
		System.out.println("-------------------------------------------------------");
		System.out.println(" Subjects \t\t Marks");
		int total = 0; // declaring integer variable 'total' to store total marks;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject-" + (i+1) + "\t\t" + marks[i]);
			total = total + marks[i]; // calculating total marks
		}
		
		System.out.println("-------------------------------------------------------");
		float avg = ((float) total) / numberOfSubjects; // calculating average marks
		System.out.printf("Total: %d \t Average: %.2f\n", total, avg);
	}

}
