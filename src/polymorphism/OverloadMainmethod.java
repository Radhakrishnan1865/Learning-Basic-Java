package polymorphism;

public class OverloadMainmethod {
	
	// Main method also over loading 
	
			void main(int a)
			{
				System.out.println(a);
			}
			
			void main(String s)
			{
				System.out.println(s);
			}
			
			void main(String s1, String s2)
			{
				System.out.println(s1+s2);
			}

	public static void main(String[] args) {
		
		OverloadMainmethod x=new OverloadMainmethod();
		x.main(10);
		x.main("RADHAKRISHNAN");
		x.main("HELLO ", "RADHAKRISHNAN");
		

	}

}
