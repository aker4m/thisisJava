package chap16.Stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args){
		List<Student> studentList = Arrays.asList(
			new Student("hong", 10),
			new Student("shin", 20),
			new Student("yu", 30)
		);
		
		double avg = studentList.stream()
				.mapToInt(Student :: getScore)
				.average()
				.getAsDouble();
		
		System.out.println("avg : "+avg);
		
	}
}
