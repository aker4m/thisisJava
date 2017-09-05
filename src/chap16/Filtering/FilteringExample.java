package chap16.Filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args){
		List<String> names = Arrays.asList("hong", "shin", "kim", "shin", "shin2");
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("shin"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("shin"))
			.forEach(n -> System.out.println(n));
	}
}
