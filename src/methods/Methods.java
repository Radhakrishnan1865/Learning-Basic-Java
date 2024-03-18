package methods;

public class Methods {
	/*1. Method name can be anything.
2. Method may or may not return a value
3. If method is not return any value then spcify void.
4. Method can take parameter/arguments.
5. We have to invoke/call methods explicitely through object.
6. Used for specifying logic.*/

	public static void main(String[] args) {
		 
		Mthods first= new Mthods();
		first.m1();// 01
		
		String s=first.m2(); // 02
		System.out.println(s);
		
		first.m3("RADHAKRISHNAN"); // 03
		
		String s1=first.m4("Rasul Kamsadev Krishnan");  // 04
		System.out.println(s1);

	}

}
