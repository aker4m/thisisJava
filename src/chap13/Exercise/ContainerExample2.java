package chap13.Exercise;

public class ContainerExample2 {
	public static void main(String[] args){
		Containers<String> container1 = new Containers<String>();
		container1.set("kim");
		String str = container1.get();
		
		Containers<Integer> container2 = new Containers<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
