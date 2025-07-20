package Day13;

public class Account {
	//Encapsulation means wrapping up variables and methods in a single unit
	//All variables should be private.
	//All variables should have setter and getter methods
	//variables can be operated only through variables
	
	private int accno;
	private String name;
	private double amount;
	
	public void setAccNo(int accno) {
		this.accno=accno;
	}
	public int getAccNo() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
