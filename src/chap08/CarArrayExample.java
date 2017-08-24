package chap08;

public class CarArrayExample {
	public static void main(String[] args){
		CarArray myCar = new CarArray();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
