package constructor;

public class Constructor {
	
	/*1. Constructor name should be same as calss name.
2. Constructor will never return a value.(not even void)
3. We don't specify void.
4. Constructor can take parameters/arguments.
5. Constructor automatically invoked at the time of object creation.
6. Used for initilizing the values of the object.*/
	
	int a;
	int b;
	int c;
	
	// 1.Default constructor
	Constructor()
	{
		a=10;
		b=20;
		c=50;
	}
	
	// 2.Parameterised constructor
	Constructor(int d, int e,int f){
	
		a=d;
		b=e;
		c=f;
	}
	
	void operations()
	{
		System.out.println(a+b);
		System.out.println(c/a);
	}
	

	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		c.operations();
		
		Constructor c1=new Constructor(10,40,100);
		c1.operations();


		
		

	}

}
