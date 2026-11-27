package lab5;

public class Program {

	public static void main(String[] args) {
		
		Account myAccount = new Account(1, "Brent", 100);
		
		Bank myBank = new Bank();
		
		myBank.addAccount("Brent", 100);
		myBank.addAccount("Andy", 200);
		myBank.addAccount("Sue", 300);
		myBank.addAccount("Steve", 300);
		
		
		try {
			System.out.printf(myBank.getAccount("Steve").getDetails());
		}
		catch(Exception e) {
			System.out.println("Cannot get Account Details");
		}
		
		
		//Account partnerAccount = myAccount;
		
		//myAccount.addInterest();
		
		//int k = 100;
		
		//incInt(k);
		
		//System.out.println(k);
		
		//System.out.println(myAccount.getDetails());
		
//		Account acc1 = new Account(1, "Brent", 100);
//		Account acc2 = new Account(2, "Andy", 200);
//		Account acc3 = new Account(3, "Sue", 300);
//		
//		Account[] accounts = {acc1, acc2, acc3};
//		
//		for (Account acc : accounts) {
//			System.out.printf(acc.getDetails());
//		}
		
		//acc1.deposit(100);
		//acc1.withdraw(500);
		

		//System.out.printf(acc1.getDetails());
		
	}
	
	static void processAccount(Account acc) {
		acc.addInterest();
	}
	
	private static void incInt(int x) {
		x++;
	}

}
