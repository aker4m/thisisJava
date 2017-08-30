package chap12.Exercise;

public class ThreadExample8 {
	public static void main(String[] args){
		Thread thread = new MovieThread8();
		thread.start();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		
		thread.interrupt();
	}
}
