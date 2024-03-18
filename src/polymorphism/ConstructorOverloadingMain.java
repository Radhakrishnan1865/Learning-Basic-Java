package polymorphism;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
		 
		ConstructorOverloading s= new ConstructorOverloading();
		int vl=s.volume();
		System.out.println(vl);
		
		ConstructorOverloading s1= new ConstructorOverloading(2,4,8);
		System.out.println(s1.volume());
		
		ConstructorOverloading s2= new ConstructorOverloading(8);
		System.out.println(s2.volume());

	}

}
