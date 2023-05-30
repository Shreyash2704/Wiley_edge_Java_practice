package Generics;

import java.util.ArrayList;
import java.util.List;

class Cat<T>{
	public Cat() {
		super();
		System.out.println("Cat class");
	}
}
public class GenericClass {
	public static void main(String[] args) {
		Printer p = new Printer("Shreyash");
		p.print();
		
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		
		for(Cat c:cats) {
			System.out.println(c);
		}
		
     	shout("Helloo",true);
//		shout(new Cat());
//		shout(10.2f);
//		shout(true);
		
		
	}
	private static <T,V> void shout(T shoutOut,V val) {
		System.out.println(shoutOut);
		System.out.println(val);
	}
	private static <T,V> T returnany(T shoutOut,V val) {
		System.out.println(shoutOut);
		System.out.println(val);
		return shoutOut;
	}
	
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}
}
