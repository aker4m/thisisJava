package chap14.API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student2> list = Arrays.asList(
		new Student2("kim", "male", 90),
		new Student2("lee", "female", 90), 
		new Student2("choi", "male", 95),
		new Student2("park", "female", 92)
	);
	
	public static double avg( Predicate<Student2> predicate){
		int count=0, sum=0;
		for(Student2 student : list){
			if(predicate.test(student)){
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum /count;
	}
	
	public static void main(String[] args){
		double maleAvg = avg( t->t.getSex().equals("male"));
		System.out.println("maleAvg : "+maleAvg);
		
		double femaleAvg = avg( t->t.getSex().equals("female"));
		System.out.println("femaleAvg : "+femaleAvg);
	}
}
