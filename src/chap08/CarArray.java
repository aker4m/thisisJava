package chap08;

public class CarArray {
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run(){
		for(Tire tire : tires){
			tire.run();
		}
	}
}
