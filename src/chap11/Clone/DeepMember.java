package chap11.Clone;

import java.util.Arrays;

public class DeepMember implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public DeepMember(String name, int age, int[] scores, Car car){
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepMember cloned = (DeepMember)super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public DeepMember getDeepMember(){
		DeepMember cloned = null;
		try{
			cloned = (DeepMember) clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return cloned;
	}
	
}
