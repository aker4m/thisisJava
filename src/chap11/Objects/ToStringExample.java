package chap11.Objects;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args){
		String str1 = "kim";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}
