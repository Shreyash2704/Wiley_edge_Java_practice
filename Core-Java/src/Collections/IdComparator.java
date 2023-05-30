package Collections;
import java.util.Comparator;

public class IdComparator implements Comparator<GeniusStudents> {
	
	@Override
	public int compare(GeniusStudents o1, GeniusStudents o2) {
		if(o1.id == o2.id) {
			return o1.name.compareTo(o2.name);
		}else if(o1.id > o2.id) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
