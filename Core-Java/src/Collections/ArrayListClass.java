package Collections;

import java.util.ArrayList;
import java.util.List;

import java.util.Enumeration;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shre");
		al.add("yeash");
		System.out.println(al);
		
		
		
		ListIterator<String> listIterator = al.listIterator();
		
		
		while (listIterator.hasNext()) {
			String fruit = (String) listIterator.next();
			System.out.println(fruit);
		}
		while (listIterator.hasPrevious()) {
			String fruit = (String) listIterator.previous();
			System.out.println(fruit);
		}
		
		// create arraylist object
		ArrayList<Integer> firstFivePrimeNumbers  = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		System.out.println(firstFivePrimeNumbers);
		ArrayList<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		ArrayList<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		//nextFivePrimeNumbers.add(null);
			
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		//Enumeration<Integer> en = firstTenPrimeNumbers.e
//		ListIterator<Integer> listr = firstTenPrimeNumbers.listIterator(firstTenPrimeNumbers.size());
//		while(listr.hasPrevious()) {
//			System.out.println(listr.previous());
//		}
//		
		
		final List<String> arr = new ArrayList<String>();
		System.out.println("-----------------");
		arr.add("Shreyash");
		arr.set(0, "Sahil");
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		
	}

}
