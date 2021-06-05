package automation;

public class Square extends Rectangle {
	// putem spune ca Square mosteneste pe Rectangle, pentru ca e o forma particulara a dreptunghiului
	// pentru ca patratul esteun dreptunghi cu toate laturile egale

	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if (side > 0) {
			this.side = side;
		}

	}

	@Override
	public int getLargeSide() {
		return side;
	}

	@Override
	public void setLargeSide(int side) {
		if (side > 0) {
			this.side = side;
		}

	}

	@Override
	public int getSmallSide() {
		return side;
	}

	@Override
	public void setSmallSide(int side) {
		if (side > 0) {
			this.side = side;
		}

	}

	@Override
	public double getArea() {
		// Math.pow(side,2); putem sa folosim si asa pentru ridicare la putere
		return side * side;
	}

	@Override
	public String getcolor() {
		return "Green";
	}

	@Override
	public String draw() {
		return "Square";
	}

	@Override
	public String toString() {
		return "The side lenght is " + side;
	}

}
