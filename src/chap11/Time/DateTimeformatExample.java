package chap11.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeformatExample {
	public static void main(String[] args){
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeformatter);
		System.out.println(nowString);
				
	}
}
