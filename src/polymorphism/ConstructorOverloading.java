package polymorphism;

public class ConstructorOverloading {
	
	// Inside the constructor we cannot write any operations . Only assigning the values.
	/* We can achieve polymorphism using overloading.

	* 4 rules are applicable
	1. Method names should be same.
	2. Number of parameters should be different.
 	3. Data type of parameters should be different.
	4. Order of parameters should be different.
	
*/
	
	int l=30, b=20, h=10;
	
	ConstructorOverloading()
	{
		l=b=h=0;
	}
	
	ConstructorOverloading(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	
	ConstructorOverloading(int size)
	{
		l=b=h=size;
		
	}
	
	int volume()
	{
		return(l*b*h);
	}

}
