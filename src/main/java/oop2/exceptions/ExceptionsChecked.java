package oop2.exceptions;

public class ExceptionsChecked {

	public static void main(String[] args) throws Exception {

		// se adauga "throws Exception" pentru a adauga exceptii, si daca scot sunt obligat sa adaug "try/catch"
		// try {
		// System.out.println(circleArea(-5));
		// } catch (Exception e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
	}

	public static double circleArea(double radius) throws Exception {
		if (radius < 0) {
			throw new Exception("radius should be positive");
		}
		return Math.PI * radius * radius;
	}

}
