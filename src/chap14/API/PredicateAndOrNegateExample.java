package chap14.API;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args){
		IntPredicate predicateA = a -> a%2 == 0;
		
		IntPredicate predicateB = b -> b%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수 입니까? "+result);
		
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수 입니까? "+result);
		
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수 입니까? " +result);
	}
}
