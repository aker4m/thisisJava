package chap08;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run(){
		frontLeftTire.run();
		frontRightTire.run();
		backLeftTire.run();
		backRightTire.run();
	}
}
