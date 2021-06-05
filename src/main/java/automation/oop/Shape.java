package automation.oop;

public class Shape {

	public static void main(String[] args) {

		Square sq = new Square();

		for (String side : args) {
			sq.setSide(Double.parseDouble(side));
			System.out.println("Area is " + sq.getArea());
		}
		// sq.setSide(Double.parseDouble(args[0]));
		// sq.setSide(5);
		// System.out.print(sq.getArea());
	}

}
