package passingParamsToMainMethod;

public class MainMethod {

	public static void main(String[] args) {
		// run as-
		
		System.out.println(args.length); // once passing the arguments then it fixed after changing
		
		for(String value:args)
		{
			System.out.print(value+ " ");
		}

	}

}
