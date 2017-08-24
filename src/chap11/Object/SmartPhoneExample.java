package chap11.Object;

public class SmartPhoneExample {
	public static void main(String[] args){
		SmartPhone myPhone = new SmartPhone("apple", "ios");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
	}
}
