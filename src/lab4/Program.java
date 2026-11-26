package lab4;

public class Program {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		
		//Task 1
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		System.out.printf("Sum: %d\n", sum);
		
		//Task 2
		System.out.printf("Average: %d\n",sum / numbers.length);
		
		//Task 3
		int min = numbers[0];
		for (int num : numbers) {
			if (num < min) {
				min = num;
			}
		}
		System.out.printf("Minimum: %d\n", min);
		
		//Task 4
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		System.out.printf("Maximum: %d\n", max);
		
		//Task 5
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				System.out.printf("0 index: %d\n", i);
			}
		}
	}

}
