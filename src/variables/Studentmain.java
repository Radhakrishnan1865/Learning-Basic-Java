package variables;

public class Studentmain {

	public static void main(String[] args) {
		
		// 01 using object reference variables
		/*Student s=new Student();
		s.sid=101;
		s.sname="RADHAKRISHNAN";
		s.sgrade='S';
		s.printstudentdata();
		
		// 02 using method
		s.setdata(102, "KANNAN",'A');
		s.printstudentdata();
		*/
		// 03 using constructor - most of the time used 
		//because once create the object its automatically invoked.
		Student s1= new Student(103,"RASUL",'S');
		Student s2= new Student(104, "ARUN",'A');
		Student s3= new Student(105,"KARUPPU",'S');
		s1.printstudentdata();
		s2.printstudentdata();
		s3.printstudentdata();
		 
		
	}

}
