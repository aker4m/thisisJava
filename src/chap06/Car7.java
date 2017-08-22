package chap06;

public class Car7 {
	String model;
	int speed;
	
	Car7(String model){
		this.model = model;
	}
	
	void setSpeed(int speed){
		this.speed = speed;
	}
	
	void run(){
		for(int i=10;i<=50;i+=10){
			this.setSpeed(i);
			System.out.println(this.model+"이(가) 달립니다. (시속 : "+this.speed+"km/h)");
		}
	}
}
