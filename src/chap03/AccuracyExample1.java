package chap03;

public class AccuracyExample1 {
	public static void main(String[] args){
		int apple = 1;
		double piece = 0.1;
		int number = 7;
		
		double result = apple - piece * number;
		System.out.println("사과 한 조각에서 0.7 조각을 빼면 : "+result);
	}
}
