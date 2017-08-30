package chap12.Exercise;

public class MovieThread8 extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("동영상을 재생합니다.");
			if(Thread.interrupted()){
				break;
			}
			
		}
		System.out.println("시스템을 종료합니다.");
	}
}
