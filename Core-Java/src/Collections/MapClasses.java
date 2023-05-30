package Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ss = new HashMap<String,String>();
		
		ss.put("ann", "A");
		ss.put("b", "B");
		ss.put("ani", null);
		ss.put(null, null);
		ss.putIfAbsent("a", "A");
		ss.putIfAbsent("a", "Ab");
		System.out.println(ss.containsKey("A"));
		System.out.println(ss.containsKey("a"));
		
		
		Map myMap = new LinkedHashMap<>();
		myMap.put(1, "One");
		myMap.put("a", "AAAA");
		System.out.println(myMap);
		
	}

}
