package automation.oop;

public class Car {

	private boolean state;
	private int speed;
	private String direction;

	public boolean getState() {
		return state;
	}

	public int getSpeed() {
		return speed;
	}

	public String getDirection() {
		return direction;
	}

	public void start() {
		this.state = true;
	}

	public void stop() {
		this.state = false;
	}

	public void accelerate() {
		this.speed++;
	}

	public void turnLeft() {
		this.direction = "Turning Left";
	}

	public void turnRight() {
		this.direction = "Turning Right";
	}
}
