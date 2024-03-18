package loopingStatements;

public class WhileLoop {

	public static void main(String[] args) {
		/* syntax of while loop
		 * 
		 * its a entry control loop
		 * initialisation
		 * while(condition)
		 * {
		 * statement
		 * increment/decrement
		 * }
		 */
		// Example 01
		
		// print even number using while loop
		
		int a=1;
		
		while(a<=20) // while loop how many times repeating 
		{
			if(a%2==0)
			System.out.println(a);
			++a;
			
		}
		
		// Example 02
		// print a number is odd or even
		
		int x=1;
		
		while(x<=40) {
			
			if(x%2==0) {
				System.out.println(x + " is a even number");
			}
			else {
				System.out.println(x + " is a odd number");
			}
			++x;
			
		}
		
		// Example 03
		// print descending order from 10 to 1
		
		int i=10;
		while(i>0) {
			System.out.println(i);
			i--;
		}

	}

}
