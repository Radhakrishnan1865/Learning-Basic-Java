package statickeyword;

public class Static {
	
	static int a=10; // static variable
	int b=20; // no-static variable
	
	static void m1() // static method
	{
		System.out.println(" This is a static method");
	}
	
	void m2() // non-static method
	{
		System.out.println(" This is a non-static method");
	}
	
	void m()//Non static methods can access everything directly.

	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		
		//Static methods can access static variables and static methods directly(without creating any object)
		System.out.println(a);
		m1();
		
		//Static methods cannot access non-static variables and non-static methods directly(without creating any object)
		//Static methods can access non static stuff through object.
		Static s=new Static();
		System.out.println(s.b);
         s.m2();
         
         s.m();
		

	}

}
