package automation.oop;

public class Array {

	public static void main(String[] args) {

		Light[] lights = { new Light(), new Light() };

		System.out.println(lights.length);
		Light light = lights[1];
		light.brighten();
		System.out.println(light.getIntensity());
		// -------------------------------------

		Light[] lightsNew = new Light[2];

		lightsNew[1] = new Light();
		System.out.println(lightsNew.length);
		System.out.println(lightsNew[1].getIntensity());

		for (int i = 0; i < lights.length; i++) {
			System.out.println(lights[i].getState());
		}
	}

}
