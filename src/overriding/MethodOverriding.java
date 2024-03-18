package overriding;


class car
{
	void engine()
	{
		System.out.println(" this is a common powerful engine");
	}
}

class Benz extends car
{
	void engine()
	{
		System.out.println(" this is a benz modified engine");
	}
}

class Bmw extends car
{
	void engine()
	{
		System.out.println(" this is a bmw modified engine");
	}
}
public class MethodOverriding {
	
	

	public static void main(String[] args) {
		 
		//In overriding concept to extends the parent class methods into child class, the declaration part cannot be changed 
		// but implementation should be changed(body of the method)
		
		Benz be=new Benz();
		be.engine();
		
		Bmw bm=new Bmw();
		bm.engine();
		

	}

}
