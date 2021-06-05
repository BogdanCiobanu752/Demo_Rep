package oop2.exceptions;

public class CatchExceptions {
	public static void main(String[] args) {

		try {
			int age = Integer.parseInt(args[0]); // do something with age...
		} catch (NumberFormatException ex) {// sau catch (NumberFormatException | ArrayIndexOutOfBoundsException ex)
			System.out.println("First argument needs to be an int");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println("Add an argument");
		}
	}
}
