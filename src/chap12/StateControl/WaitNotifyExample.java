package chap12.StateControl;

public class WaitNotifyExample {
	public static void main(String[] args){
		WorkObject sharedObject = new WorkObject();
		
		ThreadC threadC = new ThreadC(sharedObject);
		ThreadD threadD = new ThreadD(sharedObject);
		
		threadC.start();
		threadD.start();
		
	}
}
