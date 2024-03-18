package array;

public class TwoDimensionalArray {
	
	/* 1) declare an array
	 * 2) add values into array
	 * 3) find length of an array
	 * 4) read single value from an array
	 * 5) read multiple values from an array
	 */

	public static void main(String[] args) {
		
		// 1) Declare an array
		// 2) Add values into array
		
		// Approach 01
		
		int a[][]=new int[5][3];
		
		/* int a[][]=new int[][]
		 * int []a[]=new int[][]
		 * int a[][]a=new int[][]
		 * all three notations are correct
		 */
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		
		a[3][0]=15;
		a[3][1]=25;
		a[3][2]=35;
		
		a[4][0]=45;
		a[4][1]=65;
		a[4][2]=75;
		
		System.out.println(a[4][0]);
		
		
		// Approach 02
		
		int b[][]= {{10,20},
				    {30,40},
				    {50,60}
		            };
		System.out.println(b[1][0]);
		
		
		// 3) Find length of an array
		int x[][]= new int[5][4];
		int length_rows= x.length;
		int length_coloumns=x[0].length;
		
		System.out.println(" Length of rows: "+ length_rows);
		System.out.println(" Length of coloumns: "+ length_coloumns);
		
		// 4) Read single value from an array
		
		System.out.println(b[1][0]);
		System.out.println(a[3][2]);
		
		// 5) Read multiple values from an array
		// Normal for loop
		
		for(int i=0;i<=b.length-1;i++ ) {
			
			for(int j=0;j<=b[i].length-1;j++) {
				
				System.out.print(b[i][j] + " ");
			}
			System.out.println(); // this mainly used for print next line
			
			System.out.println("------------------------");
			// Enhanced for loop
			int arr[][]= { {1,2},
					       {3,4},
					       {5,6}
					       };
			
			for( int array[]:arr) {
				
				for(int n:array) {
					
					System.out.print(n + " ");
				}
				System.out.println();
			}
		}
	}
	

}
