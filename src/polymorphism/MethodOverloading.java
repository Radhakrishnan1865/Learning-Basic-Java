package polymorphism;

public class MethodOverloading {
	
	int a=10;
	int b=20;
	
	void sum() // without parameter
	{
		System.out.println(a+b);
	}
	
	/*int sum() // without parameter 
	{
		return(a+b); // In method overloading we don't consider the return type. consider only data types and parameters
	}*/
	
	void sum(int x, int y) // with two parameters and same data types
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)  // two parameters and different data types
	{
		System.out.println(x+y);
	}
	
	void sum(double x,int y)  // two parameters and different data types but order of data types are different
	{
		System.out.println(x+y);
	}
	

}
