package array;

public class SearchingElementsInArray {

	public static void main(String[] args) {
		// Example 01
		
		// search an element in array ( linear search )
		// suppose array have a duplicate value , in this case once found an element the loop will be automatically exited
		// other duplicate values are not found
	
		int a[]= {10,30,20,50,60,200,150};
		int search_element=50;
		boolean status=false;
		
		for(int i=0; i<=a.length-1; i++) {
			
			if(a[i]==search_element) {
				System.out.println(" Element found ");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println(" Element not found");
		}
		
		
		// Example 02
		// find how many times repeat number in array
		
		int b[]= {10,20,30,40,10,50,10,60,10};
		int searching_element=10;
		int count=0;
		
		for(int i=0; i<=b.length-1; i++) {
			
			if(b[i]==searching_element) {
				count++;
				}
		}
		System.out.println(count);
	}

}
