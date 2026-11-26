package lab4;

public class Invest {

	public static void main(String[] args) {
		double initialMoney = 100;
		double interestRate = 0.05;
		int years = 0;
		double currentMoney = initialMoney;
		
		
		while (currentMoney < (2 * initialMoney)) {
			currentMoney += currentMoney * interestRate;
			years++;
		}
		
		System.out.printf("Number of years to double money: %d", years);

	}

}
