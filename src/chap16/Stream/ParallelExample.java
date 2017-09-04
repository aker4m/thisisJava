package chap16.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args){
		List<String> list = Arrays.asList(
			"hong", "shin", "kim", "lambda", "park"
		);
		
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		System.out.println();
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	public static void print(String str){
		System.out.println(str+" : "+Thread.currentThread().getName());
	}
}
