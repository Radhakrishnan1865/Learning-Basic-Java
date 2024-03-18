package loopingStatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		/* syntax for do while loop
		 * 
		 * its a exit control loop
		 * 
		 * initialisation
		 * do{
		 * statements;
		 * increment/decrement
		 * }
		 * while(condition);
		 */
		// print even number from 1 to 20
		
		int i=1;
		
		do {
			if(i%2==0)
			System.out.println(i);
			i++;
			
		}
		
		while(i<=20);
		
	}
	

}
