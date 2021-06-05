package oop2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import automation.Circle;

public class TestMap {

	public static void main(String[] args) {

		testMap();
	}

	public static void testMap() {

		Circle circle = new Circle();
		Circle circle1 = new Circle();

		Map<Integer, Circle> map1 = new HashMap<Integer, Circle>();

		map1.put(100, circle);
		map1.put(222, circle1);

		System.out.println(map1.get(100));
		System.out.println(map1.get(222));

		map1.replace(222, null);
		System.out.println(map1.get(222));

		map1.put(222, circle1);
		System.out.println(map1.get(222));

		Collection<Circle> collection = map1.values();
		System.out.println(collection.size());

		Iterator<Integer> iterator = map1.keySet()
				.iterator();

		while (iterator.hasNext()) {
			int key = iterator.next();
			Circle value = map1.get(key);

			System.out.println("Circle " + value);
		}
	}

}
