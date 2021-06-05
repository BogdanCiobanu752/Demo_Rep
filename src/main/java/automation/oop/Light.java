package automation.oop;

public class Light {
	// cand se declara valorile astea trebuie sa ma gandesc la range ul lor....cat pot sa le definesc
	private boolean state;
	private byte intensity;

	// Light t= new Light(); t=null; asa ditrug un obiect si se sterge din memorie
	public void turnOn() {
		this.state = true;
	}

	public void turnOff() {
		this.state = false;
	}

	public boolean getState() {
		return state;
	}

	// asta E DACA AM UN PANOU DE LUMINI SI DOAR APAS PE BUTOANE
	public void setIntensity() {
		if (intensity < 0 || intensity > 10) {
			return;
		}

	}

	public void dim() {
		if (intensity > 0) {
			intensity--;
			if (intensity == 0) {
				turnOff();
			}
		}

	}

	public void brighten() {
		if (intensity < 10) {
			intensity++;
			if (intensity >= 1) {
				turnOn();
			}
		}
	}

	public byte getIntensity() {
		return intensity;

	}

}
