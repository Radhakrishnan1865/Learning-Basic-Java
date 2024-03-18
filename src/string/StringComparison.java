package string;

public class StringComparison {

	public static void main(String[] args) {
		
		//  case 01
		
		String s1= "WELCOME";
		String s2= "WELCOME";
		
		System.out.println(s1==s2); // true
		System.out.println(s1.equals(s2)); // true
		
		// case 02 - using new keyword
		
		String s3= new String("WELCOME");
		String s4= new String("WELCOME");
		
		System.out.println(s3==s4); // false - to compare the objects
		System.out.println(s3.equals(s4)); // true - to compare the value of the objects
		
		// case 03
		
		String s= "WELCOME";
		String s0= new String("WELCOME");
		
		System.out.println(s==s0); // false -  to compare the objects
		System.out.println(s.equals(s0)); // true - to compare the value of the objects
		
		// case 04
		
		String s5= "WELCOME";
		String s6= new String("WELCOME");
		String s7=s6;
		
		System.out.println(s5==s6); // false
		System.out.println(s5.equals(s6)); // true
		
		System.out.println(s6==s7); // true - because objects are same/equal
		System.out.println(s6.equals(s7)); // true 
		
		System.out.println(s5==s7); // false
		System.out.println(s5.equals(s7)); // true
		

	}

}
