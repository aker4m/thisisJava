package chap12.Exercise;

public class MusicRunnable2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("음악을 재생합니다.");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}

}
