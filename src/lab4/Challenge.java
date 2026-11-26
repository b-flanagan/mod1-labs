package lab4;

import java.util.Random;

public class Challenge {

	public static void main(String[] args) {
		String[] cards = {"A ♠", "2 ♠", "3 ♠", "4 ♠", "5 ♠", "6 ♠", "7 ♠", "8 ♠", 
				"9 ♠", "10 ♠", "J ♠", "Q ♠", "K ♠", "A ♥", "2 ♥", "3 ♥", "4 ♥", "5 ♥", 
				"6 ♥", "7 ♥", "8 ♥", "9 ♥", "10 ♥", "J ♥", "Q ♥", "K ♥", "A ♣", "2 ♣", 
				"3 ♣", "4 ♣", "5 ♣", "6 ♣", "7 ♣", "8 ♣", "9 ♣", "10 ♣", "J ♣", "Q ♣", 
				"K ♣", "A ♦", "2 ♦", "3 ♦", "4 ♦", "5 ♦", "6 ♦", "7 ♦", "8 ♦", "9 ♦", 
				"10 ♦", "J ♦", "Q ♦", "K ♦" };
		
		int[] values = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 
				7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 
				2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		
		int[] scores = {0, 0};
		
		
		for (int i = 0; i < 2; i++) {
			System.out.printf("Player %d\n", i+1);
			scores[i] = drawHand(cards, values);
		}

		if (scores[0] > scores[1]) {
			System.out.println("Player 1 wins!");
		}
		else if (scores[0] < scores[1]) {
			System.out.println("Player 2 wins!");
		}
		else {
			System.out.println("Draw!");
		}


	}
	
	public static int drawHand(String[] cards, int[] values) {
		Random rand = new Random();
		int totalValue = 0;
		for (int i = 0; i < 3; i++) {
			int index = rand.nextInt(cards.length);
			System.out.printf("Card %d: %s\n", i + 1, cards[index]);
			totalValue += values[index];
		}
		System.out.printf("Total value: %d\n", totalValue);
		return totalValue;
	}

}
