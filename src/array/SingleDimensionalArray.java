package array;

public class SingleDimensionalArray {
	
	/*1) declare an array
	 * 2) add values into array
	 * 3) find length of an array
	 * 4) read single value from an array
	 * 5) read multiple values from an array
	 */

	public static void main(String[] args) {
		
		//1) Declare an array
		//2) Add values into array
		
		// Approach 01
		
		int a[]=new int[5]; // declaration
		
		a[0]=10; // assign a value
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		// Approach 02
		
		int b[]= { 10,20,30,40,50}; // declare and assign values
		
		
		// 3) Find length of an array
		
		int c[]= {10,20,30,40,50,60};
		
		int length= c.length;
		System.out.println(" Length of an array : " + length);
		
		
		// 4) Read single value from an array
		
		int d[]= {10,20,30,40,50,60};
		 
		System.out.println(d[3]);
		
		// 5) Read multiple values from an array
		
		int x[]= {100,200,300,400,500,600};
		int len=x.length;
		
		
		// Normal for loop
		for(int i=0; i<=len-1; i++) {
			
			System.out.println(x[i]);
		}
		
		
		// Enhanced for loop / for..each loop
		// this mainly used for collection and array concepts 
		
		int y[]= { 1,2,3,4,5,6};
		
		
		for(int z:y) {
			System.out.println(z);
		}
		
	}

}
