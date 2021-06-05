package automation;

public class Sum100 {

	public static void main(String[] args) {
		int sum = 0;
		boolean isOddNr;
		for (int i = 1; i < 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		isOddNr = OddNumbers.isOddNumber(sum);

		System.out.println(isOddNr);

	}

}
