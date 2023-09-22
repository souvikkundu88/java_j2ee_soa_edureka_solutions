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

public class studentReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name: "); // asking user to input student name
		String studentName = sc.nextLine();
		System.out.println("Enter number of subjects: "); // asking user to input total number of subjects
		int numberOfSubjects = sc.nextInt();
		sc.close();
		int[] marks = new int[numberOfSubjects]; // total number of subjects assigned to array marks
		marksEntry(marks); // method for marksEntry()
		printReportCard(studentName, marks, numberOfSubjects); // method for printReportCard()
	}
	// collected student name, total number of subjects
	// now, I have to collect each marks in each subject and store it in array marks
	
	/* method definition for getting marks from the user and storing it in array marks */
	static void marksEntry(int[] marks) {
		for(int i = 0; i < marks.length; i++) {
			Scanner scMarks = new Scanner(System.in);
			System.out.println("Enter marks for subject- " +(i+1) + ": "); // asking user to enter each marks
			marks[i] = scMarks.nextInt(); // storing each marks in array marks
			scMarks.close();
		}
	}
	// collected each marks in each subject, stored it in array marks
	// now, calculate total marks, average, and print the report card
	
	/* method definition for total, average, and printing report card */
	static void printReportCard(String studentName, int[] marks, int numberOfSubjects) {
		System.out.println("\n-----------------------------------------------------");
		System.out.println("\t\tReport Card");
		System.out.println("Name: " + studentName);
		System.out.println("-------------------------------------------------------");
		System.out.println(" Subjects \t\t Marks");
		int total = 0; // declaring integer variable 'total' to store total marks
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject")
		}
		
	}

}
