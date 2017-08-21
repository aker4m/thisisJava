package chap04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args){
		System.out.println("input message");
		System.out.println("if you quit the Program then input q");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do{
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while( !inputString.equals("q"));
		System.out.println();
		System.out.println("Program exit");
	}
}
