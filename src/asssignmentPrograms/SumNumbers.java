package asssignmentPrograms;

public class SumNumbers {

	public static void main(String[] args) {
		
		
		int num=35238695;
		int even_sum=0;
		int odd_sum=0;
		
		while(num>0) {
			
			int rem= num%10;
			
			if(rem%2==0) {
				even_sum+=rem;
			}
			else {
				odd_sum+=rem;
			}
			num/=10;
		}
		
		System.out.println(" sum of even number is : " + even_sum);
		System.out.println(" sum of odd number is : " + odd_sum);

	}

}
