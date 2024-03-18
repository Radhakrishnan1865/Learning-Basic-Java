package loopingStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		// 1. Single dimensional array
		
	int y[]= { 1,2,3,4,5,6};
		
		
		for(int z:y) {
			System.out.print(z + " ");
		}
		
		System.out.println("--------------------");
		
		
		// Enhanced for loop/ for each loop
		
					int arr[][]= { {1,2},
							       {3,4},
							       {5,6}
							       };
					
					for( int array[]:arr) {
						
						for(int z:array) {
							
							System.out.print(z + " ");
						}
						System.out.println();
					}

	}

}
