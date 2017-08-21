package chap04;

public class BreakExample {
	public static void main(String[] args){
		int num;
		while(true){
			num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) break;
		}
		System.out.println("Program exit");
	}
}
