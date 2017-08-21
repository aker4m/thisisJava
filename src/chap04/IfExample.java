package chap04;

public class IfExample {
	public static void main(String[] args){
		int score = (int)(Math.random()*20)+81;
		System.out.println(score);
		
		if(score>=90){
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score<90){
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}
}
