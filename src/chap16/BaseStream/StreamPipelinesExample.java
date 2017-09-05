package chap16.BaseStream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args){
		List<Member> list = Arrays.asList(
			new Member("hong", Member.MALE, 30),
			new Member("kim", Member.FEMAIL, 20),
			new Member("shin", Member.MALE, 45),
			new Member("park", Member.FEMAIL, 27)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("ageAvg : "+ageAvg);
		
	}
}
