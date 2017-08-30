package chap13.GenericType;

public class BoxExample {
	public static void main(String[] args){
		Box box = new Box();
		box.set("kim");
		String name = (String) box.get();
		System.out.println("name: "+name);
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println("apple: "+apple);
	}
}
