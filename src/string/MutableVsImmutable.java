package string;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// Mutable - Can we are able to change original value ( string builder and string buffer are mutable)
		
		int a[]= {20,30,10,80,50};
		System.out.println(Arrays.toString(a)); // this method used for print a array variable
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// Immutable - we cannot change original value without storing another variable ( Strings are immutable )
		
		String s= new String ("WELCOME");
		System.out.println(s);
		String s1=s.concat(" TO JAVA"); // store another variable
		System.out.println(s1);
		

	}

}
