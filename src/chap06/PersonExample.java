package chap06;

public class PersonExample {
	public static void main(String[] args){
		Person p1 = new Person("123456-1234567", "kim");
		
		System.out.println("p1.nation : "+p1.nation);
		System.out.println("p1.ssn : "+p1.ssn);
		System.out.println("p1.name : "+p1.name);
		
		p1.name="park";
		//p1.nation="usa";
		//p1.ssn = "654321-7654321";
	}
}
