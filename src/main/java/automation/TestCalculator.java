package automation;

public class TestCalculator {

	public static void main(String[] args) {
		if (args.length == 3) {

			double a = Double.parseDouble(args[0]);

			double b = Double.parseDouble(args[2]);

			String operator = args[1];

			double result = 0;
			// implement calculator logic here

			switch (operator) {
			case "+":
				result = a + b;
				System.out.println("Result is: " + result);
				break;
			case "-":
				result = a - b;
				System.out.println("Result is: " + result);
				break;
			case "*":
				result = a * b;
				System.out.println("Result is: " + result);
				break;
			case "/":
				if (b != 0) {
					result = a / b;
					System.out.println("Result is: " + result);
					break;
				} else {
					System.out.println("Cannot devide by 0");
				}

			default:
				System.out.println("Check the parameters");
			}

		} else {

			System.err.println("3 arguments are needed!");

		}

	}

}
