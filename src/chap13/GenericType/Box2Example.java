package chap13.GenericType;

public class Box2Example {
	public static void main(String[] args){
		Box2<String> boxA = new Box2<String>();
		boxA.set("hello");
		String str = boxA.get();
		System.out.println(str);
		
		Box2<Integer> boxB = new Box2<Integer>();
		boxB.set(6);
		int value = boxB.get();
		System.out.println(value);
	}
}
