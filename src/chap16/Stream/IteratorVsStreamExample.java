package chap16.Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args){
		List<String> list = Arrays.asList("hong", "shin", "kim");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name));
	}
}
