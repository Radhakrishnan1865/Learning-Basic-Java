package learnClass;
// some time use data from one package to another package - here import package
// import packagename.classname;

public class NewClass {
	/* 1) Class
--------
  * class is collection of attributes(variables) and behaviour(methods)
  * it is a virtual/logical entity/blue print
  * it will not occupay space in the memory


   syntax:
   -------

        class Employee
        {
         variables
         methods
         }

2)Objet
-------
    * object is an instance of a class/object will be created by using class
    * object is physical entity
    * occupy space in memory
    * we can create multiple objects for single class

    syntax
    ------
	Employee emp=new Employee();
	*/
	// class contains variables and methods
	
	// variables
	int eid;
	String ename;
	String ejob;
	int esal;
	
	// method
	
	void display()  // method should have return type // here void is return type , void- return empty value
	                // one method should not contains another method
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(ejob);
		System.out.println(esal);
	}
	

	public static void main(String[] args) {

       // objects create only in main method
	   // execution starts from main method
		// We can create n-number of objects in single class
		// in real scenario a project have only one main method for execution
		
		NewClass emp1= new NewClass();
		emp1.eid=101;
		emp1.ejob= "Automation Tester";
		emp1.ename= "A RADHAKRISHNAN";
		emp1.esal= 45000;
		emp1.display();
		System.out.println("--------------------");
		
		NewClass emp2= new NewClass();
		emp2.eid=102;
		emp2.ejob= "Project Manager";
		emp2.ename= "M RAMAKRISHNAN";
		emp2.esal= 55000;
		emp2.display();
		

	}

}
