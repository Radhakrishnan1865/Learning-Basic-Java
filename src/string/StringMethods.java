package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		// type of initialisation
		
		String name= "RADHAKRISHNAN"; // using string variables
		String s= new String("RADHAKRISHNAN");// using new keyword and predefined String class
		
		System.out.println(s);
		
		// methods
		// 01 length()
		
		int len=s.length();
		System.out.println(len);
		System.out.println(s.length());// first initialise  the value and directly put in the print statement
		System.out.println("RADHAKRISHNAN".length()); // initialisation and length method directly put in the print statement 
		
		// 02 concat() - joining the multiple strings
		
		String s1= "Welcome ";
		String s2= "to java ";
		String s3= "Automation";
		
		System.out.println(s1+" " +s2+" " + s3); // using addition operator
		String join= s1.concat(s2).concat(s3);
		System.out.println(join); // using concat method
		System.out.println(s1.concat(s2+s3));
		
		System.out.println("welcome " + "to java " +"automation"); // without initialisation
		System.out.println("welcome ".concat("to java "+"automation "));
		
		// 03 trim  - remove spaces right and left side
		
		String str= "  RADHAKRISHNAN  ";
		System.out.println(str);
		System.out.println(" Before trimming ");
		System.out.println(str.length());
		
		System.out.println(str.trim());
		System.out.println(" After trimmed ");
		System.out.println(str.trim().length());
		
		// 04 charAt() - returns a character from a string based on index
		// index starts from- 0
		
		str="RADHAKRISHNAN";
		System.out.println(str.charAt(5));// K
		System.out.println(str.charAt(12));// N
		
		
		// 05 contains() - its mainly used for validation testing
		// contains methods only returns boolean value
		// string values are case sensitivity
		
		System.out.println(str.contains("KRISHNAN"));// true
		System.out.println(str.contains("Radha")); // false
		System.out.println(str.contains("KRISH"));// true
		System.out.println(str.contains("RAKI"));// false
		
		
		// 06 equals() - its consider case sensitivity
		// equalsIngnoreCase() - its not consider case sensitivity
		// returns boolean value
		
		String str1="RADHAKRISHNAN";
		String str2="radhakrishnan";
		String str3="RADHAKRISHNAN";
		System.out.println(str1.equals(str2));// false
		System.out.println(str1.equals(str3));// true
		System.out.println(str1.equals("RADHAKRISHNAN")); // true
		System.out.println(str1.equalsIgnoreCase(str2));// true
		
		// 07 replace() - replace single/multiple character in a string
		// Cannot replace multiple string
		
		String str0="welcome to automation using java with selenium";
		System.out.println(str0.replace('e', 'a'));// replace single character
		System.out.println(str0.replace("java", "python")); // replace multiple/sequence of character
		
		// 08 substring - Extract substring from the main string
		// starting index - 0
		// Ending index - 1
		String y="arun";
		System.out.println(y.substring(1)); // put an index value and output of the string start from the specify index value place
		System.out.println(y.substring(0,3));// here starting index to be consider and ending index cannot be consider
		
		
		// 09 replace - 
		
		System.out.println(str.replace("R", "T"));
		System.out.println(str.replace("RADHA","MUTHU"));
		
		// toUpperCase() , toLowerCase() - 
		String x= "radhakrishnan";
		
		System.out.println(str.toLowerCase());
		System.out.println(x.toUpperCase());
		
		// 10 split() -  split the string into multiple parts based on delimiter
		
		str= "radha1865@gmail.com";
		String z[]=str.split("@");// split method to split string in array 
		System.out.println(Arrays.toString(z));
		System.out.println(z[0]);
		System.out.println(z[1]);
		
		// method 02
		// * % / ^ & ( )  this symbols are cannot be use as delimiter
		// also remove space in split method
		
		str="radha1865@gmail,com";	
		String a[]=str.split("@");
		System.out.println(Arrays.toString(a));
		
		String b[]=a[1].split(",");
		System.out.println(Arrays.toString(b));
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(b[1]);

	}

}
