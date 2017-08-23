package chap07;

public class CarArray {
	Tire[] tires = new Tire[]{
		new Tire("frontLeft", 6),
		new Tire("frontRight", 2),
		new Tire("backLeft", 3),
		new Tire("backRight",4)
	};
	
	int run(){
		System.out.println("Car is running...");
		int num=0;
		for(int i=0;i<tires.length;i++){
			if(tires[i].roll()==false){
				stop();
				num = (i+1);
			}
		}
		return num;
	}
	void stop(){
		System.out.println("Car is stoped");
	}
}
