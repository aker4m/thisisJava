package chap03;

public class LogicalOperatorExample {
	public static void main(String[] args){
		int charCode = (int)(Math.random()*75)+48;
		System.out.println(charCode);
		System.out.println((char)charCode);
		
		if((charCode>=65) & (charCode<=90)){
			System.out.println("a capital letter");
		}
		if((charCode>=97) && (charCode<=122)){
			System.out.println("small letter");
		}
		if(!(charCode<48) && !(charCode>57)){
			System.out.println("number");
		}
		
		int value = (int)(Math.random()*100)+1;
		System.out.println(value);
		
		if((value%2==0) | (value%3)==0 ){
			System.out.println("2 또는 3의 배수");
		}
		
	}
}
