package oop2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import automation.Circle;

public class Test_List {

	public static void main(String[] args) {
		parameterList();
		Browser b = Browser.FIREFOX;
		String browserStr = b.name();
		System.out.println(b.ordinal());

	}

	public static void parameterList() {
		// este ok sa declaram listele cu tipul lor....ex String/int....
		List<String> list = new ArrayList<String>();
		List<Circle> listCircle = new ArrayList<Circle>(2);// asa se optimizeaza dimensiunea alocata, dar lista ramane dinamica
		list.add("list element");
		list.add("another list element");
		list.add("7");

		list.get(0)
				.concat("test");

		System.out.println(listCircle.size());

		Circle circle = new Circle();
		circle.setcolor("Blue");
		listCircle.add(circle);

		System.out.println(listCircle.size());

		Circle circle1 = new Circle();
		circle1.setcolor("Black");
		listCircle.add(circle1);
		// System.out.println(listCircle.get(1));// am suprascris in Circle methoda toString...pt a afica ceva default
		// listCircle.remove(1);

		System.out.println(listCircle.size());

		Circle circle2 = new Circle();
		circle2.setcolor("Green");
		listCircle.add(circle2);// lista va contine 2 cercuri dar 8 pozitii
		System.out.println(listCircle.size());

		Circle circle3 = new Circle();
		circle3.setcolor("Green");
		listCircle.add(circle3);// lista va contine 2 cercuri dar 8 pozitii
		System.out.println(listCircle.size());

		listCircle.add(1, circle3);// se inlocuieste cercul de pe pozitia 1 cu circle3
	}

	public static void rawList() {
		// nu este good practice sa declaram asa o lista...de tipul object
		List list = new ArrayList();
		list.add("list element");
		list.add("another list element");
		list.add(7);// aici 7 e int, nu este string
		list.add(new Circle());

		// asa verific daca o variabila este de un anumit tip
		Object thirdElement = list.get(3);

		if (thirdElement instanceof String) {
			String firstElement = (String) list.get(0);
			String firstSub = firstElement.substring(2);
			System.out.println(firstSub);
		} else {
			System.out.println("Un mesaj");
		}

		// Object firstElement = list.get(0);
		String secondElement = (String) list.get(1);// ---cast la string
		// String firstElement = (String) list.get(3); arunca exceptie pt ca Circle nu e de tip String
		// firstElement.METHODS from String
		System.out.println(secondElement);
		// System.out.println((String) firstElement);

	}

	public static void doSomething() {
		HashSet<String> set = new HashSet<String>();
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		List<String> l = new LinkedList<String>();

		// set urile nu accepta duplicate!!!
		// HashSet nu garanteaza ordinea de inserat elemente
		// Linked garanteaza ordinea de inserat elemente
		// la lista get se face mai repede, pe cand linkedlist este mai performag la add/remove
		// moduri de a parcurge o lista/set...
		for (String d : l) {
			System.out.println(d);
		}

		Iterator<String> it = set.iterator();
		it.next();

		for (String g : set1) {
			System.out.println(g);
		}
	}

	// daca vreau sa vad ce tipuri de liste/set...sunt in Java ma duc pe List +F4
	public static void testMap() {
		//

		// Map map = new HashMap(); asa nu e recomandat
		// HashMap map1 = new HashMap(); asa nu e recomandat
		// Map<Integer, String> map2 = new HashMap<>(); asa e recomandat, are Integer/String

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "value 1");
		map1.put(2, "value 2");
		String element = map1.get(1);

		// obtinerea valorilor se face prin cheie, exact cum este scris
		// cheile sunt unice
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("key1", "value 1");
		map2.put("key2", "value 2");
		String element1 = map2.get("key1");

		// key iterator
		Iterator<Integer> iterator = map1.keySet()
				.iterator();
		// value iterator
		Iterator<String> iterator2 = map1.values()
				.iterator();

		map2.remove("key1");
		System.out.println(map2.get("key1"));// afiseaza null
	}

}
