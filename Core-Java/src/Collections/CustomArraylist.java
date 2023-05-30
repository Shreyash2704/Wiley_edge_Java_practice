package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class CustomArraylist extends ArrayList {

	@Override
	public boolean add(Object element) {
		if(this.contains(element)) {
			return true;
		}
		else {
			return super.add(element);
		}
			}
	
	public static void main(String[] args) {
		CustomArraylist list = new CustomArraylist();
		list.add("hello");
		list.add(1);
		list.add("hello");
		list.add(1);
		//System.out.println(list);
		
		List<GeniusStudents> setStudents = new ArrayList<>();
		setStudents.add(new GeniusStudents(110, "Shreyash03",2000));
		setStudents.add(new GeniusStudents(102, "Shreyash01",3000));
		setStudents.add(new GeniusStudents(103, "Shreyash03",4000));
		setStudents.add(new GeniusStudents(103, "Shreyash02",5000));
		
		Collections.sort(setStudents, new IdComparator());
		System.out.println(setStudents);
		
	}

}
