package interfacedemo;

interface shape
{
	int length=20; // final and static
	int width=10; // final and static
	
	void circle(); // its a abstract method(without implementation) // in interface methods default access modifier is "public".
	
	default void square() // to explicitly provide a default keyword in default method
	{
		System.out.println(" This is a square");
	}

	static void rectangle() // static method
	{
		System.out.println(" This is a rectangle");
	}
}

public class InterfaceDemo implements shape
{
	public void circle() // In class methods have a default access modifier is "default". but here implements the interface method so explicitly provide "public".
							// because interface methods have a default modifier is "public".
	{
		System.out.println(" This is a circle");
	}

	public static void main(String[] args) {
		 
		// case 01
		InterfaceDemo obj=new InterfaceDemo();  // object created for the class and stored by same type of class reference variable
		obj.circle(); // abstract class
		obj.square();  // default class 
		
		shape.rectangle(); // Interface have a static method, its cannot be directly called by another static method.
							//But its called by using (interface name.static method name)
		
		
		// case 02
		
		shape sh=new InterfaceDemo();  // object created for the class and stored by interface reference variable
		sh.circle(); // abstract method
		sh.square();  // default method
		
		shape.rectangle(); // static method

	}

}
