package chap13.Exercise;

public class ContainerExample3 {
	public static void main(String[] args){
		Container<String, String> container1 = new Container<String, String>();
		container1.set("kim", "thief");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("park", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}
