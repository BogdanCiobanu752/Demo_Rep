package automation;

public class ContinueBreak {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int x : numbers) {
			if (x == 30) {
				continue;
			}
			sum += x;
			if (sum > 100) {
				break;
			}
			System.out.println(x);
		}
		System.out.println("sum: " + sum);

	}

}
