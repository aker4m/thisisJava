package chap11.String;

public class StringReplaceExample {
	public static void main(String[] args){
		String oldStr = "자바는 객체지향언어 입니다. 자바는(은) 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "Python");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
