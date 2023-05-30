package Collections;

import java.util.LinkedList;

public class LinkedlistClass {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Shre");
		names.add("Yasd");
		names.add("Hello");
		names.add("Hello");
		names.add(null);
		
		System.out.println(names.remove());
		System.out.println(names);
	}

}
