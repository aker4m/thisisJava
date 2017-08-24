package chap11.Objects;

import java.util.Comparator;

import chap11.Objects.CompareExample.Student;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.sno<o2.sno) return -1;
		else if(o1.sno == o2.sno) return 0;
		else return 1;
	}
	
}
