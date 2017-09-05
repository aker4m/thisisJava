package chap16.Mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args){
		List<Student> studentList = Arrays.asList(
			new Student("hong", 10), 
			new Student("shin", 20),
			new Student("yu", 30)
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}
}
