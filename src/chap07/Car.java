package chap07;

public class Car {
	Tire frontLeftTire = new Tire("frontLeft", 6);
	Tire frontRightTire = new Tire("frontRight", 2);
	Tire backLeftTire = new Tire("backLeft", 3);
	Tire backRightTire = new Tire("backRight", 4);
	
	int run(){
		int num=0;
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false){stop(); num = 1;}
		if(frontRightTire.roll()==false){stop(); num = 2;}
		if(backLeftTire.roll()==false){stop(); num = 3;}
		if(backRightTire.roll()==false){stop(); num = 4;}
		return num;
	}
	void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
