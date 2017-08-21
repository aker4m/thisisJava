package chap04;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException{
		boolean run = true;
		int speed =0;
		int keyCode = 0;
		
		while(run){
			if(keyCode!=13 && keyCode!=10){
				System.out.println("------------------------------------");
				System.out.println("1. increase | 2. decrease | 3. stop");
				System.out.println("------------------------------------");
				System.out.println("select : ");
			}
			keyCode = System.in.read();
			
			if(keyCode == 49){
				speed++;
				System.out.println("speed : "+speed);
			}else if(keyCode == 50){
				speed--;
				System.out.println("speed : "+speed);
			}else if(keyCode == 51){
				run = false;
			}
		}
		System.out.println("Program exit");
	}
}
