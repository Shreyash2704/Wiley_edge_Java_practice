package Collections;

import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1000, "venkat");
		tmap.put(2000, "shryash");
		tmap.put(4000, "rishav");
		tmap.put(200, "sachin");
		tmap.put(12000, "jnvi");
		tmap.put(2200, "ssss");
		System.out.println(tmap.higherKey(2000));
		System.out.println(tmap.lowerKey(200));
		System.out.println(tmap);
		System.out.println(tmap.tailMap(4000));
		System.out.println(tmap.headMap(4000).keySet());
		System.out.println(tmap.firstKey());
		tmap.forEach((k,v) ->{
			System.out.println(k+":"+v);
		});
		
	}

}
