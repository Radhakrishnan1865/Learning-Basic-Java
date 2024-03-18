package overriding;


class A
{
	void m1(int x)
	{
		System.out.println(x);
	}
	void m2(int y)
	{
		System.out.println(y);
	}
}

class B extends A
{
	void m1(int x) // here overriding will be implemented
	{
		System.out.println(x*x);
	}
	void m2(int y, int z) // here overloading will be implemented
	{
		System.out.println(y-z);
	}
}
public class OverlodingVsOverriding {

	public static void main(String[] args) {
		 
		B bobj=new B();
		bobj.m1(10);
		bobj.m2(40);
		bobj.m2(30,20);
		

	}

}
