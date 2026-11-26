package lab3;


public class Program {	

	public static void main(String[] args) {
		theLunchQueue();
	}

	
	public static void theLunchQueue() {
		Utils utils = new Utils();
		String mainCourse = utils.getString("What main dish would you like(Fish, Burgers or veg) ?");
		if (mainCourse.toLowerCase().equals("fish") || mainCourse.toLowerCase().equals("burgers") || mainCourse.toLowerCase().equals("veg")) {
			int numPotatoes = utils.getInt("How many roast potatoes would you like?");
			int numSprouts = utils.getInt("How many Brussel Sprouts would you like?");
			System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts.", mainCourse, numPotatoes, numSprouts);
		}
		else {
			System.out.println("Main course not available");
		}
	}
}
