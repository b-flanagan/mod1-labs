package lab5;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	public Account (int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Deposit amount cannot be negative");
		}
		else {
			this.balance += amount;
		}
		
		
	}
	
	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Withdraw amount cannot be greater than balance");
		}
		else {
			this.balance -= amount;
		}
		
	}
	
	public String getDetails() {
		return String.format("Id: %d  Owner: %s  Balance: £%.2f\n", this.id, this.owner, this.balance);
	}
	
	public void addInterest() {
		this.balance += (this.balance * 0.025);
	}

}
