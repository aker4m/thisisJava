package chap07.Abstract;

public class PhoneExample {
	public static void main(String[] args){
		SmartPhone smartPhone = new SmartPhone("kim");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
