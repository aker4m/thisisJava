package chap11.Exercise;

public class StringBuilderExample {
	public static void main(String[] args){
		long time1 = System.nanoTime();
		String str = "";
		for(int i=1;i<=1000;i++){
			str +=i;
		}
		System.out.println(str);
		long time2 = System.nanoTime();
		long result1 = time2-time1;
		
		time1 = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=1000;i++){
			sb.append(i);
		}
		System.out.println(sb.toString());
		time2 = System.nanoTime();
		long result2 = time2-time1;
		System.out.println("String 계산에 " +result1+" 나노초가 소요되었습니다.");
		System.out.println("String Builder 계산에 " +result2+" 나노초가 소요되었습니다.");		
	}
}
