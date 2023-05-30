package Collections;

import java.util.ArrayList;
import java.util.Objects;

public class GeniusStudents extends ArrayList implements Comparable<GeniusStudents>{
    Integer id;
    String name;
    double salary;
    
    public GeniusStudents(Integer id, String name,double salary) {
    	super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return id+"-"+name+"-"+salary;
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id, name, salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeniusStudents other = (GeniusStudents) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public int compareTo(GeniusStudents o) {
		if(id == o.id) {
			return 0;
		}
		else if(id > o.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
    
    
}
