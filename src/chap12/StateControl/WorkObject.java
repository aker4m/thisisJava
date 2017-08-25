package chap12.StateControl;

public class WorkObject {
	public synchronized void methodA(){
		System.out.println("ThreadA의 method() 작업 실행");
		notify();
		
		try{
			wait();
		}catch(InterruptedException e){}
	}
	
	public synchronized void methodB(){
		System.out.println("ThreadB의 method() 작업 실행");
		notify();
		
		try{
			wait();
		}catch(InterruptedException e){}
	}
}
