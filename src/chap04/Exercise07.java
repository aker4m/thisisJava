package chap04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args){
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int select;
		int money;
		
		while(run){
			System.out.println("----------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			select = scanner.nextInt();
			
			if(select == 1){
				while(true){
					System.out.println("예금액> ");
					money = scanner.nextInt();
					if(money>0){
						break;
					}
					System.out.println("올바른 값을 입력하세요");
				}
				balance+=money;
			}else if(select == 2){
				while(true){
					System.out.println("출금액> ");
					money = scanner.nextInt();
					if(money>0){
						break;
					}
					System.out.println("올바른 값을 입력하세요");
				}
				balance-=money;
			}else if(select == 3){
				System.out.println("잔고> "+balance);
			}else if(select == 4){
				run = false;
			}else{
				System.out.println("올바른 값을 입력하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
