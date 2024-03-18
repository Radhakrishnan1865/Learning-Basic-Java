package polymorphism;

public class MethodOverloadingMain {

	public static void main(String[] args) {


		MethodOverloading s= new MethodOverloading();
		
		s.sum();
		s.sum(10,20);
		s.sum(10,20.6);
		s.sum(20.3, 10);

	}

}
