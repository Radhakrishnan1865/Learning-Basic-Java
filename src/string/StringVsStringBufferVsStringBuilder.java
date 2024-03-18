package string;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		// String - immutable - we cannot change original value
		
		String s= new String("WELCOME");
		s.concat(" TO JAVA");
		System.out.println(s); // after  concatenating - WELCOME
		
		// StringBuffer - mutable - we can change original value
		
		StringBuffer s1= new StringBuffer("WELCOME");
		s1.append(" TO JAVA"); // this is another concatenating method
		System.out.println(s1); // after concatenating - WELCOME TO JAVA
		
		// StringBuilder - mutable - we can change original value
		
		StringBuilder s2= new StringBuilder("WELCOME");
		s2.append(" TO JAVA");
		System.out.println(s2);// after concatenating - WELCOME TO JAVA

	}

}
