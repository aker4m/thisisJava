package chap13.GenericMethod;

public class CompareMethodExample {
	public static void main(String[] args){
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "apple");
		
		boolean result1 = Util2.<Integer, String>compare(p1, p2);
		if(result1){
			System.out.println("논리적으로 동등한 객체입니다.");
		}else{
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1", "kim");
		Pair<String, String> p4 = new Pair<String, String>("user2", "kim");
		
		boolean result2 = Util2.<String, String>compare(p3, p4);
		if(result2){
			System.out.println("논리적으로 동등한 객체입니다.");
		}else{
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
	}
}
