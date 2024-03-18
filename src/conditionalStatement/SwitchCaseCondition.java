package conditionalStatement;

import java.util.Scanner;

public class SwitchCaseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a week number");
		int number=scanner.nextInt();
		
		switch(number){
		case 1 : System.out.println("sunday"); break;
		case 2 : System.out.println("monday"); break;
		case 3 : System.out.println("tuesday"); break;
		case 4 : System.out.println("wendesday"); break;
		case 5 : System.out.println("thursday"); break;
		case 6 : System.out.println("friday"); break;
		case 7 : System.out.println("saturday"); break;
		default : System.out.println("its not a week day");
		}
		
		

	}

}
