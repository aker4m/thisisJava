package chap12.Exercise;

public class ThreadExample10 {
	public static void main(String[] args){
		Thread thread = new MovieThread10();
		thread.setDaemon(true);
		thread.start();
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){}
	}
}
