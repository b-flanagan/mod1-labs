package lab3;

public class WeightConversion {

	public static void main(String[] args) {
		Utils utils = new Utils();
		convertInputToStonesPounds(utils.getInt("Enter weight in pounds: "));
		convertKgsToStonesPounds(utils.getInt("Enter weight in kilograms: "));
		
	}
	
	static void convertInputToStonesPounds(int pounds) {
		System.out.printf("%d Stones, %d Pounds\n", pounds / 14, pounds % 14);
	}
	
	static void convertKgsToStonesPounds(int kg) {
		int pounds = (int) (kg * 2.20462);
		convertInputToStonesPounds(pounds);
	}

}
