package chap11.Clone;

public class DeepMemberExample {
	public static void main(String[] args){
		DeepMember original = new DeepMember("kim", 25, new int[] {90, 85}, new Car("sonata"));
		
		DeepMember cloned = original.getDeepMember();
		cloned.scores[0]=100;
		cloned.car.model="avante";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : "+cloned.name);
		System.out.println("age : "+cloned.age);
		System.out.print("scores : { ");
		for(int i=0;i<cloned.scores.length;i++){
			System.out.print(cloned.scores[i]);
			System.out.print(i==(cloned.scores.length-1) ? "":", ");
		}
		System.out.println(" }");
		System.out.println("car : "+cloned.car.model);
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : "+original.name);
		System.out.println("age : "+original.age);
		System.out.print("scores : { ");
		for(int i=0;i<original.scores.length;i++){
			System.out.print(original.scores[i]);
			System.out.print(i==(original.scores.length-1) ? "":", ");
		}
		System.out.println(" }");
		System.out.println("car : "+original.car.model);
	}
}
