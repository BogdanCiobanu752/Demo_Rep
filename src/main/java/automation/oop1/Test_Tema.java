package automation.oop1;

public class Test_Tema {

	public static void main(String[] args) {

		Human human = new Human();
		Swimmer swimmer = new Swimmer();
		Talker talker = new Talker();
		Walker walker = new Walker();

		System.out.println("The Human can " + human.breathe());

		System.out.println("The Talker can " + talker.breathe() + " and " + talker.talk());
		System.out.println("The Walker can " + walker.breathe() + " and " + walker.walk());

		System.out.println("The Swimmer can " + swimmer.breathe() + " and " + swimmer.swim() + " and " + swimmer.talker.talk()
				+ " and " + swimmer.walker.walk());
	}

}
