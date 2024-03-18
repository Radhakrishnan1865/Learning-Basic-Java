package variables;

public class Student {

	int sid;
	String sname;
	char sgrade;

	void printstudentdata()
	{
		System.out.println(sid+ "    "+sname+"    "+sgrade);
	}

	void setdata(int id, String name, char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}

	Student(int id, String name, char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;	
	}

}