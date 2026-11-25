package lab2;

public class Program {

	public static void main(String[] args) {
		int mark = 101;
		
		if (mark < 50)
		{
			System.out.println("Fail");
		}
		else if (mark > 49 && mark < 61)
		{
			System.out.println("Pass");
		}
		else if (mark > 60 && mark < 71)
		{
			System.out.println("Merit");
		}
		else if (mark > 70 && mark < 101)
		{
			System.out.println("Distinction");
		}
		else if (mark > 100 || mark < 1)
		{
			System.out.println("Error: marks must be between 1... 100");
		}
	}

}
