package chap05;

import java.util.Random;

public class EnumMethodExample {
	public static void main(String[] args){
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("today : "+today);
		
		int ordinal = today.ordinal();
		System.out.println("ordinal : "+ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		Week[] days = Week.values();
		for(Week day : days){
			System.out.println("day : "+day);
		}
		
		Week weekDay = getRandomWeek();
		System.out.println(weekDay);
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY){
			System.out.println("주말 입니다.");
		}else{
			System.out.println("평일 입니다.");
		}
		
		String strDay = "SUNDAY";
		weekDay = Week.valueOf(strDay);
		System.out.println("weekDay : "+weekDay);
		
	}
	public static Week getRandomWeek(){
		Random random = new Random();
		return Week.values()[random.nextInt(Week.values().length)];
	}
}
