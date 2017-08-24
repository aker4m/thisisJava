package chap09;

public class Outter2 {
	String field = "Outter2-field";
	void method(){
		System.out.println("Outter2-method");
	}
	class Nested{
		String field = "Nested-field";
		void method(){
			System.out.println("Nested-method");
		}
		void print(){
			System.out.println(this.field);
			this.method();
			System.out.println(Outter2.this.field);
			Outter2.this.method();
		}
	}
}
