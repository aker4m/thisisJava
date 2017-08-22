package chap06;

public class Calculator3Example {
	public static void main(String[] args){
		Calculator3 myCalc = new Calculator3();
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
	}
}
