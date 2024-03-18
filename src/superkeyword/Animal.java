package superkeyword;

public class Animal {

	String color="white";

	void eat()
	{
		System.out.println("eating vegitables");
	}
}
class dog extends Animal
{
	String color="block";

	void display()
	{
		System.out.println(super.color);  //super keyword will be used to invoke the immediate parent class variables.


	}
	void eat()
	{
		//super.eat();
		System.out.println("eating vegitables with meat");
		super.eat(); // here parent class methods will be automatically invoked using super keyword.
	}
}


