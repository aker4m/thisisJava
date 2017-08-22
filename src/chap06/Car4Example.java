package chap06;

public class Car4Example {
	public static void main(String[] args){
		Car4 car1 = new Car4();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car4 car2 = new Car4("spark");
		System.out.println("car2.model : "+car2.model);
		System.out.println();
		
		Car4 car3 = new Car4("malibu", "gray");
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();
		
		Car4 car4 = new Car4("impala", "black", 300);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();
	}
}
