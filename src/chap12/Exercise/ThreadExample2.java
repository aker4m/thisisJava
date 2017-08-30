package chap12.Exercise;

public class ThreadExample2 {
	public static void main(String[] args){
		Thread thread1 = new MovieThread2();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable2());
		thread2.start();
	}
}
