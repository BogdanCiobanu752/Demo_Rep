package automation.oop1;

public class Swimmer extends Human {
	Talker talker = new Talker();
	Walker walker = new Walker();

	public String swim() {
		return "Swim";
	}
}
