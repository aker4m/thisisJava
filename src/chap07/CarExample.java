package chap07;

public class CarExample {
	public static void main(String[] args){
		Car car = new Car();
		
		for(int i=0;i<5;i++){
			int problemLocation = car.run();
			
			switch(problemLocation){
			case 1:
				System.out.println("frontLeft HankookTire exchange");
				car.frontLeftTire = new HankookTire("frontLeft", 15);
				break;
			case 2:
				System.out.println("frontRight KumhoTire exchange");
				car.frontRightTire = new KumhoTire("frontRight", 13);
				break;
			case 3:
				System.out.println("backLeft HankookTire exchange");
				car.backLeftTire = new HankookTire("backLeft", 14);
				break;
			case 4:
				System.out.println("backRight KumhoTire exchange");
				car.backRightTire = new KumhoTire("backRight", 17);
			}
			System.out.println("------------------------------------------");
		}
	}
}
