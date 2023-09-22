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
	Subject					Marks
	Subject-1					xx
	Subject-2					xx
	Subject-3					xx
	Subject-n					xx
	--------------------------------------------
	Total: xx				  	Average: xx
 
*/

package java_module2;

import java.util.Scanner;

public class studentReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String studentName = sc.nextLine();
		System.out.println("Enter number of subjects: ");
		int numberOfSubjects = sc.nextInt();
		int[] marks = new int[numberOfSubjects];
		marksEntry();
		printReportCard();
	}
	
	static void marksEntry(int[] marks) {
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks for subject- " +(i+1) + ": ");
			marks[i] = sc.nextInt();
		}
	}
	
	public static void printReportCard() {
		
	}

}
