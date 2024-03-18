package operators;

public class DecrementalOperators {

	public static void main(String[] args) {
		// decrement operators --
		
		int a=20;
		int b=10;
		
		int a1= a--;// a1 value is 20 because condition is post decrement operation
		int b1= --b;// b1 value is 19 because condition is pre decrement operation
		
		
		System.out.println(a);//19
		System.out.println(a1);//20
		System.out.println(b);//9
		System.out.println(b1);//9
		

	}

}
