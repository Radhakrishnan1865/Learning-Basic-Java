package inheritanceTypes;
// here main class have only public access modifier. then other classes are not specified in inheritance

class addition
{
	int a=10;
	int b=20;
	
	void sum()
	{
		System.out.println(a+b);
	}
}

class multi extends addition
{
	int x=2;
	int y=3;
	
	void multiplication()
	{
		System.out.println(x*y);
	}
}

public class SingleInheritane {

	public static void main(String[] args) {
		 
		multi obj=new multi();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		obj.sum();
		obj.multiplication();
		
		

	}

}
