package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.List;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		Set<String> ts = new TreeSet<>();
		HashSet<String> ls = new LinkedHashSet<>();
		//SortedSet<String>ss = new LinkedHashSet<>();
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("JavaScript");
		list.add("Golang");
		list.add("Python");
		list.add("HTML");
		
		hs.addAll(list);
		ts.addAll(list);
		ls.addAll(list);
		System.out.println(hs);
		System.out.println(ts);
		System.out.println(ls);
		
	}

}
