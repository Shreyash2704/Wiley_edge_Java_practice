package Assignments;

import java.util.Comparator;


public class GradeComparator  implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
			if(o1.problem_solved == o2.problem_solved) {
				return o1.grade.compareTo(o2.grade);
			}else if(o1.problem_solved > o2.problem_solved) {
				return -1;
			}
			else {
				return 1;
			}
		
	}
}
