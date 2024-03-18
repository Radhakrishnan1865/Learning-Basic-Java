package accessModifier;

public class Access1 {
	// private access modifiers are only used in variables and methods, 
	// its only access with in the class
	
	private int a=10;
	
	private void m1()
	{
		System.out.println("this is a method m1 "+ a);
	}
	public static void main(String[] args) {
		Access1 a1=new Access1();
		System.out.println(a1.a);
		a1.m1();
	}

}
