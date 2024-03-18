package wrapperclass;

public class ChangeValues {

	public static void main(String[] args) {
		 
		// 01) String to int
		/*
		String s="welcome"; // this string value cannot be convert to integer value
		int value=Integer.parseInt(s);
		*/
		String s1="10";
		String s2="20";
		
		int a1=Integer.parseInt(s1);
		int a2=Integer.parseInt(s2);
		
		System.out.println(a1+a2);
		
		// 02) String to  double
		
		String b1="10.5";
		String b2="20.5";
		
		double x1=Double.parseDouble(b1);
		double x2=Double.parseDouble(b2);
		
		System.out.println(x1+x2);
		
		// 03) String to boolean
		// if u pass any string value that will return false other than true.
		
		b1="true";
		b2="false";
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		// int, double, boolean, char --- string
		
		
		int i=10;
		double d= 20.4;
		char c='A';
		boolean b= true;
		
		String n1=String.valueOf(i);
		String n2=String.valueOf(b);
		String n3=String.valueOf(c);
		String n4=String.valueOf(d);
		
		System.out.println(n1+ " "+n2+" "+n3+" "+n4 );
		

	}

}
