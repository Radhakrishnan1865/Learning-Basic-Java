package asssignmentPrograms;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		 
		
		String s= "java automation with selenium";
		
		int len=s.length(); //total length of given string
		
		int remove_len=s.replaceAll("a", "").length(); // total length after removing all a's
		
		int count= len-remove_len;
		System.out.println(" Number of occurances of a is : " + count); // ans:4

	}

}
