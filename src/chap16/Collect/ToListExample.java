package chap16.Collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args){
		List<Student> totalList = Arrays.asList(
			new Student("hong", 10, Student.Sex.MALE),
			new Student("kim", 6, Student.Sex.FEMALE),
			new Student("shin", 10, Student.Sex.MALE),
			new Student("park", 6, Student.Sex.FEMALE)
		);
		
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		Set<Student> femaleSet = totalList.stream()
				.filter(s ->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
