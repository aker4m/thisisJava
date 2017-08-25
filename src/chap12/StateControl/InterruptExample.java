package chap12.StateControl;

public class InterruptExample {
	public static void main(String[] args){
		Thread thread2 = new PrintThread2();
		Thread thread3 = new PrintThread3();
		thread2.start();
		thread3.start();
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		
		thread2.interrupt();
		thread3.interrupt();
	}
}
