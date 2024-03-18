package operators;

public class SwappingTwoNumbres {

	public static void main(String[] args) {
		// swapping two numbers
		
		int a=12, b=18;
		
		System.out.println("Before swpping");
		System.out.println("a value is : " +a);
		System.out.println(" b value is : " +b);
		
		a=a+b;
		
		b=a-b;
		
		a= a-b;
		
		System.out.println("After swpping");
		System.out.println("a value is : " +a);
		System.out.println(" b value is : " +b);
		

	}

}
