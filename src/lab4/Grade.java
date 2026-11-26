package lab4;

public class Grade {

	public static void main(String[] args) {
		String[] students = {"Dani", "Phil", "Aiden", "James", "Shawn"};
		int[] marks = {75, 40, 55, 67, 85};
		
		for (int i = 0; i < marks.length; i++) {
			System.out.printf("Student: %s  Mark: %d  Grade: %s\n", students[i], marks[i], getGrade(marks[i]));
		}

	}
	
	public static String getGrade(int mark) {
		if (mark < 50 && mark > 0)
		{
			return "Fail";
		}
		else if (mark > 49 && mark < 61)
		{
			return "Pass";
		}
		else if (mark > 60 && mark < 71)
		{
			return "Merit";
		}
		else if (mark > 70 && mark < 101)
		{
			return "Distinction";
		}
		else
		{
			return "Error: marks must be between 1... 100";
		}
	}

}
