package inheritanceTypes;

class Alagarsamy
{
	int a=10;
	int b=20;
	
	void add()
	{
		System.out.println(a+b);
	}
}

class Radhakrishnan extends Alagarsamy
{
	int c=20;
	int d=40;
	
	void sub()
	{
		System.out.println(c-d);
	}
}

class Kannan extends Radhakrishnan
{
	int x=100;
	int y=200;
	
	void div()
	{
		System.out.println(y/x);
	}
}

class Arun extends Kannan
{
	int m=2;
	int n=3;
	
	void multi()
	{
		System.out.println(m*n);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		  Arun obj=new Arun();
		  System.out.println(obj.a);
		  System.out.println(obj.b);
		  System.out.println(obj.c);
		  System.out.println(obj.d);
		  System.out.println(obj.x);
		  System.out.println(obj.y);
		  System.out.println(obj.m);
		  System.out.println(obj.n);
		  
		  System.out.println("------------------");
		  
		  obj.add();
		  obj.sub();
		  obj.multi();
		  obj.div();
				  
		  
		

	}

}
