package Lambda;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {
	private static HashMap<Integer,String> emp = new HashMap<>();
	
	public static void add(String name, int id) {
		if(!emp.containsKey(id)) {
			emp.put(id,name);
			System.out.println("Employee added");
		}
		else {
			System.out.println("Employee already exist");
		}
		
	}
	
	public static void main(String[] args) {
		//in Function interface integer type is accepted and String is returned.
		Function<Integer, String> get = (Integer id)->{
			if(emp.containsKey(id)) {
				return emp.get(id);
			}
			else return "Invalid ID";
		};
		
		add("Shreyash",1);
		add("Janvi",2);
		add("rishav",3);
		
		//Function interface have apply() abstract method whic accept integer as parameter.
		//return String as defined in Function interface.
		System.out.println(get.apply(2));
	}
}
