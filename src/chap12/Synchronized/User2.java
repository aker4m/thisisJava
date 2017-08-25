package chap12.Synchronized;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator){
		setName("User2");
		this.calculator = calculator;
	}
	
	public void run(){
		calculator.setMemory(50);
	}
}
