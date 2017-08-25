package chap11.Exercise;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args){
		String str = "아이디, 이름, 패스워드";
		String[] words = str.split(",");
		for(String word : words){
			System.out.println(word.trim());
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token.trim());
		}
	}
}
