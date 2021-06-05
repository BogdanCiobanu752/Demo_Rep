package automation;

public class OddNumbers {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {

			int valueToEvaluate = Integer.parseInt(args[i]);

			boolean isOddNr = isOddNumber(valueToEvaluate);
			System.out.println(valueToEvaluate + " Is odd number = " + isOddNr);
		}
	}

	public static boolean isOddNumber(int number) {

		if (number % 2 == 0) {
			return false;
		} else {
			return true;
		}

	}
}
