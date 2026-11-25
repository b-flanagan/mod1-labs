package qa;

public class Airport {
	
	public static double serviceFee(double amount) {
		if (amount < 100 && amount > 0) {
			return (amount * 0.05);
		}
		else if (amount > 99) {
			return amount * 0.025;
		}
		return 0;
	}
	
	public static double airportTax(double amount, char customerType) {
		if (customerType == 'R') {
			return (amount * 0.1);
		}
		else if (customerType == 'V') {
			return (amount * 0.05);
		}
		return 0;
	}

	public static void main(String[] args) {
		double amount = 500, airportTax = 0;
		int currency = 3;
		char customerType = 'V';
		int currencyAmount;
		

		System.out.println("Amount after service fee: " + (amount - serviceFee(amount)));
		

		System.out.println("Amount after tax: " + (amount - airportTax(amount, customerType)));
		
		amount -= serviceFee(amount);
		amount -= airportTax(amount, customerType);
		
		switch(currency) {
		case 1:
			currencyAmount = (int) (1.25 * amount);
			break;
		case 2:
			currencyAmount = (int) (1.15 * amount);
			break;
		case 3:
			currencyAmount = (int) (180.5 * amount);
			break;	
		default:
			currencyAmount = (int) amount;
		}
		
		System.out.println("Final amount in currency: " + currencyAmount);
		
	}
	
}
