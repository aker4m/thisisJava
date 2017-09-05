package chap16.Collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args){
		List<Student> totalList = Arrays.asList(
			new Student("hong", 10, Student.Sex.MALE),
			new Student("kim", 6, Student.Sex.FEMALE),
			new Student("shin", 10, Student.Sex.MALE),
			new Student("park", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s-> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
