package java_module1_assignment;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to check if a candidate is eligible for voting or not
		Scanner scanUser = new Scanner(System.in);
		System.out.println("What is your age? ");
		int userAgeInput = scanUser.nextInt();
		if(userAgeInput >= 18 && userAgeInput >=60) {
			System.out.println("You are a senior citizen and you are eligible to vote");
		} else if (userAgeInput >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote, you have to wait until 18th birthday");
		}
		scanUser.close();
	}
}
