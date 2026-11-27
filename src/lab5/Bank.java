package lab5;

public class Bank {
	private Account[] storage = new Account[3];
	
	Account addAccount(String owner, double balance) {
		Account acc = null;
		for(int i = 0; i < this.storage.length; i++) {
			if(this.storage[i] == null) {
				acc = new Account(i+1, owner, balance);
				this.storage[i] = acc;
				return acc;
			}
		}
		System.out.println("Cannot add more than 3 accounts");
		return null;
	}
	
	Account getAccount(String owner) {
		for(Account acc : this.storage) {
			if(acc.getOwner().equals(owner)) {
				return acc;
			}
		}
		return null;
		
	}
}
