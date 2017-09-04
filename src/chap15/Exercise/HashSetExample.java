package chap15.Exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args){
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "hong"));
		set.add(new Student(2, "shin"));
		set.add(new Student(1, "cho"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()){
			Student student = iterator.next();
			System.out.println(student.studentNum+" : "+student.name);
		}
	}
}
