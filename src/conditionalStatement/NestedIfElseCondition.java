package conditionalStatement;

import java.util.Scanner;

public class NestedIfElseCondition {

	public static void main(String[] args) {
		// check given number is positive or negative number
		
		
		//Example 01
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		
		if(number>0) {
			System.out.println("Given number is positive");
		}
		else if(number<0) {
			System.out.println("Given number is negative");
		}
		else {
			System.out.println("Given number is zero");
		}
		
		
		//Example 02
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter a week number");
		int weekno = scanner.nextInt();
		
		if(weekno==1) {
			System.out.println("Sunday");
		}
		else if(weekno==2) {
			System.out.println("Monday");
		}
		else if(weekno==3) {
			System.out.println("Tuesday");
		}
		else if(weekno==4) {
			System.out.println("Wendesday");
		}
		else if(weekno==5) {
			System.out.println("Thursday");
		}
		else if(weekno==6) {
			System.out.println("Friday");
		}
		else if(weekno==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Its not a week day");
		}
		

	}

}
