package operators;

public class IncrementalOperators {

	public static void main(String[] args) {
		//  incremental operators ++ 
		
		int a=25;
		int b=15;
		int a1=a++;//a1 value is 25 because first assigned the value a to a1 and after increment the value ( post increment operation)
		int b1=++b;// b1 value is 16 here first increment the value and after the assign the value ( pre increment operation)
		System.out.println(a);// a value is 26
		System.out.println(b);// b value is 16
		
		
		System.out.println(a1);// a1 value is 25 ( post increment )
		System.out.println(b1);// b1 value is 16 ( pre increment )

	}

}
