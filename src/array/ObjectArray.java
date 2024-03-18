package array;

public class ObjectArray {

	public static void main(String[] args) {
		
		// Its not recommended
		
		Object a[]= {10,28.99,"RADHA",'b',0.089,false};
		
		// Enhanced for loop/ for each loop
		
		for(Object x:a) {
			
			System.out.println(x);
		}
		 
		System.out.println("----------------------");
		
		
		// for loop
		
		for(int i=0; i<= a.length-1; i++) {
			System.out.println(a[i]);
		}
		}

}
