package chap03;

public class Exercise06 {
	public static void main(String[] args){
		int lengthTop = makeRandomLength(1, 10);
		int lengthBottom = makeRandomLength(1, 10);
		int height = makeRandomLength(1, 10);
		System.out.println("lengthTop : "+lengthTop+", lengthBottom : "+lengthBottom+", height :"+height);
		double area = (lengthTop+lengthBottom)*height/2.0;
		System.out.println(area);		
		
	}
	public static int makeRandomLength(int start, int end){
		return (int)(Math.random()*(end-start+1))+start;
	}
}
