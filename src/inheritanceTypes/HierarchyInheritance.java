package inheritanceTypes;

class Alagar
{
	void child(String s1,String s2)
	{
		System.out.println(" My childs are :" + s1+ "  "+s2);
	}
}

class ARadhakrishnan extends Alagar
{
	void krishnan()
	{
		System.out.println("Im not mrried");
	}
}

class AKannan extends Alagar
{
	void child(String s3, String s4)
	{
		System.out.println(" My childs are :"+ s3+" "+s4);
	}
}

public class HierarchyInheritance {
	
	public static void main(String[] args) {
		
		ARadhakrishnan a=new ARadhakrishnan();
		a.krishnan();
		
		AKannan b=new AKannan();
		b.child("ARUN", "RASUL");
	}

}
