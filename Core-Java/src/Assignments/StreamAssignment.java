package Assignments;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Collections.GeniusStudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student>{
	String name;
	int id;
	int problem_solved;
	Integer grade;
	
	Student(int id,String name,int ps,int g){
		this.id = id;
		this.name = name;
		this.problem_solved = ps;
		this.grade = g;
	}
	
	public void setGrade(int g) {
		this.grade = g;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"-"+this.name+"-"+this.problem_solved+"-"+this.grade;
	}

	@Override
	public int compare(Student o1, Student o2) {
			if(o1.problem_solved == o2.problem_solved) {
				return o1.grade.compareTo(o2.grade);
			}else if(o1.problem_solved > o2.problem_solved) {
				return 1;
			}
			else {
				return -1;
			}
		
	}
	
	
}


public class StreamAssignment {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Sam",33,50);
		Student s2 = new Student(2,"Max",45,60);
		Student s3 = new Student(3,"Ram",69,70);
		Student s4 = new Student(4,"Mike",87,80);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(new Student(5,"Lucy",23,40));
		list.add(new Student(6,"Josh",93,89));
		list.add(new Student(7,"Matt",63,70));
		list.add(new Student(8,"Lucy",51,40));
		
		System.out.println(list);
		list.stream().filter(n-> n.problem_solved > 50).forEach(n -> n.setGrade(n.grade+10));
		
		System.out.println(list);
		Collections.sort(list, new GradeComparator());
		
		List<Student> filtered = list.stream().limit(5).collect(Collectors.toList());
		
		filtered.forEach(ele ->{
			System.out.println(ele.name+" "+ele.grade);
		});
		
		
	}

}
