package Day13;

public class AccountMain {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAccNo(1016478585);
		System.out.println(acc.getAccNo());
		acc.setName("Tipuranajli");
		System.out.println(acc.getName());
		acc.setAmount(100000);
		System.out.println(acc.getAmount());

	}

}
