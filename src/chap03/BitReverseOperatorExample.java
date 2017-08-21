package chap03;

public class BitReverseOperatorExample {
	public static void main(String[] args){
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1+1;
		System.out.println(toBinayString(v1)+" (십진수 : "+v1+")");
		System.out.println(toBinayString(v2)+" (십진수 : "+v2+")");
		System.out.println(toBinayString(v3)+" (십진수 : "+v3+")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4+1;
		System.out.println(toBinayString(v4)+" (십진수 : "+v4+")");
		System.out.println(toBinayString(v5)+" (십진수 : "+v5+")");
		System.out.println(toBinayString(v6)+" (십진수 : "+v6+")");
	}
	
	public static String toBinayString(int value){
		String str = Integer.toBinaryString(value);
		while(str.length()<32){
			str = "0"+str;
		}
		return str;
	}
}
