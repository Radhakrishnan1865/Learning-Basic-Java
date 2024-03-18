package loopingStatements;

public class ForLoop {

	public static void main(String[] args) {
		/* syntax of for loop
		 *  for(initialisation; condition; increment/decrement){
		 *  statement
		 *  }
		 */
		
		// Example 01
		// print number from 1 to 10
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
		}
		
		System.out.println("---------------------------------");
		
		// Example 02
		//count number of even number from 1 to 20
		
		int count=0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("--------------------");
		
		// Example 03
		// print sum of 1 to 20
		
		int sum=0;
		for(int i=1; i<=20; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
