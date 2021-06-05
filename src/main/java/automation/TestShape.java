package automation;

public class TestShape {

	public static void main(String[] args) {

		Shape shape = new Shape();
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();

		// System.out.println(circle.draw());
		// System.out.println(shape.draw());
		// System.out.println(square.draw());
		// System.out.println(rectangle.draw());
		System.out.println(square.toString());
	}

}
