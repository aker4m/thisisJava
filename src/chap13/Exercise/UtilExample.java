package chap13.Exercise;

public class UtilExample {
	public static void main(String[] args){
		Pair<String, Integer> pair = new Pair<>("kim", 35);
		Integer age = Util.getValue(pair, "kim");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("lee", 20);
		Integer childAge = Util.getValue(childPair, "choi");
		System.out.println(childAge);
		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("lee", 20);
		int otherAge = Util.getValue(otherPair, "lee");
		System.out.println(otherAge);
		*/
	}
}
