package conditionalStatement;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		// Given age is eligible for vote or not
		
		//Example 01
		int age=17;
		
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
		
		//Example 02
		int a=128;
		
		if(a%2==0) {
			System.out.println("Given number is even number");
		}
		else {
			System.out.println("Given number is odd number");
		}
		
		//Example 03
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int x =scanner.nextInt();
		*/
		int x=28;
		
		if(x>=18) {
			System.out.println("You are eligible for vote");
		}
		else {
			System.out.println("You are not eligible for vote");
		}
		
		//Example 04

	}

}
