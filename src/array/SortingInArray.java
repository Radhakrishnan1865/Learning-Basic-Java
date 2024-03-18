package array;

import java.util.Arrays;

public class SortingInArray {

	public static void main(String[] args) {
		
		// Example 01
		// sorting numbers
		
		int a[]= {30,60,90,20,40,10,50,10};
		
		System.out.println(" Before sotring ");
		System.out.println(Arrays.toString(a)); // in this method only print array without using loop
		
		Arrays.sort(a); // in this method to sorting array
		
		System.out.println(" After sotring ");
		System.out.println(Arrays.toString(a)); // in this method only print array without using loop
		
		
		// Example 02
		// sorting strings
		
		String name[]= {"RADHA","ARUN","RASUL","KANNAN","ARUNA","VALARMATHI","ALAGARSAMY"};
		
		System.out.println(" Before sotring ");
		System.out.println(Arrays.toString(name)); // in this method only print array without using loop
		
		Arrays.sort(name);
		
		
		System.out.println(" After sotring ");
		System.out.println(Arrays.toString(name)); // in this method only print array without using loop
		
		

	}

}
