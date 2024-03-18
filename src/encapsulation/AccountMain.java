package encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		 
		Account acc=new Account();
		acc.setAccno(10001);
		acc.setName("RADHAKRISHNAN");
		acc.setAmount(10000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());

	}

}
