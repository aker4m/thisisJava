package chap09;

public class Anonymous {
	Person field = new Person(){
		void work(){
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1(){
		Person localVariable = new Person(){
			void walk(){
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVariable.wake();
	}
	void method2(Person person){
		person.wake();
	}
}
