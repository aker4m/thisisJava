package chap16.Parallel;

import java.util.Arrays;
import java.util.List;

import chap16.Collect.MaleStudent;
import chap16.Collect.Student;

public class MaleStudentExample {
	public static void main(String[] args){
		List<Student> totalList = Arrays.asList(
			new Student("hong", 10, Student.Sex.MALE),
			new Student("kim", 10, Student.Sex.FEMALE),
			new Student("shin", 10, Student.Sex.MALE),
			new Student("park", 10, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.parallelStream()
			.filter(s -> s.getSex() == Student.Sex.MALE)
			.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
