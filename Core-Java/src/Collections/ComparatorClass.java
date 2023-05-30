package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println(o1+" "+o2);
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
public class ComparatorClass {

	public static void main(String[] args) {
		TreeSet<Integer> ss = new TreeSet<>(new MyClass());
		ss.add(2);
		ss.add(6);
		ss.add(33);
		ss.add(1);
		System.out.println(ss);
		
	}

}
