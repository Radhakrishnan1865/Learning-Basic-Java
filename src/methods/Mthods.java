package methods;

public class Mthods {
	
	// 01 No parameters 	No return value
	
	void m1() 
	{
		System.out.println("HELLO...");
	}
	
	// 02 No parameters 	Return value 
	String m2() // using return keyword
	{
		return ("hello how are you");
	}
	
	// 03 Takes parameters 	No return value
	void m3(String name)
	{
		System.out.println("Hello " + name);
	}
	
	// 04 Takes parameters 	Return value
	String m4(String name)
	{
		return ("Hello " + name);
	}

}
