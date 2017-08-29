package chap14.FunctionalInterface;

public class MyFunctionalInterface3Example {
	public static void main(String[] args){
		MyFunctionalInterface3 fi;
		
		fi = (x) -> {
			int result = x*5;
			System.out.println("result : "+result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x * 5); };
		fi.method(2);
		
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}
