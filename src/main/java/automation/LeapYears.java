package automation;

import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {

		int yearToEvaluate;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an year");
		yearToEvaluate = s.nextInt();
		System.out.println("Year = " + yearToEvaluate);

		while (yearToEvaluate < 1900 || yearToEvaluate > 2016) {
			System.out.println("Please enter an year between 1900-2016");
			yearToEvaluate = s.nextInt();
		}
		if (yearToEvaluate % 4 == 0 && yearToEvaluate % 100 != 0 || yearToEvaluate % 400 == 0) {
			System.out.println("In ," + yearToEvaluate + " February got 29 days ");
		} else {
			System.out.println("In ," + yearToEvaluate + " February got 28 days ");
		}
		s.close();
	}

}
