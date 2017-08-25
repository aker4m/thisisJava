package chap12.StateControl;

public class ThreadD extends Thread{
	private WorkObject workObject;
	
	public ThreadD(WorkObject workObject){
		this.workObject = workObject;
	}
	
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			workObject.methodB();
		}
	}
}
