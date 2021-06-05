package automation;

/**
 * Exemple de shape pt stelute + cum se fac comenturi
 * 
 * @author Bogdanel
 *
 */

public class DrawFullShape {

	public static void main(String[] args) {

		// Class activity
		// int height = Integer.parseInt(args[0]);
		// int width = Integer.parseInt(args[1]);
		/*
		 * comentariu multiplu CTRL + / sau /* + Enter sau /** + Enter la inceputul main
		 */

		int lenght = 7;
		drawSquare(lenght);
		drawSquare((short) 5);
	}

	public static void drawSquare(int lenght) {
		for (int i = 1; i <= lenght; i++) {
			for (int j = 1; j <= lenght; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/**
	 * dau click pe metoda si SHIFT+ALT+j si imi creaza automat un comentariu cu parametrul metodei
	 * 
	 * @param lenght
	 *        comentariul parametrului
	 */
	public static void drawSquare(short lenght) {
		for (int i = 1; i <= lenght; i++) {
			for (int j = 1; j <= lenght; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void drawFullShape(int height, int width) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void drawShapeOutline(int height, int width) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void drawShapeCorners(int height, int width) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				// if((i==1||i==height)&&(j==1||j==width)))
				if (i == 1 && j == 1 || i == 1 && j == width || i == height && j == 1 || i == height && j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
