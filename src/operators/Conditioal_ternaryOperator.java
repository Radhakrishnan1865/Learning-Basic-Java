package operators;



public class Conditioal_ternaryOperator {

	public static void main(String[] args) {
		// syntax of ternary operator var=exp?result1:result;
		
		
		int a=20, b=40;
		int x;
		x=(a>b)?a:b;
		System.out.println(x);
		
		
		// voting eligible age
		
		int age=28;
		
		 String res=(age>=18)?"Eligible":"Not Eligible";
		 System.out.println(res);

	}

}
