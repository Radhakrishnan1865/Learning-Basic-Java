package interfacedemo;

public class Class01 extends Class02 implements Interface01,Interface02
{
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Class01 cl=new Class01();
		cl.m1();
		cl.m2();
		cl.m3();
		
		 
		

	}

}
