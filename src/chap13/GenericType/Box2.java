package chap13.GenericType;

public class Box2<T> {
	private T t;
	public void set(T t){
		this.t= t;
	}
	public T get(){
		return t;
	}
}
