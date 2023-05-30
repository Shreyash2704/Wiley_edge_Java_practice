package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("d");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//list.add("c");
		}
		System.out.println("---");
		
		Map<Integer,String> mymap = new HashMap<>();
		mymap.put(1, "Java");
		
		Iterator it = mymap.keySet().iterator();
		int c = 2;
		while(it.hasNext()) {
			Integer el = (Integer) it.next();
			System.out.println(el);
			mymap.put(c, "Python");
			c++;
		}
		System.out.println(mymap);
	}

}
