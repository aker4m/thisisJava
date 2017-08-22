package chap06;

public class Car3Example {
	public static void main(String[] args){
		Car3 car1 = new Car3();
		System.out.print("car1.company : "+car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("sonata");
		System.out.println("car2.model : "+car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("avante", "black");
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("taxi", "red", 200);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		
	}
}
