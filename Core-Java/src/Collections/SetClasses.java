package Collections;

import java.util.TreeSet;

public class SetClasses {
    public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		//ts.add("hkdjen");
		//ts.add("c");
		//ts.add("b");
		ts.add("aaaa");
		ts.add("aaaa");
		//ts.add("ywdwdwd");
		
		
		//System.out.println(s.substring(2,4));
//		System.out.println(ts);
//		System.out.println(ts.first());
//		System.out.println(ts.last());
//		//System.out.println(ts.headSet("w"));
//		//System.out.println(ts.tailSet("b"));
//		System.out.println(ts.subSet("a","w"));
//		System.out.println(ts.descendingSet());
		String obj1 = ts.first();
		String obj2 = ts.last();
		System.out.println(ts);
		System.out.println(obj1+":"+obj2+":"+obj2.compareTo(obj1));
	}
}
