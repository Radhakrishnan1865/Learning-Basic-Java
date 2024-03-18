package finalKeyword;


class Test1
{
	
	final void m1()
	{
		System.out.println(" this is m1 method from Test1");
		
	}
}

class Test2 extends Test1
{
	void m1(int a) // here method is overloaded/ but cannot be override
	{
		System.out.println(" a value of this method is:"+ a);
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		Test2 te=new Test2();
		te.m1(10);
		

	}

}
