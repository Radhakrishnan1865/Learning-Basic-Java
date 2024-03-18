package statickeyword;

public class Staticmain  {
	
 public static void main(String[] args) {
		
		
		// we can access the static stuff in another static method( separate /another class) 
	    // put explicitly specify the class name 
		System.out.println(Static.a);
		Static.m1();
		
		// here non static stuff access is no problem. once create an object to access the stuff
		Static s=new Static();
		System.out.println(s.b);
         s.m2();
         
         s.m();

}
}
