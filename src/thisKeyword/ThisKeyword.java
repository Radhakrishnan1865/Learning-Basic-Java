package thisKeyword;

public class ThisKeyword {
	
	int x,y; // this is a class variables/instance variables. It can be only access with in the class.
	
	
	/*ThisKeyword(int x,  int y)// constructor
	  // here a,b is a local variable. It can be only access with in the method.
	// here put class variables and local variables are same name, compiler cannot find the variables are class variables or local variables.
	// so this keyword can be used. Here this keyword mention class variables.
	{
		this.x=x;
		this.y=y;
	}*/
	
	void setdata(int x, int y)// normal method
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		
		//ThisKeyword th=new ThisKeyword(10,20);
		//th.display();
		
		ThisKeyword th1=new ThisKeyword();
		th1.setdata(10,20);
		th1.display();
		

	}

}
