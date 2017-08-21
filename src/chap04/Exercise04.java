package chap04;

public class Exercise04 {
	public static void main(String[] args){
		int m=0;
		int n=0;
		int count = 0;
		while((m+n)!=5){
			m = (int)(Math.random()*6)+1;
			n = (int)(Math.random()*6)+1;
			System.out.println("("+m+", "+n+")");
			count++;
		}
		System.out.println("count : "+count);
	}
}
