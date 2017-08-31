package chap14.API;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args){
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m)->m.getAddress();
		functionB = (a)->a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
			new Member("honggildong", "hong", new Address("korea", "seoul"))
		);
		System.out.println("city : "+city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
			new Member("honggildong", "hong", new Address("korea", "seoul"))
		);
		System.out.println("city : "+city);
	}
}
