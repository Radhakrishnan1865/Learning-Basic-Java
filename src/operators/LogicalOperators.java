package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical operators returns boolean values
		//works between two boolean values
		// && || !
		
		
		// condition 01
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		/*
		// condition 02
		
		boolean x=false;
		boolean y=true;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		// condition 03
		
		boolean x=true;
		boolean y=true;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		// condition 04
		
		boolean x=false;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		*/
		
		boolean b1=20<10;// false
		boolean b2=20>10;// true
		
		System.out.println(b1 && b2);//false
		System.out.println(b1 || b2);//true
		System.out.println(!b1);//true
		System.out.println(!b2);//false

	}

}
