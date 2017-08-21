package chap03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args){
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		//double z1 = x%y;
		
		System.out.println("is it infinity? "+Double.isInfinite(z));
		System.out.println("is it NaN? "+Double.isNaN(z));
		System.out.println(z+2);
	}
}
