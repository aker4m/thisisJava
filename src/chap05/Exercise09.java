package chap05;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args){
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1){
				while(true){
					System.out.print("학생수>");
					studentNum = scanner.nextInt();
					if(studentNum>0){
						scores = new int[studentNum];
						break;
					}
					printError();
				}
			}else if(selectNo == 2){
				if(scores!=null){
					for(int i=0;i<scores.length;i++){
						while(true){
							System.out.print("scores["+i+"] : ");
							scores[i] = scanner.nextInt();
							if(scores[i]>0) break;
							printError();
						}
					}
					System.out.println("입력을 완료하였습니다.");
				}else{
					System.out.println("학생수를 먼저 입력하세요");
				}
				
			}else if(selectNo == 3){
				if(scores!=null && scores.length>0){
					for(int i=0;i<scores.length;i++){
						System.out.println("scores["+i+"] : "+scores[i]);
					}
				}else{
					System.out.println("점수를 먼저 입력하세요");
				}
				
			}else if(selectNo == 4){
				int sum = 0;
				int max = 0;
				if(scores!=null && scores.length>0){
					for(int i=0;i<scores.length;i++){
						if(max<scores[i]){
							max = scores[i];
						}
						sum += scores[i];
					}
					System.out.println("max : "+max);
					System.out.println("sum : "+sum);
				}else{
					System.out.println("점수를 먼저 입력하세요");
				}
				
			}else if(selectNo == 5){
				run = false;
			}else{
				printError();
			}
		}
		System.out.println("프로그램 종료");
	}
	public static void printError(){
		System.out.println("잘못 입력하였습니다");
	}
}
