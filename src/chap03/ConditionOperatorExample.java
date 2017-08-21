package chap03;

public class ConditionOperatorExample {
	public static void main(String[] args){
		int score =(int)(Math.random()*30)+71;
		char grade = (score >90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(score + "점은 "+grade+" 등급입니다.");
	}
}
